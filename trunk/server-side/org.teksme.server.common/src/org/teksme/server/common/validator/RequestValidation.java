package org.teksme.server.common.validator;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.teksme.model.teks.Response;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.server.common.utils.TeksModelHelper;

public class RequestValidation implements Validator {

	private static Logger logger = Logger.getLogger(RequestValidation.class.getName());

	public static final RequestValidation INSTANCE = new RequestValidation();

	public Map<Object, Object> createDefaultContext() {
		Map<Object, Object> context = new HashMap<Object, Object>();
		context.put(Validator.PatternMatcher.class, this);
		context.put(Validator.class, this);
		return context;
	}

	public BasicScreening createScreening(ErrorDictionary errorDictionary) {
		return new BasicScreening(Validator.DIAGNOSTIC_SOURCE, errorDictionary.getStatus(), errorDictionary.getCode(),
				errorDictionary.getMessage(), errorDictionary.getMoreInfo(), null);
	}

	public BasicScreening createScreening(ErrorDictionary errorDictionary, Object data[]) {
		return new BasicScreening(Validator.DIAGNOSTIC_SOURCE, errorDictionary.getStatus(), errorDictionary.getCode(),
				errorDictionary.getMessage(), errorDictionary.getMoreInfo(), data);
	}

	public BasicScreening createDefaultScreening(HttpServletRequest request) {
		return new BasicScreening(Validator.DIAGNOSTIC_SOURCE, 0, Messages.getString("diagnostic.root",
				new Object[] { request.getRemoteAddr() }), new Object[] { request });
	}

	/**
	 * Validates the object and produces diagnostics, based on a HTTP request
	 * object
	 * 
	 * @param request
	 *            the <source>HttpServletRequest</source> object to validate.
	 * @return whether the object is valid.
	 */
	public Screening validate(HttpServletRequest request) throws IOException {
		BasicScreening screening = createDefaultScreening(request);
		validate(request, screening, createDefaultContext());
		return screening;
	}

	/**
	 * Validates the object in the given context and produces diagnostics, based
	 * on a HTTP request object
	 * 
	 * @param request
	 *            the <source>HttpServletRequest</source> object to validate.
	 * @param contextEntries
	 *            the context map
	 * @return whether the object is valid.
	 */
	public Screening validate(HttpServletRequest request, Map<?, ?> contextEntries) throws IOException {
		BasicScreening screening = createDefaultScreening(request);
		Map<Object, Object> context = createDefaultContext();
		context.putAll(contextEntries);
		validate(request, screening, context);
		return screening;
	}

	public boolean validate(HttpServletRequest request, ScreeningChain diagnostics, Map<Object, Object> context) {

		String method = request.getMethod();
		boolean valid = true;
		try {
			if (method.toUpperCase().equals("GET")) {
				valid = doGetValidate(request, diagnostics, context);
			} else if (method.toUpperCase().equals("POST")) {
				valid = doPostValidate(request, diagnostics, context);
			}
		} catch (IOException ioe) {
			return handleIOException(ioe, diagnostics);
		}

		return valid;
	}

