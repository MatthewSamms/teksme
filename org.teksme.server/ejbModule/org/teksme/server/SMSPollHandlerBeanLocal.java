package org.teksme.server;

import java.io.IOException;

import javax.ejb.Local;

import org.teksme.model.teks.Teks;

@Local
public interface SMSPollHandlerBeanLocal {

	public Teks createPollModelFromXml(String xmlInput) throws IOException;

	public void persistPoll(Teks teksModel);

}
