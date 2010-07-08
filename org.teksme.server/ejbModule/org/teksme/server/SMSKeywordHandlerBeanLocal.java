package org.teksme.server;

import javax.ejb.Local;

import org.teksme.model.teks.Teks;

@Local
public interface SMSKeywordHandlerBeanLocal {

	Teks getTeksModelByKeyword(String keyword);

	Boolean checkKeywordAvailability(String keyword);

}
