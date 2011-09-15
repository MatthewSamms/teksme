/**
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
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
import java.security.MessageDigest;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.DataStore;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.teksme.model.TeksObject;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.User;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;
import org.teksme.server.common.persistence.IPersistenceManager;
import org.teksme.server.common.persistence.IPersistenceManagerFactory;

public class HbPersistenceManagerImpl implements IPersistenceManager {

	private static Logger logger = Logger.getLogger(HbPersistenceManagerImpl.class.getName());

	private HbDataStore dataStore = null;

	@SuppressWarnings("unused")
	private boolean autodetectDataSource = true;

	private IPersistenceManagerFactory persistenceMgrFactory;

	HbPersistenceManagerImpl() {

	}

	public String getTeksObjectId(TeksObject obj) {
		return null;
	}

	public boolean isClosed() {
		// TODO Auto-generated method stub
		return false;
	}

	public void close() {
		// TODO Auto-generated method stub

	}

	public TeksObject getTeksObjectById(TeksObject oid, boolean validate) {
		// TODO Auto-generated method stub
		return null;
	}

	public TeksObject getTeksObjectById(@SuppressWarnings("rawtypes") Class cls, TeksObject key) {
		// TODO Auto-generated method stub
		return null;
	}

	public TeksObject getTeksObjectById(TeksObject oid) {
		// TODO Auto-generated method stub
		return null;
	}

	public TeksObject makePersistent(TeksObject teksObj) {
		final SessionFactory sessionFactory = dataStore.getSessionFactory();
		{

			// Create a session and a transaction
			Session session = sessionFactory.openSession();
			
			if(session.isOpen()) {
				System.out.println("Session is OPEN!");
				session.close();
			}
			
			session = sessionFactory.openSession();
			
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
		// serialize resource Ð you can specify also serialization
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

	public User getUser(String accountSID, String password) throws Exception {
		final SessionFactory sessionFactory = dataStore.getSessionFactory();
		final Session session = sessionFactory.openSession();

		MessageDigest md = MessageDigest.getInstance("SHA-1");
		md.update(password.getBytes());

		byte byteData[] = md.digest();

		// convert the byte to hex format method 1
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		}

		Query query = session.createQuery("SELECT user FROM User user WHERE user.accountSID = '" + accountSID + "' and user.password = '"
				+ sb.toString() + "'");
		List<?> list = query.list();
		if (list.isEmpty()) {
			System.out.println("No user found!");
			return null;
		} else if (list.size() > 1) {
			throw new Exception("More than one user found on the database!");
		}

		User user = (User) list.get(0);
		System.out.println("User: " + user);

		session.close();
		return user;

	}

	public List<? extends TeksObject> getTeksObjects(Class<? extends TeksObject> clazz) {
		final SessionFactory sessionFactory = dataStore.getSessionFactory();
		final Session session = sessionFactory.openSession();

		String className = getClassName(clazz);
		String strQuery = "SELECT " + className.toLowerCase() + " FROM " + className + " " + className.toLowerCase();
		System.out.println("QUERY: " + strQuery);

		Query query = session.createQuery(strQuery);
		@SuppressWarnings("unchecked")
		List<? extends TeksObject> list = query.list();
		if (list.isEmpty()) {
			return null;
		}

		//session.close();
		return list;
	}

	public static String getClassName(@SuppressWarnings("rawtypes") Class c) {
		String className = c.getName();
		int firstChar;
		firstChar = className.lastIndexOf('.') + 1;
		if (firstChar > 0) {
			className = className.substring(firstChar);
		}
		return className;
	}

}// class PersistenceManagerImpl
