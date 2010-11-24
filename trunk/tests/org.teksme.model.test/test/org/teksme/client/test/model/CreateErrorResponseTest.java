package org.teksme.client.test.model;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.teksme.model.teks.Response;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.impl.TeksPackageImpl;

public class CreateErrorResponseTest extends TeksModelTest {

	private static final String MODEL_FILE = "output/teks_error_response.xml";

	@Test
	public void createOutboundMsg() {

		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		// Create an instance of Teks
		Teks teksModel = factory.createTeks();

		Response resp = factory.createResponse();

		resp.setStatus(400);
		resp.setCode(10003);
		resp.setMessage("Please give us the full URL, including the 'http://' or 'https://'");
		resp.setMoreInfo("http://api.teks.me/errors/10003");

		teksModel.setResponse(resp);

		Resource resource = resourceSet.createResource(URI
				.createFileURI(MODEL_FILE));
		// add the root object to the resource
		resource.getContents().add(teksModel);
		// serialize resource Ð you can specify also serialization
		// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
