package org.teksme.client.test.persistence;

import java.io.IOException;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksPackage;

public class OutboundMsgPersistenceTest extends PersistenceTest {

	private static final String MODEL_FILE = "output/teks_outmsg.xml";

	@Test
	public void persistOutMessageTest() throws IOException {

		// load resource
		Resource res = resourceSet.getResource(URI.createURI(MODEL_FILE), true);

		HbDataStore dataStore = (HbDataStore) HbHelper.INSTANCE
				.createRegisterDataStore(dbName);

		// set the properties
		dataStore.setDataStoreProperties(props);

		// sets its epackages stored in this datastore
		dataStore.setEPackages(new EPackage[] { TeksPackage.eINSTANCE });

		// initialize, also creates the database tables
		try {
			dataStore.initialize();
		} finally {
			// print the generated mapping
			System.err.println(dataStore.getMappingXML());
		}

		final SessionFactory sessionFactory = dataStore.getSessionFactory();

		// Create a session and a transaction
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();

		// Start a transaction, create a library and make it persistent
		tx.begin();

		Teks eduTeks = (Teks) res.getContents().get(0);

		OutboundMessage outMsg = eduTeks.getOutboundMessage(0);
		outMsg.setId(UUID.randomUUID().toString());

		session.save(eduTeks);

		// at commit the objects will be present in the database
		tx.commit();
		// and close of, this should actually be done in a finally block
		session.close();

	}

}
