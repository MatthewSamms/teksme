package org.teksme.client.test.persistence;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.User;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;

public class GetUserTest {

	private static ResourceSet resourceSet = null;
	private User user = null;
	private static final String MODEL_FILE = "output/teks_user.xml";
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
		props.setProperty(Environment.PASS, "teksme");
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
	public void getTeksUser() {

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
			// System.err.println(dataStore.getMappingXML());
		}

		final SessionFactory sessionFactory = dataStore.getSessionFactory();
		{

			String accountSID = "56f3d45cb6f14af22fee33245bf53b8e";
			String password = "teksme";

			final Session session = sessionFactory.openSession();
			session.beginTransaction();

			// Retrieve the Library and its child objects.
			// Note that you must use the EClass name in the HQL query.

			try {

				MessageDigest md = MessageDigest.getInstance("SHA-1");
				md.update(password.getBytes());

				byte byteData[] = md.digest();

				// convert the byte to hex format method 1
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < byteData.length; i++) {
					sb.append(Integer
							.toString((byteData[i] & 0xff) + 0x100, 16)
							.substring(1));
				}

				System.out.println("Hex format : " + sb.toString());

				Query query = session
						.createQuery("SELECT user FROM User user WHERE user.accountSID = '"
								+ accountSID
								+ "' and user.password = '"
								+ sb.toString() + "'");
				List<?> list = query.list();
				if (list.isEmpty()) {
					// null
				} else if (list.size() > 1) {
					// throw expections
				}

				user = (User) list.get(0);

				session.getTransaction().commit();

			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		Resource resource = resourceSet.createResource(URI
				.createFileURI(MODEL_FILE));
		// add the root object to the resource
		resource.getContents().add(user);
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
