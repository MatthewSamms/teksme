package org.teksme.model.validation;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.teksme.model.teks.TeksPackage;

public class Validator {

	public void validate(EObject model) {
		String xsdFile = "resources/schema/teks.xsd";
		String xmlFile = "resources/data/teks_outmsg.xml";
		org.eclipse.emf.common.util.URI xsdURI = null;

		XMLProcessor processor = null;
		Resource resource = null;
		Matcher m = null;

		try {

			EPackage.Registry.INSTANCE.put(TeksPackage.eNS_URI,
					TeksPackage.eINSTANCE);

			xsdURI = URI.createFileURI((new File(xsdFile)).getCanonicalPath());
			processor = new XMLProcessor(xsdURI);
			resource = processor
					.load(new File(xmlFile).getAbsolutePath(), null);

			EObject document = (EObject) resource.getContents().get(0);
			// EObject[] teks = (EObject[]) document.eGet(document.eClass()
			// .getEStructuralFeature("outboundMessage"));

			Diagnostician validator = Diagnostician.INSTANCE;

			// Validate the feed and inspect the resulting diagnostic.
			Diagnostic diagnostic = validator.validate(document);
			runDiagnostic(diagnostic, 0);

			List<String> messages = getRawErrorMessage();

			if (messages.size() > 0) {

				if (messages.get(0).contains(
						ValidationDiagnostic.OK.getLiteral())) {

					System.out.println("OK");

				} else if (messages.get(0).contains(
						ValidationDiagnostic.ERROR.getLiteral())) {

					Iterator<String> it = messages.iterator();

					while (it.hasNext()) {
						String line = (String) it.next();

						System.out.println(line);

						m = RegexErrorMessagePatterns
								.getMissingRequiredXMLElementPattern().matcher(
										line);
						if (m.find()) {
							System.out
									.println(ErrorDictionary.MISSING_REQUIRED_XML_ELEMENT);
						}

						m = RegexErrorMessagePatterns
								.getRequiredXMLElementOutOfRangePattern()
								.matcher(line);
						if (m.find()) {
							System.out
									.println(ErrorDictionary.REQUIRED_XML_ELEMENT_OUT_OF_RANGE);
						}
					}

				}
			}

		} catch (IOWrappedException e) {
			System.out.println(" is not valid because ");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected List<String> getRawErrorMessage() {
		return rawErrorMessage;
	}

	private List<String> rawErrorMessage = new ArrayList<String>();

	@SuppressWarnings("rawtypes")
	private void runDiagnostic(Diagnostic diagnostic, int depth) {
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

		for (Iterator i = diagnostic.getChildren().iterator(); i.hasNext();) {
			runDiagnostic((Diagnostic) i.next(), depth + 1);
		}

	}

	public static void main(String[] args) {
		Validator test = new Validator();
		test.validate(null);

	}

}