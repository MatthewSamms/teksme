/*
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.teksme.server.impl;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.Session;

import org.teksme.model.teks.InboundTextMessage;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.server.JMSMsgQueueSender;
import org.teksme.server.JMSMsgQueueSenderBeanLocal;
import org.teksme.server.jms.queues.Queues;

/**
 * Session Bean implementation class JMSOutboundMsgQueueSenderBean
 */
@Local({ JMSMsgQueueSenderBeanLocal.class })
@Remote({ JMSMsgQueueSender.class })
@Stateless(name = "JMSOutboundMsgQueueSender", mappedName = JMSMsgQueueSender.JNDI_NAME)
public class JMSMsgQueueSenderBean implements JMSMsgQueueSender,
		JMSMsgQueueSenderBeanLocal {

	private static final String MESSAGETYPE_OBJECT = OutboundTextMessage.class
			.getName();

	/**
	 * Default constructor.
	 */
	public JMSMsgQueueSenderBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(OutboundTextMessage outboundMsg) {

		Connection connection = null;
		Session session = null;

		try {

			// Lookup the connection factory
			ConnectionFactory cf;
			cf = ServiceLocator.getInstance().getQueueConnectionFactory(
					"/ConnectionFactory");

			// Lookup the JMS queue
			Queue queue = ServiceLocator.getInstance().getQueue(
					Queues.OUTBOUND_QUEUE);

			// Create the JMS objects to connect to the server and manage a
			// session
			connection = cf.createConnection();

			// Create a JMS Session
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			ObjectMessage objMsg = session.createObjectMessage();
			objMsg.setObject(outboundMsg);
			objMsg.setJMSType(MESSAGETYPE_OBJECT);

			// Create a JMS Message Producer
			MessageProducer producer = session.createProducer(queue);

			producer.send(objMsg);

			// Thread.sleep(1000);

		} catch (ServiceLocatorException e) {
			e.printStackTrace();

		} catch (JMSException e) {
			e.printStackTrace();

		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void send(InboundTextMessage inboundMsg) {

		Connection connection = null;
		Session session = null;

		try {

			// Lookup the connection factory
			ConnectionFactory cf;
			cf = ServiceLocator.getInstance().getQueueConnectionFactory(
					"/ConnectionFactory");

			// Lookup the JMS queue
			Queue queue = ServiceLocator.getInstance().getQueue(
					Queues.INBOUND_QUEUE);

			// Create the JMS objects to connect to the server and manage a
			// session
			connection = cf.createConnection();

			// Create a JMS Session
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			ObjectMessage objMsg = session.createObjectMessage();
			objMsg.setObject(inboundMsg);
			objMsg.setJMSType(MESSAGETYPE_OBJECT);

			// Create a JMS Message Producer
			MessageProducer producer = session.createProducer(queue);

			producer.send(objMsg);

			// Thread.sleep(1000);

		} catch (ServiceLocatorException e) {
			e.printStackTrace();

		} catch (JMSException e) {
			e.printStackTrace();

		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}

	}

}
