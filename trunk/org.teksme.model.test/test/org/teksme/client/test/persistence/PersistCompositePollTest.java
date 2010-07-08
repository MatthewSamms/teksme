package org.teksme.client.test.persistence;

import java.io.IOException;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Environment;
import org.junit.BeforeClass;
import org.junit.Test;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;

public class PersistCompositePollTest {

	private static ResourceSet resourceSet = null;

	private static final String MODEL_FILE = "output/teks.xml";
	private static Properties props = new Properties();
	private static final String dbName = "teksme";

	@BeforeClass
	public static void setResourceSet() {
		// create resource set and resource
		resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new TeksResourceFactoryImpl());

		props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		props.setProperty(Environment.USER, "teksmeuser");
		props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:8889/"
				+ dbName);
		props.setProperty(Environment.PASS, "teks");
		props.setProperty(Environment.DIALECT,
				org.hibernate.dialect.MySQLInnoDBDialect.class.getName());

		// set a specific option
		// see this page
		// http://wiki.eclipse.org/Teneo/Hibernate/Configuration_Options
		// for all the available options
		props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
				"REFRESH,PERSIST,MERGE");

		TeksPackageImpl.init();
	}

	@Test
	public void persistCompositePollTest() throws IOException {

		// load resource
		Resource res = resourceSet.getResource(URI.createURI(MODEL_FILE), true);

		HbDataStore dataStore = (HbDataStore) HbHelper.INSTANCE
				.createRegisterDataStore(dbName);

		// set the properties
		dataStore.setProperties(props);

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
		session.save(eduTeks);
		
		// at commit the objects will be present in the database
		tx.commit();
		// and close of, this should actually be done in a finally block
		session.close();

	}

}
