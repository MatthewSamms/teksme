/*
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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
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

public class TeksModelHelper {

	public static TeksModelHelper INSTANCE = TeksModelHelper.init();

	Logger logger = Logger.getLogger(TeksModelHelper.class.getName());

	private TeksModelHelper() {

	}

	private static TeksModelHelper init() {

		if (INSTANCE == null) {
			INSTANCE = new TeksModelHelper();
		}

		return INSTANCE;
	}

	public Teks createTeksModelFromXml(String xmlInput) throws IOException {

		// logger.info("XML: " + xmlInput);

		InputStream is = new ByteArrayInputStream(xmlInput.getBytes("ASCII"));

		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new TeksResourceFactoryImpl());

		TeksPackageImpl.init();

		XMLResourceImpl load_resource = (XMLResourceImpl) resourceSet
				.createResource(URI.createURI("*.xml"));
		load_resource.load(is, null);

		Teks teksObj = (Teks) load_resource.getContents().get(0);

		return teksObj;

	}

	public void serializeTeksModelXMLData(Teks teksObj, String filePath)
			throws IOException {
		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new TeksResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI
				.createFileURI(filePath));
		// add the root object to the resource
		resource.getContents().add(teksObj);
		// serialize resource – you can specify also serialization
		// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
		resource.save(null);
	}

	public void serializeTeksModelXMLData(String xmlInput, String filePath)
			throws IOException {
		InputStream is = new ByteArrayInputStream(xmlInput.getBytes("ASCII"));
		BufferedReader in = new BufferedReader(new InputStreamReader(is));
		PrintWriter fileWriter = new PrintWriter(new BufferedWriter(
				new FileWriter(filePath)));

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
