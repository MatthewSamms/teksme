package org.teksme.server.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.server.SMSKeywordHandler;
import org.teksme.server.SMSKeywordHandlerBeanLocal;

/**
 * Session Bean implementation class SMSKeywordHandlerBean
 */
@Local({ SMSKeywordHandlerBeanLocal.class })
@Remote({ SMSKeywordHandler.class })
@Stateless(name = "SMSKeywordHandler", mappedName = SMSKeywordHandler.JNDI_NAME)
public class SMSKeywordHandlerBean implements SMSKeywordHandler,
		SMSKeywordHandlerBeanLocal {

	/**
	 * Default constructor.
	 */
	public SMSKeywordHandlerBean() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public static void setResourceSet() {

		TeksPackageImpl.init();
	}

	@Override
	public Teks getTeksModelByKeyword(String keyword) {

		Teks teksModel = null;

		HbDataStore dataStore;

		try {
			dataStore = ServiceLocator.getInstance().getHbDataStore();

			// sets its epackages stored in this datastore
			dataStore.setEPackages(new EPackage[] { TeksPackage.eINSTANCE });

			// initialize, also creates the database tables
			dataStore.initialize();

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

		} catch (ServiceLocatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// print the generated mapping
			// System.err.println(dataStore.getMappingXML());
		}
		return teksModel;
	}

	@Override
	public Boolean checkKeywordAvailability(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