	private boolean handleIOException(IOException ioe, ScreeningChain diagnostics) {
		Matcher m = null;

		final String errorMessage = ioe.getMessage();

		logger.log(Level.WARNING, errorMessage);

		m = RegexErrorMessagePatterns.getInvalidBOFXMLDeclarationPattern().matcher(errorMessage);
		if (m.find()) {
			diagnostics.add(createScreening(ErrorDictionary.WRONG_BOF_XML_DECLARATION));
			return false;
		}

		m = RegexErrorMessagePatterns.getInvalidXMLSchemaPattern().matcher(errorMessage);
		if (m.find()) {
			diagnostics.add(createScreening(ErrorDictionary.INVALID_ASSOCIATED_XML_SCHEMA));
			return false;
		}

		m = RegexErrorMessagePatterns.getPrematureEOFPattern().matcher(errorMessage);
		if (m.find()) {
			diagnostics.add(createScreening(ErrorDictionary.MALFORMED_XML_FILE));
			return false;
		}

		m = RegexErrorMessagePatterns.getInvalidXMLBeginningElementPattern().matcher(errorMessage);
		if (m.find()) {
			diagnostics.add(createScreening(ErrorDictionary.INVALID_XML_BEGINNING_ELEMENT));
			return false;
		}

		m = RegexErrorMessagePatterns.getMissingXMLClosingTagElementPattern().matcher(errorMessage);
		if (m.find()) {
			diagnostics.add(createScreening(ErrorDictionary.XML_CLOSING_TAG_IS_MISSING));
			return false;
		}

		m = RegexErrorMessagePatterns.getInvalidXMLElementPattern().matcher(errorMessage);
		if (m.find()) {
			diagnostics.add(createScreening(ErrorDictionary.INVALID_XML_ELEMENT, new Object[] { m.group(2) }));
			return false;
		}

		m = RegexErrorMessagePatterns.getInvalidXMLRootElementPattern().matcher(errorMessage);
		if (m.find()) {
			diagnostics.add(createScreening(ErrorDictionary.INVALID_ROOT_ELEMENT));
			return false;
		}

		m = RegexErrorMessagePatterns.getMissingEqualSignForAttrPattern().matcher(errorMessage);
		if (m.find()) {
			diagnostics.add(createScreening(ErrorDictionary.ATTR_MUST_BE_FOLLOWED_BY_EQUALS_SIG, new Object[] { "'" + m.group(2) + "'",
					"'" + m.group(3) + "'" }));
			return false;
		}

		m = RegexErrorMessagePatterns.getMissingQuotesForAttrPattern().matcher(errorMessage);
		if (m.find()) {
			diagnostics.add(createScreening(ErrorDictionary.MISSING_ATTR_QUOTES, new Object[] { "'" + m.group(2).split("\"")[3] + "'" }));
			return false;
		}

		m = RegexErrorMessagePatterns.getInvalidXMLElementTagDeclarationPattern().matcher(errorMessage);
		if (m.find()) {
			diagnostics.add(createScreening(ErrorDictionary.INVALID_XML_ELEMENT_TAG_DECLARATION, new Object[] { "'" + m.group(1) + "'" }));
			return false;
		}

		m = RegexErrorMessagePatterns.getInvalidXMLOpenTagForAttrPattern().matcher(errorMessage);
		if (m.find()) {
			diagnostics.add(createScreening(ErrorDictionary.ATTR_VALUE_CANNOT_CONTAIN_OPEN_TAG_SYMBOL, new Object[] {
					"'" + m.group(2) + "'", "'" + m.group(3) + "'" }));
			return false;
		}

		m = RegexErrorMessagePatterns.getMissingXMLElementMatchingEndTagPattern().matcher(errorMessage);
		if (m.find()) {
			String element = "'" + m.group(1) + "'";
			String matchingElement = "'" + m.group(3) + "'";
			diagnostics
					.add(createScreening(ErrorDictionary.MISSING_XML_ELEMENT_MATCHING_END_TAG, new Object[] { element, matchingElement }));
			return false;
		}

		return false;
	}

	private boolean doGetValidate(HttpServletRequest request, ScreeningChain diagnostics, Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return true;
	}

	private boolean doPostValidate(HttpServletRequest request, ScreeningChain diagnostics, Map<Object, Object> context) throws IOException {
		String contentType = request.getContentType();

		String postData = null;

		if (context.containsKey(Validator.HTTP_POST_DATA)) {
			postData = (String) context.get(Validator.HTTP_POST_DATA);
		}

		// empty request
		if (postData.isEmpty()) {
			logger.log(Level.WARNING, "Got no message!");
			diagnostics.add(createScreening(ErrorDictionary.EMPTY_REQUEST_BODY));
			return false;
		}

		logger.info("OK, message received! Let's validate it now...");
		logger.info("Request content type: " + contentType);

		if (request.getContentLength() == -1) {
			diagnostics.add(createScreening(ErrorDictionary.CONTENT_LENGTH_NOT_SPECIFIED));
			return false;
		}

		if (contentType.contains(Constants.APP_XML_MIME_TYPE) || contentType.contains(Constants.TEXT_XML_MIME_TYPE)) {

			TeksPackageImpl.init();
			Teks teksModel = TeksModelHelper.INSTANCE.createTeksModelFromXml(postData);

			if (teksModel.eContents().isEmpty()) {
				diagnostics.add(createScreening(ErrorDictionary.COULD_NOT_PARSE_REQUEST));
				return false;
			}

			return validateParameters(teksModel, diagnostics);

		} else {

			diagnostics.add(createScreening(ErrorDictionary.INVALID_CONTENT_TYPE, new Object[] { contentType }));
			return false;

		}

	}

