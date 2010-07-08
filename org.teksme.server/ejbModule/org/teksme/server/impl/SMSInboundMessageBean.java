package org.teksme.server.impl;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.teksme.server.SMSInboundMessage;
import org.teksme.server.SMSInboundMessageLocal;

/**
 * Session Bean implementation class SMSReceiver
 */
@Local({ SMSInboundMessageLocal.class })
@Remote({ SMSInboundMessage.class })
@Stateless(name = "SMSInboundMessage", mappedName = SMSInboundMessage.JNDI_NAME)
public class SMSInboundMessageBean implements SMSInboundMessage,
		SMSInboundMessageLocal {

	/**
	 * Default constructor.
	 */
	public SMSInboundMessageBean() {
		// TODO Auto-generated constructor stub
	}

}
