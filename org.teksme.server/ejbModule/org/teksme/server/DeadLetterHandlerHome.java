package org.teksme.server;

import javax.ejb.Local;
import javax.jms.Message;

@Local
public interface DeadLetterHandlerHome {

	public void invalidMessageType(Message message);

}
