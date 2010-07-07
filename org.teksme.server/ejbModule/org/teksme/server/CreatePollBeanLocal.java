package org.teksme.server;

import java.io.IOException;

import javax.ejb.Local;

@Local
public interface CreatePollBeanLocal {

	void create(String xmlInput) throws IOException;

}
