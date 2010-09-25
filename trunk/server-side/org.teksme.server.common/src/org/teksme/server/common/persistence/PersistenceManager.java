package org.teksme.server.common.persistence;

import java.io.IOException;

import org.teksme.model.teks.Teks;

public interface PersistenceManager {

	// persist your objects into the datastore
	public void makePersistent(Teks teksModel) throws PersistenceException;

	public Teks getObjectById(String id);

	public String getObjectId(Object obj);

	public void serializeXMLData(String xmlInput) throws IOException;
}
