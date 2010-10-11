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

import java.util.Properties;
import java.util.logging.Logger;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.teksme.server.common.TeksResourceBundle;
import org.teksme.server.common.persistence.PersistenceException;
import org.teksme.server.common.persistence.PersistenceManager;
import org.teksme.server.common.persistence.PersistenceManagerFactory;

public class PersistenceManagerFactoryImpl implements PersistenceManagerFactory {

	private static Logger logger = Logger.getLogger(PersistenceManagerFactoryImpl.class.getName());

	ServiceRegistration reg = null;

	private final BundleContext context;

	public PersistenceManagerFactoryImpl(BundleContext context) {
		this.context = context;

		Test persistenceMgr = null;
		try {

			logger.info("Initializing datasource using hibernate...");

			persistenceMgr = new Test();
			persistenceMgr.initialize();

			Properties svcProps = new Properties();
			svcProps.put("default.persistence.manager", TeksResourceBundle.getString("default.persistence.manager"));

			//reg = context.registerService(PersistenceManager.class.getName(), persistenceMgr, svcProps);

		} catch (PersistenceException e) {
			e.printStackTrace();
			// logger.log(Level.SEVERE,
			// "Internal persistence manager factory error: " + e.getMessage());
		}
	}

	public PersistenceManager getPersistenceManager() {
		// TODO Auto-generated method stub
		return null;
	}

}
