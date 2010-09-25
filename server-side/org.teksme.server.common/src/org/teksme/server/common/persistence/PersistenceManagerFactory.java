package org.teksme.server.common.persistence;

import org.teksme.server.common.persistence.impl.PersistenceManagerFactoryImpl;

public interface PersistenceManagerFactory {

	public PersistenceManagerFactory INSTANCE = PersistenceManagerFactoryImpl.init();

	public PersistenceManager getPersistenceManager();

}
