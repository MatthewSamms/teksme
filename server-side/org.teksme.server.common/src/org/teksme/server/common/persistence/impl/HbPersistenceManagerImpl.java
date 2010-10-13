/**
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.common.persistence.impl;

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
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;
import org.teksme.server.common.TeksResourceBundle;
import org.teksme.server.common.persistence.PersistenceException;
import org.teksme.server.common.persistence.PersistenceManager;

public class HbPersistenceManagerImpl implements PersistenceManager {

	private static final String DB_NAME = TeksResourceBundle.getString("datasource.name");

	private static final String XML_SERIALIZATION_PATH = TeksResourceBundle.getString("xml.serialization.path");

	private static Logger logger = Logger.getLogger(HbPersistenceManagerImpl.class.getName());

	private HbDataStore dataStore = null;

	// persist your objects into the datastore
	public void makePersistent(Teks teksObj) throws PersistenceException {

		final SessionFactory sessionFactory = dataStore.getSessionFactory();
		{
			// Create a session and a transaction
			final Session session = sessionFactory.openSession();
			Transaction tx = session.getTransaction();

			// Start a transaction, create a library and make it persistent
			tx.begin();

			logger.info("Persisting the object model in the database...");

			session.save(teksObj);

			// at commit the objects will be present in the database
			tx.commit();
			// and close of, this should actually be done in a finally block
			session.close();

			logger.info("The object was successfully persisted into the database!");

		}
	}

	public void initialize() throws PersistenceException {
		try {
			dataStore = (HbDataStore) HbHelper.INSTANCE.createRegisterDataStore(DB_NAME);
			// set the properties
			// dataStore.setProperties(getHibernateDataStoreProperties());
			// // sets its epackages stored in this datastore
			dataStore.setEPackages(new EPackage[] { TeksPackage.eINSTANCE });
			logger.info("Initializing datasource using hibernate...");
			// // initialize, also creates the database tables
			dataStore.initialize();
			logger.info("Extension manager:: " + dataStore.getExtensionManager());
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw new PersistenceException("Persistence manager internal error: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistenceException("Persistence manager internal error: " + e.getMessage());
		}
	}

	// Retrieves the object
	public Teks getObjectById(String id) {
		return null;
	}

	public String getObjectId(Object obj) {
		return null;
	}

	public void serializeXMLData(Teks teksObj) throws IOException {
		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new TeksResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI.createFileURI(XML_SERIALIZATION_PATH));
		// add the root object to the resource
		resource.getContents().add(teksObj);
		// serialize resource – you can specify also serialization
		// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
		resource.save(null);
	}

	public void serializeXMLData(String xmlInput) throws IOException {

		InputStream is = new ByteArrayInputStream(xmlInput.getBytes("ASCII"));
		BufferedReader in = new BufferedReader(new InputStreamReader(is));
		PrintWriter fileWriter = new PrintWriter(new BufferedWriter(new FileWriter(XML_SERIALIZATION_PATH)));

		String decodedString;
		while ((decodedString = in.readLine()) != null) {
			System.out.println(decodedString);
			fileWriter.write(decodedString);
		}

		in.close();
		fileWriter.flush();
		fileWriter.close();

	}

	private Properties getHibernateDataStoreProperties() {

		// Set the database information, Environment is
		// org.hibernate.cfg.Environment
		final Properties dbProps = new Properties();

		dbProps.setProperty(Environment.DRIVER, TeksResourceBundle.getString("datasource.driver"));
		dbProps.setProperty(Environment.USER, TeksResourceBundle.getString("datasource.user"));
		dbProps.setProperty(Environment.URL, TeksResourceBundle.getString("datasource.url"));
		dbProps.setProperty(Environment.PASS, TeksResourceBundle.getString("datasource.passwd"));
		dbProps.setProperty(Environment.DIALECT, TeksResourceBundle.getString("datasource.dialect"));

		// set a specific option
		// see this page
		// http://wiki.eclipse.org/Teneo/Hibernate/Configuration_Options
		// for all the available options
		dbProps.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, TeksResourceBundle.getString("datasource.cascade.policy"));
		dbProps.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");
		dbProps.setProperty(PersistenceOptions.SET_PROXY, "true");

		return dbProps;

	}

}// class PersistenceManagerImpl
