package org.teksme.server.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Environment;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;
import org.teksme.server.CreatePollBeanLocal;
import org.teksme.server.CreatePollRemote;

/**
 * Session Bean implementation class CreatePollBean
 */

@Local({ CreatePollBeanLocal.class })
@Remote({ CreatePollRemote.class })
@Stateless(name = "CreatePoll", mappedName = CreatePollRemote.JNDI_NAME)
public class CreatePollBean implements CreatePollRemote, CreatePollBeanLocal {

	Logger logger = Logger.getLogger(CreatePollBean.class.getName());

	private static ResourceSet resourceSet = null;

	private static final String MODEL_FOLDER = "/Users/fabianocruz/";
	private static Properties props = new Properties();
	private static final String dbName = "teksme";

	/**
	 * Default constructor.
	 */
	public CreatePollBean() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
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

	@Override
	public void create(String xmlInput) throws IOException {

		// logger.info("XML: " + xmlInput);

		storePollXMLFile(xmlInput);

		InputStream is = new ByteArrayInputStream(xmlInput.getBytes("ASCII"));

		XMLResourceImpl load_resource = (XMLResourceImpl) resourceSet
				.createResource(URI.createURI("*.xml"));
		load_resource.load(is, null);

		TeksPackageImpl.init();

		Teks teksObj = (Teks) load_resource.getContents().get(0);

		logger.info(teksObj.getPoll().getAuthor());

		persistPoll(teksObj);

	}

	private void storePollXMLFile(String xmlInput) throws IOException {
		InputStream is = new ByteArrayInputStream(xmlInput.getBytes("ASCII"));
		BufferedReader in = new BufferedReader(new InputStreamReader(is));
		String fileName = "/Users/fabianocruz/input.xml";
		PrintWriter fileWriter = new PrintWriter(new BufferedWriter(
				new FileWriter(fileName)));

		String decodedString;
		while ((decodedString = in.readLine()) != null) {
			System.out.println(decodedString);
			fileWriter.write(decodedString);
		}

		in.close();
		fileWriter.flush();
		fileWriter.close();

	}

	private void persistPoll(Teks teksInquiry) {
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

		// Create a session and a transaction
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();

		// Start a transaction, create a library and make it persistent
		tx.begin();

		session.save(teksInquiry);

		// at commit the objects will be present in the database
		tx.commit();
		// and close of, this should actually be done in a finally block
		session.close();

	}
}
