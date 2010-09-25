package org.teksme.server.common.persistence.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.teksme.server.common.TeksResourceBundle;
import org.teksme.server.common.persistence.PersistenceManager;
import org.teksme.server.common.persistence.PersistenceManagerFactory;

public class PersistenceManagerFactoryImpl implements PersistenceManagerFactory {

	private static Logger logger = Logger.getLogger(PersistenceManagerFactoryImpl.class.getName());

	private static Map<String, Object> registry = Collections.synchronizedMap(new HashMap<String, Object>());

	private static PersistenceManagerFactoryImpl INSTANCE = null;

	public static PersistenceManagerFactory init() {
		try {

			if (registry.containsKey(PersistenceManagerFactory.class.getSimpleName())) {
				PersistenceManagerFactory thePersistenceManagerFactory = (PersistenceManagerFactory) registry
						.get(PersistenceManagerFactory.class.getSimpleName());

				if (thePersistenceManagerFactory != null) {
					return thePersistenceManagerFactory;
				}
			}

			INSTANCE = new PersistenceManagerFactoryImpl();
			registry.put(PersistenceManagerFactory.class.getSimpleName(), INSTANCE);

		} catch (Exception exception) {
			logger.severe(exception.getMessage());
			exception.printStackTrace();
		}
		return INSTANCE;
	}

	public PersistenceManager getPersistenceManager() {
		Object obj = null;
		try {
			final String dfPersistenceManager = TeksResourceBundle.getString("default.persistence.manager");
			Class<?> persistenceClazz = Class.forName(dfPersistenceManager);
			obj = persistenceClazz.newInstance();
			if (PersistenceManager.class.isInstance(obj)) {
				return (PersistenceManager) obj;
			}

		} catch (InstantiationException e) {
			System.out.println(e);
		} catch (IllegalAccessException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return null;
	}

}
