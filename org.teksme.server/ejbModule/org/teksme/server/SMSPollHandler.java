package org.teksme.server;

import java.io.IOException;

import javax.ejb.Remote;

import org.teksme.model.teks.Teks;

@Remote
public interface SMSPollHandler {

	public static String JNDI_NAME = "ejb/JNDI/SMSPollHandler";

	public Teks createPollModelFromXml(String xmlInput) throws IOException;

	public void persistPoll(Teks teksModel);

}
