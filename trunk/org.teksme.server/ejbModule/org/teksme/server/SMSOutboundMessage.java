package org.teksme.server;

import java.io.IOException;

import javax.ejb.Remote;

import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.Teks;

@Remote
public interface SMSOutboundMessage {

	public static String JNDI_NAME = "ejb/JNDI/SMSOutboundMessage";

	public void sendMessage(OutboundTextMessage message) throws Exception;

	Teks createOutboundMsgModelFromXml(String xmlInput) throws IOException;

	void persistOutboundMessage(Teks teksInquiry);
}
