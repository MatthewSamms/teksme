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
