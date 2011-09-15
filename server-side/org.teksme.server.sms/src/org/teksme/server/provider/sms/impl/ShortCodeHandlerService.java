/*
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.provider.sms.impl;

import org.teksme.model.teks.Teks;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.server.provider.sms.service.ShortCodeHandler;

/**
 * Session Bean implementation class SMSKeywordHandlerBean
 */
// @Local({ SMSKeywordHandlerBeanLocal.class })
// @Remote({ SMSKeywordHandler.class })
// @Stateless(name = "SMSKeywordHandler", mappedName =
// SMSKeywordHandler.JNDI_NAME)
public class ShortCodeHandlerService implements ShortCodeHandler {

	/**
	 * Default constructor.
	 */
	public ShortCodeHandlerService() {
		// TODO Auto-generated constructor stub
	}

	// @PostConstruct
	public static void setResourceSet() {

		TeksPackageImpl.init();
	}

	public Teks getTeksModelByKeyword(String keyword) {

		Teks teksModel = null;

		// HbDataStore dataStore;
		//
		// try {
		// dataStore = ServiceLocator.getInstance().getHbDataStore();
		//
		// // sets its epackages stored in this datastore
		// dataStore.setEPackages(new EPackage[] { TeksPackage.eINSTANCE });
		//
		// // initialize, also creates the database tables
		// dataStore.initialize();
		//
		// final SessionFactory sessionFactory = dataStore.getSessionFactory();
		// {
		// final Session session = sessionFactory.openSession();
		// session.beginTransaction();
		//
		// // Retrieve the Library and its child objects.
		// // Note that you must use the EClass name in the HQL query.
		// Query query = session
		// .createQuery("SELECT teks FROM Teks teks, Poll poll, PollQuestion pollquestion, Keyword keyword WHERE teks.poll = poll AND poll.question[0] = pollquestion AND pollquestion.keyword = keyword AND keyword.key = 'CHECKIN'");
		// List<?> libraries = query.list();
		// teksModel = (Teks) libraries.get(0);
		//
		// System.out.println(teksModel.getAppId());
		//
		// session.getTransaction().commit();
		//
		// }
		//
		// } catch (ServiceLocatorException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } finally {
		// // print the generated mapping
		// // System.err.println(dataStore.getMappingXML());
		// }
		return teksModel;
	}

	public Boolean checkKeywordAvailability(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
