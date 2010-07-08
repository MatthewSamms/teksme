package org.teksme.server.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;
import org.teksme.server.SMSPollHandler;
import org.teksme.server.SMSPollHandlerBeanLocal;

/**
 * Session Bean implementation class CreatePollBean
 */

@Local({ SMSPollHandlerBeanLocal.class })
@Remote({ SMSPollHandler.class })
@Stateless(name = "CreatePoll", mappedName = SMSPollHandler.JNDI_NAME)
public class SMSPollHandlerBean implements SMSPollHandler,
		SMSPollHandlerBeanLocal {

	Logger logger = Logger.getLogger(SMSPollHandlerBean.class.getName());

	private static ResourceSet resourceSet = null;

	// private static final String MODEL_FOLDER = "/Users/fabianocruz/";

	/**
	 * Default constructor.
	 */
	public SMSPollHandlerBean() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public static void setResourceSet() {
		// create resource set and resource
		resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new TeksResourceFactoryImpl());

		TeksPackageImpl.init();
	}

	@Override
	public Teks createPollModelFromXml(String xmlInput) throws IOException {

		// logger.info("XML: " + xmlInput);

		InputStream is = new ByteArrayInputStream(xmlInput.getBytes("ASCII"));

		XMLResourceImpl load_resource = (XMLResourceImpl) resourceSet
				.createResource(URI.createURI("*.xml"));
		load_resource.load(is, null);

		TeksPackageImpl.init();

		Teks teksObj = (Teks) load_resource.getContents().get(0);

		logger.info(teksObj.getPoll().getAuthor());

		serializePollXMLData(xmlInput);

		return teksObj;

	}

	private void serializePollXMLData(String xmlInput) throws IOException {
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

	public void persistPoll(Teks teksInquiry) {

		HbDataStore dataStore;
		try {
			dataStore = ServiceLocator.getInstance().getHbDataStore();

			// sets its epackages stored in this datastore
			dataStore.setEPackages(new EPackage[] { TeksPackage.eINSTANCE });

			// initialize, also creates the database tables
			dataStore.initialize();

			final SessionFactory sessionFactory = dataStore.getSessionFactory();
			{
				// Create a session and a transaction
				final Session session = sessionFactory.openSession();
				Transaction tx = session.getTransaction();

				// Start a transaction, create a library and make it persistent
				tx.begin();

				session.save(teksInquiry);

				// at commit the objects will be present in the database
				tx.commit();
				// and close of, this should actually be done in a finally block
				session.close();
			}
		} catch (ServiceLocatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// print the generated mapping
			// System.err.println(dataStore.getMappingXML());
		}

	}
}
