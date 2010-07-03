package org.teksme.server;

import javax.ejb.Remote;

import org.teksme.model.teks.OutboundTextMessage;

@Remote
public interface SMSOutboundMessage {

	public static String JNDI_NAME = "ejb/JNDI/SMSOutboundMessage";

	public void sendMessage(OutboundTextMessage message) throws Exception;

}
