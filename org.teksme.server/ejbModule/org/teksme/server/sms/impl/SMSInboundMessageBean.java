package org.teksme.server.comm.sms;

import javax.ejb.Stateless;

import org.teksme.server.SMSInboundMessageLocal;

/**
 * Session Bean implementation class SMSReceiver
 */
@Stateless(name = "SMSInboundMessageBean", mappedName = "ejb/JNDI/SMSInboundMessage")
public class SMSInboundMessageBean implements SMSInboundMessageLocal {

	/**
	 * Default constructor.
	 */
	public SMSInboundMessageBean() {
		// TODO Auto-generated constructor stub
	}

}
