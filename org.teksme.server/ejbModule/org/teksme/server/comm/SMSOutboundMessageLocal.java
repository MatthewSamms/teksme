package org.teksme.server.comm;

import javax.ejb.Local;

import org.smslib.OutboundMessage;

@Local
public interface SMSOutboundMessageLocal {

	public void sendMessage(OutboundMessage message) throws Exception;

}
