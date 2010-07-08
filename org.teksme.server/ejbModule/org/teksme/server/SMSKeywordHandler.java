package org.teksme.server;

import javax.ejb.Remote;

import org.teksme.model.teks.Teks;

@Remote
public interface SMSKeywordHandler {

	public static String JNDI_NAME = "ejb/JNDI/SMSKeywordHandler";

	Teks getTeksModelByKeyword(String keyword);

	Boolean checkKeywordAvailability(String keyword);

}
