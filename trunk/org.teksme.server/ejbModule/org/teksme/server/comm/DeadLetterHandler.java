package org.teksme.server.comm;

import javax.ejb.Remote;
import javax.jms.Message;

@Remote
public interface DeadLetterHandler {

	public void invalidMessageType(Message message);

}
