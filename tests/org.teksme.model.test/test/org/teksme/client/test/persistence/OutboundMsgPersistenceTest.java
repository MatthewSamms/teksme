package org.teksme.client.test.persistence;

import java.io.IOException;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;
import org.teksme.server.common.persistence.IPersistenceManager;

public class OutboundMsgPersistenceTest {

	private ResourceSet resourceSet = null;

	private static final String MODEL_FILE = "output/teks_outmsg.xml";

	@org.junit.Before
	public void setResourceSet() {
		// create resource set and resource
		resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new TeksResourceFactoryImpl());

		TeksPackageImpl.init();
	}

	@org.junit.Test
	public void testOutboundMsgPersistence() throws IOException {

		// load resource
		Resource res = resourceSet.getResource(URI.createURI(MODEL_FILE), true);

		// PersistenceManagerFactory pFactory =
		// PersistenceManagerFactory.INSTANCE;
		IPersistenceManager pm = null;// pFactory.getPersistenceManager();

		Teks teksModel = (Teks) res.getContents().get(0);

		OutboundMessage outMsg = teksModel.getOutboundMessage(0);
		outMsg.setId(UUID.randomUUID().toString());

		// try {
		// pm.makePersistent(teksModel);
		// } catch (PersistenceException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}
}
