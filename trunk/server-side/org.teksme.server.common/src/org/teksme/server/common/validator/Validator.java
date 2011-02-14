package org.teksme.server.common.validator;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.teksme.model.teks.Response;

/**
 * The <code>ValidationHandler</code> provides the capability to test whether
 * the value provided for the request, or the values specified for the
 * parameters of the selected method, are valid against specific rules. This
 * handler uses the Validation Application Block, taking advantage of the wide
 * range of rules that it supports.
 * 
 * 
 */
public interface Validator {

	final static String DIAGNOSTIC_SOURCE = "org.teksme.server.common.validator";//$NON-NLS-1$

	final static String CONTENT_TYPE = "Content-Type";//$NON-NLS-1$

	final static String ENCODING = "Accept-Encoding";//$NON-NLS-1$

	final static String HTTP_POST_DATA = "HTTP POST Data";//$NON-NLS-1$

	static final String REQUEST_CONTEXT_OPTIONS = "HTTP Request Context";//$NON-NLS-1$

	static final Object HTTP_GET_DATA = "HTTP GET Data";//$NON-NLS-1$

	static final Object HTTP_GET_REQUIRED_DATA = "HTTP GET required data";//$NON-NLS-1$

	static final Object TEKS_MODEL_ELEMENT = "Teks model element representation";//$NON-NLS-1$

	/**
	 * An common interface for pattern-based constraints.
	 */
	interface PatternMatcher {
		/**
		 * Returns whether the string value matches the pattern.
		 */
		boolean matches(String value);
	}

	public Screening validate(HttpServletRequest request) throws IOException;

	public Screening validate(HttpServletRequest request, Map<?, ?> contextEntries) throws IOException;

	/**
	 * Validates the object in the given context, optionally producing
	 * diagnostics.
	 * 
	 * @param diagnostics
	 *            a place to accumulate diagnostics; if it's <code>null</code>,
	 *            no diagnostics should be produced.
	 * @param context
	 *            a place to cache information, if it's <code>null</code>, no
	 *            cache is supported.
	 * @return whether the object is valid.
	 * @throws IOException
	 */
	public boolean validate(HttpServletRequest request, ScreeningChain diagnostics, Map<Object, Object> context) throws IOException;

	public Response handleResponse(Screening diagnostic);

	public String getXMLResponse(Response teksResponse) throws IOException;

	public BasicScreening createScreening(ErrorDictionary errorDictionary);

	public BasicScreening createDefaultScreening(HttpServletRequest request);

}