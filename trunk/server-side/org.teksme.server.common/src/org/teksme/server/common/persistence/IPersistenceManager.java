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
package org.teksme.server.common.persistence;

import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.teksme.model.teks.User;

public interface IPersistenceManager {

	/**
	 * A <code>IPersistenceManager</code> instance can be used until it is
	 * closed.
	 * 
	 * @return <code>true</code> if this <code>IPersistenceManager</code> has
	 *         been closed.
	 * @see #close()
	 */
	boolean isClosed();

	/**
	 * Close this <code>IPersistenceManager</code> so that no further requests
	 * may be made on it. A <code>IPersistenceManager</code> instance can be
	 * used only until it is closed.
	 * 
	 * <P>
	 * Closing a <code>IPersistenceManager</code> might release it to the pool
	 * of available <code>IPersistenceManager</code>s, or might be garbage
	 * collected. Before being used again to satisfy a
	 * <code>getPersistenceManager()</code> request, the default values for
	 * options will be restored to their values as specified in the
	 * <code>IPersistenceManagerFactory</code>.
	 * 
	 * <P>
	 * This method closes the <code>IPersistenceManager</code>.
	 */
	void close();

	Object getObjectById(Object oid, boolean validate);

	/**
	 * Looks up the instance of the given type with the given key.
	 * 
	 * @param cls
	 *            The type of object to load
	 * @param key
	 *            either the string representation of the object id, or an
	 *            object representation of a single field identity key
	 * @return the corresponding persistent instance
	 */
	Object getObjectById(@SuppressWarnings("rawtypes") Class cls, Object key);

	/**
	 * Looks up the instance corresponding to the specified oid. This is
	 * equivalent to <code>getObjectById(oid, true);
	 * 
	 * @param oid
	 *            The object id of the object to load
	 * @return the corresponding persistent instance
	 */
	Object getObjectById(Object oid);

	/**
	 * Make the parameter instance persistent in this
	 * <code>IPersistenceManager</code>. This method makes transient instances
	 * persistent and applies detached instance changes to the cache. It must be
	 * called in the context of an active transaction, or a PersistenceException
	 * is thrown. For a transient instance, it assigns an object identity to the
	 * instance and transitions it to persistent-new.
	 */
	Object makePersistent(Object pc);

	/**
	 * This method returns the <code>IPersistenceManagerFactory</code> used to
	 * create this <code>IPersistenceManager</code>.
	 * 
	 * @return the <code>IPersistenceManagerFactory</code> that created this
	 *         <code>IPersistenceManager</code>
	 */
	IPersistenceManagerFactory getPersistenceManagerFactory();

	/**
	 * Set the <code>IPersistenceManagerFactory</code> that this instance should
	 * manage transactions for.
	 * 
	 * @param persistenceMgrFactory
	 *            - the persistence manager factory implementation
	 */
	void setPersistenceManagerFactory(IPersistenceManagerFactory persistenceMgrFactory);

	void setDataSource(HbDataStore dataStore);

	/**
	 * Return User
	 * @param userID
	 * @param pwd
	 * @return
	 */
	public User getUser(String userID, String pwd);

}
