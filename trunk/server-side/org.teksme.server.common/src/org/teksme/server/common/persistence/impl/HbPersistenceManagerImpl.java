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
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.DataStore;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;
import org.teksme.server.common.persistence.IPersistenceManager;
import org.teksme.server.common.persistence.IPersistenceManagerFactory;

public class HbPersistenceManagerImpl implements IPersistenceManager {

	private static Logger logger = Logger.getLogger(HbPersistenceManagerImpl.class.getName());

	private HbDataStore dataStore = null;

	private boolean autodetectDataSource = true;

	private IPersistenceManagerFactory persistenceMgrFactory;

	HbPersistenceManagerImpl() {
		System.out.println("HbPersistenceManagerImpl");
	}

	public String getObjectId(Object obj) {
		return null;
	}

	public boolean isClosed() {
		// TODO Auto-generated method stub
		return false;
	}

	public void close() {
		// TODO Auto-generated method stub

	}

	public Object getObjectById(Object oid, boolean validate) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getObjectById(@SuppressWarnings("rawtypes") Class cls, Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getObjectById(Object oid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object makePersistent(Object pc) {
		final SessionFactory sessionFactory = dataStore.getSessionFactory();
		{
			// Create a session and a transaction
			final Session session = sessionFactory.openSession();
			Transaction tx = session.getTransaction();

			// Start a transaction, create a library and make it persistent
			tx.begin();

			logger.info("Persisting the object model in the database...");

			session.save(pc);

			// at commit the objects will be present in the database
			tx.commit();
			// and close of, this should actually be done in a finally block
			session.close();

			logger.info("The object was successfully persisted into the database!");

		}
		return null;
	}

	public IPersistenceManagerFactory getPersistenceManagerFactory() {
		return this.persistenceMgrFactory;
	}

	/**
	 * Set the <code>IPersistenceManagerFactory</code> that this instance should
	 * manage transactions for.
	 * 
	 * @param persistenceMgrFactory
	 *            - the persistence manager factory implementation
	 */
	public void setPersistenceManagerFactory(IPersistenceManagerFactory persistenceMgrFactory) {
		this.persistenceMgrFactory = persistenceMgrFactory;
	}

	public void serializeXMLData(Teks teksObj) throws IOException {
		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new TeksResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI.createFileURI("XML_SERIALIZATION_PATH"));
		// add the root object to the resource
		resource.getContents().add(teksObj);
		// serialize resource – you can specify also serialization
		// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
		resource.save(null);
	}

	public void serializeXMLData(String xmlInput) throws IOException {

		InputStream is = new ByteArrayInputStream(xmlInput.getBytes("ASCII"));
		BufferedReader in = new BufferedReader(new InputStreamReader(is));
		PrintWriter fileWriter = new PrintWriter(new BufferedWriter(new FileWriter("XML_SERIALIZATION_PATH")));

		String decodedString;
		while ((decodedString = in.readLine()) != null) {
			System.out.println(decodedString);
			fileWriter.write(decodedString);
		}

		in.close();
		fileWriter.flush();
		fileWriter.close();

	}

	/**
	 * Set whether to autodetect a DataStore used by the
	 * IPersistenceManagerFactory, as returned by the
	 * <code>getConnectionFactory() method. Default is "true".
	 * <p>Can be turned off to deliberately ignore an available DataSource,
	 * to not expose JDO transactions as JDBC transactions for that DataSource.
	 */
	public void setAutodetectDataSource(boolean autodetectDataSource) {
		this.autodetectDataSource = autodetectDataSource;
	}

	public void setDataSource(HbDataStore dataStore) {
		this.dataStore = dataStore;
	}

	/**
	 * Return the DataSource that this instance manages transactions for.
	 */
	public DataStore getDataStore() {
		return this.dataStore;
	}

}// class PersistenceManagerImpl
