package org.teksme.client.test;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.junit.BeforeClass;
import org.junit.Test;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;

public class GetTeksModelByKeyword {

	private static ResourceSet resourceSet = null;
	private Teks teksModel = null;
	private static final String MODEL_FILE = "output/teks2.xml";
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
	public void getTeksModelByKeyword() {

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
			// System.err.println(dataStore.getMappingXML());
		}

		final SessionFactory sessionFactory = dataStore.getSessionFactory();
		{
			final Session session = sessionFactory.openSession();
			session.beginTransaction();

			// Retrieve the Library and its child objects.
			// Note that you must use the EClass name in the HQL query.
			Query query = session
					.createQuery("SELECT teks FROM Teks teks, Poll poll, PollQuestion pollquestion, Keyword keyword WHERE teks.poll = poll AND poll.question[0] = pollquestion AND pollquestion.keyword = keyword AND keyword.key = 'CHECKIN'");
			List<?> libraries = query.list();
			teksModel = (Teks) libraries.get(0);

			System.out.println(teksModel.getAppId());

			session.getTransaction().commit();

		}

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

	@Test
	public void persistTeksModel() {

	}
}
