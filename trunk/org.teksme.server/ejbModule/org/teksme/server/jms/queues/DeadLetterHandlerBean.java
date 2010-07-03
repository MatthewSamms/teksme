package org.teksme.server.jms.queues;

import javax.ejb.Stateless;
import javax.jms.Message;

import org.teksme.server.comm.DeadLetterHandler;
import org.teksme.server.comm.DeadLetterHandlerHome;

@Stateless
public class DeadLetterHandlerBean implements DeadLetterHandler,
		DeadLetterHandlerHome {

	public void invalidMessageType(Message message) {
		System.out.println("DeadLetterHandlerBean.invalidMessageType()");

	}

}
