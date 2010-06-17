package org.teksme.server.comm.queues;

import javax.ejb.Stateless;
import javax.jms.Message;

import org.teksme.server.comm.DeadLetterHandler;
import org.teksme.server.comm.DeadLetterHandlerHome;

@Stateless(name="DeadLetterHandler")
public class DeadLetterHandlerBean implements DeadLetterHandler,
		DeadLetterHandlerHome {

	public void invalidMessageType(Message message) {
		// TODO Auto-generated method stub

	}

}
