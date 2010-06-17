package org.teksme.server.comm;

import javax.ejb.Local;
import javax.jms.Message;

@Local
public interface DeadLetterHandlerHome {

	public void invalidMessageType(Message message);

}
