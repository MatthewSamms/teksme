package org.teksme.server.common.messaging;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ShutdownListener;
import com.rabbitmq.client.ShutdownSignalException;
import com.rabbitmq.client.impl.ClientVersion;

public final class AMQPBrokerManager implements ShutdownListener {

	private static Logger logger = Logger.getLogger(AMQPBrokerManager.class.getName());

	protected Connection connect() throws IOException {

		logger.info("Connecting to AMQP broker...");
		logger.info("RabbitMQ client version: " + ClientVersion.VERSION);

		String host = AMQPBrokerParameters.PROP_HOST;
		Integer portObj = AMQPBrokerParameters.PROP_PORT;

		ConnectionFactory connFactory = new ConnectionFactory();
		connFactory.setUsername(AMQPBrokerParameters.PROP_USERNAME);
		connFactory.setPassword(AMQPBrokerParameters.PROP_PASSWORD);
		connFactory.setVirtualHost(AMQPBrokerParameters.PROP_VIRTUAL_HOST);
		connFactory.setHost(host);
		connFactory.setPort(portObj == null ? AMQP.PROTOCOL.PORT : portObj.intValue());

		Connection conn = connFactory.newConnection();

		conn.addShutdownListener(this);

		logger.info("RabbitMQ AMQP broker connected!");

		return conn;
	}

	protected void declareQueueing(Connection conn) throws IOException {

		final boolean durable = Boolean.getBoolean(AMQPQueues.CHANNEL.DURABLE);
		final boolean autoDelete = Boolean.getBoolean(AMQPQueues.CHANNEL.AUTO_DELETE);
		final boolean exclusive = Boolean.getBoolean(AMQPQueues.CHANNEL.EXCLUSIVE);
		final String type = AMQPQueues.CHANNEL.TYPE;

		final String routingKey = AMQPQueues.OUTBOUND_SMS_ROUTING_KEY;
		String exchangeName = AMQPQueues.OUTBOUND_EXCHANGE;
		String queueName = AMQPQueues.OUTBOUND_QUEUE;

		Channel channel = conn.createChannel();

		channel.exchangeDeclare(exchangeName, type, durable);
		channel.queueDeclare(queueName, durable, exclusive, autoDelete, null);
		channel.queueBind(queueName, exchangeName, routingKey);

		logger.info("Declaring exchange [" + exchangeName + "] and queue [" + queueName + "]");

	}

	public void shutdownCompleted(ShutdownSignalException cause) {
		// TODO Auto-generated method stub

		Connection conn = (Connection) cause.getReference();
		if (cause.isHardError()) {
			if (!cause.isInitiatedByApplication()) {
				Object reason = cause.getReason();
				logger.log(Level.SEVERE, "Connection host [" + conn.getHost() + "] closed. Shutdown reason: " + reason);
			}
		} else {
			Channel ch = (Channel) cause.getReference();
			logger.info("Connection host [" + conn.getHost() + "] closed. Shutdown reason: " + ch.getCloseReason());
		}

		logger.info("RabbitMQ AMQP broker shutdown completed!");

	}

}
