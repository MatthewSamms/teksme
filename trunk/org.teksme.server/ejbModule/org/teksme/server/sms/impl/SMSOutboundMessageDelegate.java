package org.teksme.server.sms.impl;

import javax.naming.InitialContext;

import org.teksme.server.SMSOutboundMessage;

public class SMSOutboundMessageDelegate {

	// Remote reference for Session Facade
	static SMSOutboundMessage session;

	public SMSOutboundMessageDelegate() {

	}

	// method to reconnect using String ID
	public void sendMessage(String message) {
		try {

			InitialContext ctx = new InitialContext();
			SMSOutboundMessage bean = (SMSOutboundMessage) ctx
					.lookup("ejb/JNDI/SMSOutboundMessage");

			// session = (SMSOutboundMessage) ServiceLocator.getInstance()
			// .getRemoteHome("",
			// org.teksme.server.comm.SMSOutboundMessage.class);
			// bean.sendMessage(message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected SMSOutboundMessage getSMSOutboundMessage() {
		return session;
	}

}
