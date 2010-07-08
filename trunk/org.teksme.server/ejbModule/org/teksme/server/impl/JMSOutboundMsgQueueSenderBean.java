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

import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.server.JMSOutboundMsgQueueSender;
import org.teksme.server.JMSOutboundMsgQueueSenderBeanLocal;
import org.teksme.server.jms.queues.Queues;

/**
 * Session Bean implementation class JMSOutboundMsgQueueSenderBean
 */
@Local({ JMSOutboundMsgQueueSenderBeanLocal.class })
@Remote({ JMSOutboundMsgQueueSender.class })
@Stateless(name = "JMSOutboundMsgQueueSender", mappedName = JMSOutboundMsgQueueSender.JNDI_NAME)
public class JMSOutboundMsgQueueSenderBean implements
		JMSOutboundMsgQueueSender, JMSOutboundMsgQueueSenderBeanLocal {

	private static final String MESSAGETYPE_OBJECT = OutboundTextMessage.class
			.getName();

	/**
	 * Default constructor.
	 */
	public JMSOutboundMsgQueueSenderBean() {
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

}
