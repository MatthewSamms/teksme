package org.teksme.server;

import javax.ejb.Remote;

@Remote
public interface SMSInboundMessage {

	public static String JNDI_NAME = "ejb/JNDI/SMSInboundMessage";

}
