/*
 * Copyright 2010 T�ksMe, Inc.
 * T�ksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.teksme.server;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.cfg.Environment;

public class ServiceLocator {

	private Context initialContext;

	private Map<String, Object> cache;

	private static ServiceLocator me;

	// Returns the instance of ServiceLocator class
	public static ServiceLocator getInstance() throws ServiceLocatorException {
		if (me == null) {
			me = new ServiceLocator();
		}
		return me;
	}

	private Context getInitialContext() throws NamingException {
		// Step 1. Create an initial context to perform the JNDI lookup.
		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.PROVIDER_URL, "jnp://localhost:1099");
		env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
		env.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces  ");
		return new InitialContext(env);

	}

	// // lookup a remote home given the JNDI name for the
	// // remote home
	// public EJBHome getRemoteHome(String jndiHomeName)
	// throws ServiceLocatorException {
	// EJBHome remoteHome = null;
	// try {
	// if (cache.containsKey(jndiHomeName)) {
	// remoteHome = (EJBHome) cache.get(jndiHomeName);
	// } else {
	// Object objref = initialContext.lookup(jndiHomeName);
	// remoteHome = (EJBHome) objref;
	// cache.put(jndiHomeName, remoteHome);
	// }
	// } catch (NamingException nex) {
	// throw new ServiceLocatorException(nex);
	// } catch (Exception ex) {
	// throw new ServiceLocatorException(ex);
	// }
	// return remoteHome;
	// }
	//
	private ServiceLocator() throws ServiceLocatorException {

//		try {

			//this.initialContext = getInitialContext();
			this.cache = Collections.synchronizedMap(new HashMap<String, Object>());

//		} catch (NamingException ex) {
//			System.err.printf("Error in CTX looking up %s because of %s while %s", ex.getRemainingName(), ex.getCause(),
//					ex.getExplanation());
//
//		}

	}

	//
	// // Returns the String that represents the given
	// // EJBObject's handle in serialized format.
	// protected String getId(EJBObject session) throws ServiceLocatorException
	// {
	// try {
	// javax.ejb.Handle handle = session.getHandle();
	// ByteArrayOutputStream fo = new ByteArrayOutputStream();
	// ObjectOutputStream so = new ObjectOutputStream(fo);
	// so.writeObject(handle);
	// so.flush();
	// so.close();
	// return new String(fo.toByteArray());
	// } catch (RemoteException ex) {
	// throw new ServiceLocatorException();
	// } catch (IOException ex) {
	// throw new ServiceLocatorException();
	// }
	// }
	//
	// public QueueConnectionFactory getQueueConnectionFactory(
	// String queueConnectionFactoryName) throws ServiceLocatorException {
	// QueueConnectionFactory queueFactory = null;
	// try {
	// if (cache.containsKey(queueConnectionFactoryName)) {
	// queueFactory = (QueueConnectionFactory) cache
	// .get(queueConnectionFactoryName);
	// } else {
	// queueFactory = (QueueConnectionFactory) initialContext
	// .lookup(queueConnectionFactoryName);
	// cache.put(queueConnectionFactoryName, queueFactory);
	// }
	// } catch (NamingException nex) {
	// throw new ServiceLocatorException(nex);
	// } catch (Exception ex) {
	// throw new ServiceLocatorException(ex);
	// }
	//
	// return queueFactory;
	// }
	//
	// public Queue getQueue(String queueName) throws ServiceLocatorException {
	// Queue queue = null;
	// try {
	// if (cache.containsKey(queueName)) {
	// queue = (Queue) cache.get(queueName);
	// } else {
	// queue = (Queue) initialContext.lookup(queueName);
	// cache.put(queueName, queue);
	// }
	// } catch (NamingException nex) {
	// throw new ServiceLocatorException(nex);
	// } catch (Exception ex) {
	// throw new ServiceLocatorException(ex);
	// }
	//
	// return queue;
	// }
	//

}