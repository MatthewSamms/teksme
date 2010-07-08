package org.teksme.server;

import java.io.IOException;

import javax.ejb.Local;

import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.Teks;

@Local
public interface SMSOutboundMessageLocal {

	public void sendMessage(OutboundTextMessage message) throws Exception;

	Teks createOutboundMsgModelFromXml(String xmlInput) throws IOException;

	void persistOutboundMessage(Teks teksInquiry);

}
