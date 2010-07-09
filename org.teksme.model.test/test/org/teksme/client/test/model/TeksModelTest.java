package org.teksme.client.test.model;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.BeforeClass;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;

public abstract class TeksModelTest {

	protected static ResourceSet resourceSet = null;

	@BeforeClass
	public static void setResourceSet() {
		// create resource set and resource
		resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new TeksResourceFactoryImpl());

	}

}
