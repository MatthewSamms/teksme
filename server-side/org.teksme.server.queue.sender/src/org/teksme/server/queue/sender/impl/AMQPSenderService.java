package org.teksme.server.queue.sender.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.teksme.model.teks.InboundTextMessage;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.server.common.messaging.AMQPBrokerParameters;
import org.teksme.server.common.messaging.AMQPQueues;
import org.teksme.server.queue.sender.AMQPSender;
import org.teksme.server.queue.sender.Activator;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class AMQPSenderService implements AMQPSender {

	private static final Integer PERSISTENT = 2;

	public void publishMessage(OutboundTextMessage outboundMsg) {

		Connection lConnection = getAMQPConnServiceReference();

		try {

			Channel lChannel = lConnection.createChannel();

			byte[] data = toBytes(outboundMsg);

			// Parameters to constructor for new AMQP.BasicProperties are:
			// (contentType, contentEncoding, headers, deliveryMode, priority,
			// correlationId, replyTo, expiration, messageId, timestamp,
			// type, userId, appId, clusterId)
			// http://www.rabbitmq.com/releases/rabbitmq-java-client/v2.1.0/rabbitmq-java-client-javadoc-2.1.0/

			final String contentType = "text/plain";
			final String contentEncoding = outboundMsg.getEncoding(0);
			final Integer deliveryMode = PERSISTENT;
			final Integer priority = outboundMsg.getDeliveryQueuePriority(0);
			final String replyTo = outboundMsg.getFrom(0);
			final String messageId = outboundMsg.getId();
			final Date timestamp = outboundMsg.getTimestamp();

			AMQP.BasicProperties messageProperties = new AMQP.BasicProperties(contentType, contentEncoding, null, deliveryMode, priority,
					null, replyTo, null, messageId, timestamp, null, null, null, null);

			lChannel.basicPublish(AMQPQueues.OUTBOUND_EXCHANGE, AMQPQueues.OUTBOUND_QUEUE, messageProperties, data);
			lChannel.close();
			lConnection.close();

		} catch (Exception lIoException) {
			throw new RuntimeException(lIoException);
		}

	}

	public void publishMessage(InboundTextMessage inboundMsg) {

		try {

			Connection lConnection = getAMQPConnServiceReference();

			Channel lChannel = lConnection.createChannel();

			byte[] data = toBytes(inboundMsg);

			// Parameters to constructor for new AMQP.BasicProperties are:
			// (contentType, contentEncoding, headers, deliveryMode, priority,
			// correlationId, replyTo,
			// expiration, messageId, timestamp, type, userId, appId, clusterId)
			// Here we're just specifying that the message is persistant
			AMQP.BasicProperties messageProperties = new AMQP.BasicProperties(null, null, null, new Integer(2), null, null, null, null,
					null, null, null, null, null, null);

			lChannel.basicPublish(AMQPQueues.INBOUND_EXCHANGE, AMQPQueues.INBOUND_QUEUE, messageProperties, data);
			lChannel.close();
			lConnection.close();
		} catch (Exception lIoException) {
			throw new RuntimeException(lIoException);
		}

	}

	private byte[] toBytes(Object message) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(message);
		oos.flush();
		oos.close();
		bos.close();
		byte[] data = bos.toByteArray();
		return data;
	}

	private Connection getAMQPConnServiceReference() {

		BundleContext bundleContext = Activator.getContext();

		ServiceReference result = null;
		try {
			ServiceReference[] refs = bundleContext.getServiceReferences(Connection.class.getName(),
					String.format("(%s=%s)", AMQPBrokerParameters.CONNECTION_NAME, AMQPBrokerParameters.PROP_NAME));
			if (refs != null && refs.length > 0) {
				result = refs[0];
			}
		} catch (InvalidSyntaxException e) {
			// Shouldn't happen
			e.printStackTrace();
		}

		Connection lConnection = (Connection) bundleContext.getService(result);

		return lConnection;
	}

}
