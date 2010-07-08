package org.teksme.server;

import javax.ejb.Remote;

import org.teksme.model.teks.OutboundTextMessage;

@Remote
public interface JMSOutboundMsgQueueSender {

	public static String JNDI_NAME = "ejb/JNDI/JMSOutboundMsgQueueSender";

	public void send(OutboundTextMessage outboundMsg);

}
