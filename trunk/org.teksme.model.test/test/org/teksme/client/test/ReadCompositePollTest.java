package org.teksme.client.test;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;

public class ReadCompositePollTest {

	private static final String MODEL_FILE = "output/teks.xml";

	@Test
	public void readModel() throws IOException {

		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		
		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new TeksResourceFactoryImpl());

		// load resource
		Resource res = resourceSet.getResource(URI.createURI(MODEL_FILE), true);

		Teks eduTeks = (Teks) res.getContents().get(0);

	}
}
