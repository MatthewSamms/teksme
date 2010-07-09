package org.teksme.client.test.model;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.User;
import org.teksme.model.teks.impl.TeksPackageImpl;

public class CreateAccountTest extends TeksModelTest {

	private static final String MODEL_FILE = "output/teks_user.xml";

	@Test
	public void createOutboundMsg() {
		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		// Create an instance of Teks
		Teks teksModel = factory.createTeks();

		User newUser = factory.createUser();
		newUser.setUserName("patadams");
		newUser.setFirstName("Pat");
		newUser.setLastName("Adams");
		newUser.setEmail("pat@painting.com");
		newUser.setGender("male");
		newUser.setCountry("USA");
		newUser.setYearOfBirth(1928);

		teksModel.setAccount(newUser);

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
