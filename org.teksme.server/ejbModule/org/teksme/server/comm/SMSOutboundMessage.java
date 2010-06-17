package org.teksme.server.comm;

import javax.ejb.Remote;

import org.smslib.OutboundMessage;

@Remote
public interface SMSOutboundMessage {

	public void sendMessage(OutboundMessage message) throws Exception;

}
