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

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;
import org.hibernate.cfg.Environment;
import org.hibernate.dialect.Dialect;
import org.teksme.model.teks.TeksPackage;
import org.teksme.server.common.TeksResourceBundle;
import org.teksme.server.common.persistence.IPersistenceManager;
import org.teksme.server.common.persistence.IPersistenceManagerFactory;
import org.teksme.server.common.persistence.PersistenceException;

public class PersistenceManagerFactoryImpl implements IPersistenceManagerFactory {

	private static Logger logger = Logger.getLogger(PersistenceManagerFactoryImpl.class.getName());

	private final String HSQL_DB = "jdbc:hsqldb";

	private final String MYSQL_DB = "jdbc:mysql";

	private String userName;

	private Dialect dialect;

	private String password;

	private String URL;

	private String driverName;

	private Properties dsProperties;

	private IPersistenceManager persistenceMgr;

	public SessionFactory getSessionFactory() {
		return sf;
	}

	private SessionFactory sf;

	public void setProperties(Properties dsProperties) {
		this.dsProperties = dsProperties;
	}

	/**
	 * Set the user name for the data store connection.
	 * 
	 * @param userName
	 *            - the user name for the data store connection.
	 */
	public void setConnectionUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Set the password for the data store connection.
	 * 
	 * @param password
	 *            - the password for the data store connection.
	 */
	public void setConnectionPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the URL for the data store connection.
	 * 
	 * @param URL
	 *            - the URL for the data store connection.
	 */
	public void setConnectionURL(String URL) {
		this.URL = URL;
		dialect = discoverDialect();
	}

	/**
	 * Set the driver name for the data store connection.
	 * 
	 * @param driverName
	 *            - the driver name for the data store connection.
	 */
	public void setConnectionDriverName(String driverName) {
		this.driverName = driverName;
	}

	/**
	 * Get an instance of <code>IPersistenceManager</code> from this factory.
	 * The instance has default values for options. After the first use of
	 * <code>getPersistenceManager</code>, no "set" methods will succeed.
	 * 
	 * @return a IPersistenceManager instance with default options.
	 * @throws PersistenceException
	 */
	public IPersistenceManager getPersistenceManager() throws PersistenceException {
		Object obj = null;
		if (null == persistenceMgr) {
			try {
				final String dfDbName = TeksResourceBundle.getString("default.db.name");
				final String dfPersistenceManager = TeksResourceBundle.getString("default.persistence.manager");
				ClassLoader loader = Thread.currentThread().getContextClassLoader();
				Class<?> persistenceClazz = Class.forName(dfPersistenceManager, false, loader);
				obj = persistenceClazz.newInstance();
				if (IPersistenceManager.class.isInstance(obj)) {
					persistenceMgr = (IPersistenceManager) obj;
				}
				HbDataStore dataStore = initialize(dfDbName, getProperties());
				persistenceMgr.setDataSource(dataStore);
				persistenceMgr.setPersistenceManagerFactory(this);
			} catch (InstantiationException e) {
				System.out.println(e);
			} catch (IllegalAccessException e) {
				System.out.println(e);
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			}
		}
		return persistenceMgr;
	}

	private synchronized HbDataStore initialize(String dsName, Properties dbProps) throws PersistenceException {
		HbDataStore dataStore = null;
		try {

			dataStore = (HbDataStore) HbHelper.INSTANCE.createRegisterDataStore(dsName);

			if (null == dbProps || null == dataStore.getDataStoreProperties()) {
				throw new PersistenceException("Persistence manager internal error: failed to initialize data store");
			}
			// set the properties
			// set a specific option
			// see this page
			// http://wiki.eclipse.org/Teneo/Hibernate/Configuration_Options
			// for all the available options
			dbProps.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
					TeksResourceBundle.getString("datasource.cascade.policy"));
			//dbProps.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");
			// dbProps.setProperty(PersistenceOptions.SET_PROXY, "true");
			dataStore.setDataStoreProperties(dbProps);
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

		return dataStore;
	}

	public IPersistenceManager getPersistenceManager(Properties properties) {
		return null;
	}

	public String getConnectionDriverName() {
		return this.driverName;
	}

	public String getConnectionURL() {
		return this.URL;
	}

	public String getConnectionUserName() {
		return this.userName;
	}

	public String getConnectionPassword() {
		return this.password;
	}

	public Properties getProperties() {
		if (null != dsProperties) {
			return dsProperties;
		} else if (null != driverName && null != userName && null != URL && null != password && null != dialect) {
			final Properties dbProps = new Properties();
			dbProps.setProperty(Environment.DRIVER, driverName);
			dbProps.setProperty(Environment.USER, userName);
			dbProps.setProperty(Environment.URL, URL);
			dbProps.setProperty(Environment.PASS, password);
			dbProps.setProperty(Environment.DIALECT, dialect.getClass().getName());
			return dbProps;
		} else {
			return new Properties();
		}
	}

	private Dialect discoverDialect() {
		if (URL.contains(HSQL_DB))
			return org.hibernate.dialect.HSQLDialect.getDialect();
		else if (URL.contains(MYSQL_DB))
			return org.hibernate.dialect.MySQLInnoDBDialect.getDialect();
		return null;
	}

	public void doFilter() throws IOException {

		try {
			logger.info("Starting a database transaction");
			sf.getCurrentSession().beginTransaction();

			// Commit and cleanup
			logger.info("Committing the database transaction");
			sf.getCurrentSession().getTransaction().commit();

		} catch (StaleObjectStateException staleEx) {
			logger.info("This interceptor does not implement optimistic concurrency control!");
			logger.info("Your application will not work until you add compensation actions!");
			// Rollback, close everything, possibly compensate for any permanent
			// changes during the conversation, and finally restart business
			// conversation. Maybe give the user of the application a chance to
			// merge some of his work with fresh data... what you do here
			// depends
			// on your applications design.
			throw staleEx;
		} catch (Throwable ex) {
			// Rollback only
			ex.printStackTrace();
			try {
				if (sf.getCurrentSession().getTransaction().isActive()) {
					logger.info("Trying to rollback database transaction after exception");
					sf.getCurrentSession().getTransaction().rollback();
				}
			} catch (Throwable rbEx) {
				logger.log(Level.SEVERE, "Could not rollback transaction after exception!", rbEx);
			}

		}
	}

}
