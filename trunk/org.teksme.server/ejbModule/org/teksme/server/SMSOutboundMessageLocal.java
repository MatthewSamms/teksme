package org.teksme.server;

import javax.ejb.Local;

import org.teksme.model.teks.OutboundTextMessage;

@Local
public interface SMSOutboundMessageLocal {

	public void sendMessage(OutboundTextMessage message) throws Exception;

}
