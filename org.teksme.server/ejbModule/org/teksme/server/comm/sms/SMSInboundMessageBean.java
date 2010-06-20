package org.teksme.server.comm.sms;

import javax.ejb.Stateless;

import org.smslib.Service;
import org.teksme.server.comm.SMSInboundMessageLocal;

/**
 * Session Bean implementation class SMSReceiver
 */
@Stateless(name = "SMSInboundMessageBean", mappedName = "ejb/JNDI/SMSInboundMessage")
public class SMSInboundMessageBean implements SMSInboundMessageLocal {

	Service srv;

	/**
	 * Default constructor.
	 */
	public SMSInboundMessageBean() {
		// TODO Auto-generated constructor stub
	}

}