	private boolean validateParameters(EObject teksModel, ScreeningChain diagnostics) {

		boolean valid = true;

		Matcher m = null;

		EPackage.Registry.INSTANCE.put(TeksPackage.eNS_URI, TeksPackage.eINSTANCE);

		Diagnostician validator = Diagnostician.INSTANCE;

		// Validate the feed and inspect the resulting diagnostic.
		Diagnostic diagnostic = validator.validate(teksModel);

		List<String> rawErrorMessage = new LinkedList<String>();
		runDiagnostic(diagnostic, rawErrorMessage, 0);

		if (rawErrorMessage.size() > 0) {
			if (rawErrorMessage.get(0).contains(HttpStatusCode.SC_OK.getName())) {

				return true;

			} else if (rawErrorMessage.get(0).contains("ERROR")) {

				valid = false;

				Iterator<String> it = rawErrorMessage.iterator();
				while (it.hasNext()) {
					String errorMessage = (String) it.next();

					m = RegexErrorMessagePatterns.getMissingRequiredXMLElementPattern().matcher(errorMessage);
					if (m.find()) {
						String element = "'" + m.group(2).split("'")[1] + "'";
						diagnostics.add(createScreening(ErrorDictionary.MISSING_REQUIRED_XML_ELEMENT, new Object[] { element }));
						return false;
					}

					m = RegexErrorMessagePatterns.getRequiredXMLElementOutOfRangePattern().matcher(errorMessage);
					if (m.find()) {
						System.out.println(ErrorDictionary.REQUIRED_XML_ELEMENT_OUT_OF_RANGE);
						break;
					}
				}

			}
		}

		return valid;
	}

	@SuppressWarnings("rawtypes")
	private void runDiagnostic(Diagnostic diagnostic, List<String> rawErrorMessage, int depth) {
		switch (diagnostic.getSeverity()) {
		case Diagnostic.OK:
			rawErrorMessage.add("[OK]");
			break;
		case Diagnostic.ERROR:
			rawErrorMessage.add("[ERROR] " + diagnostic.getMessage());
			break;
		case Diagnostic.INFO:
			rawErrorMessage.add("[INFO] " + diagnostic.getMessage());
			break;
		}

		if (depth != -1) {
			for (Iterator i = diagnostic.getChildren().iterator(); i.hasNext();) {
				runDiagnostic((Diagnostic) i.next(), rawErrorMessage, depth + 1);
			}
		}

	}

	public Response handleResponse(Screening diagnostic) {
		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;

		Response resp = factory.createResponse();

		for (Iterator<Screening> i = diagnostic.getChildren().iterator(); i.hasNext();) {
			Screening childDiagnostic = (Screening) i.next();
			logger.info(childDiagnostic.getMessage());
			org.teksme.model.teks.Error error = factory.createError();
			error.setStatus(childDiagnostic.getStatusCode());
			error.setCode(childDiagnostic.getCode());
			error.setMessage(childDiagnostic.getMessage());
			error.setMoreInfo(childDiagnostic.getMoreInfoURL());
			resp.setError(error);
		}

		return resp;
	}

	public String getXMLResponse(Response teksResponse) throws IOException {

		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;

		// Create an instance of Teks
		Teks teksModel = factory.createTeks();
		teksModel.setResponse(teksResponse);

		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		URI uri = URI.createPlatformResourceURI("*.xml", true);
		XMLResource xmlResource = new XMLResourceImpl(uri);
		xmlResource.getContents().add(teksModel);
		StringWriter stringWriter = new StringWriter();
		xmlResource.save(new URIConverter.WriteableOutputStream(stringWriter, xmlResource.getEncoding()), options);
		String result = stringWriter.getBuffer().toString();

		return result;

	}

}