package org.teksme.server;

import java.io.IOException;
import java.io.InputStream;

import javax.ejb.Remote;

@Remote
public interface CreatePollRemote {

	public static String JNDI_NAME = "ejb/JNDI/CreatePoll";

	void create(String xmlInput) throws IOException;

}
