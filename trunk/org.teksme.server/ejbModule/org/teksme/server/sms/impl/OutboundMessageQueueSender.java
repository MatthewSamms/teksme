package org.teksme.server.sms.impl;

import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.Session;

import org.teksme.model.teks.OutboundMessage;
import org.teksme.server.OutboundMessageQueueSenderLocal;
import org.teksme.server.OutboundMessageQueueSenderRemote;
import org.teksme.server.impl.ServiceLocator;
import org.teksme.server.impl.ServiceLocatorException;

/**
 * Session Bean implementation class OutboundMessageQueueSender
 */
@Stateless
public class OutboundMessageQueueSender implements
		OutboundMessageQueueSenderRemote, OutboundMessageQueueSenderLocal {

	/**
	 * Default constructor.
	 */
	public OutboundMessageQueueSender() {
		// TODO Auto-generated constructor stub
	}

	public void send(OutboundMessage msg) {

	}
}
