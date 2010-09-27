package org.teksme.server.common.messaging;

import java.io.IOException;
import java.util.logging.Logger;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConnectionParameters;

public final class AMQPBrokerManager {

	private static Logger logger = Logger.getLogger(AMQPBrokerManager.class.getName());

	protected Connection connect() throws IOException {

		logger.info("Connecting to RabbitMQ AMQP broker...");

		String host = AMQPBrokerParameters.PROP_HOST;
		Integer portObj = AMQPBrokerParameters.PROP_PORT;

		ConnectionParameters params = new ConnectionParameters();
		params.setUsername(AMQPBrokerParameters.PROP_USERNAME);
		params.setPassword(AMQPBrokerParameters.PROP_PASSWORD);
		params.setVirtualHost(AMQPBrokerParameters.PROP_VIRTUAL_HOST);

		ConnectionFactory connFactory = new ConnectionFactory(params);
		Connection conn = connFactory.newConnection(host, portObj == null ? -1 : portObj.intValue());

		logger.info("RabbitMQ AMQP broker connected!");

		return conn;
	}

	protected void declareQueueing(Connection conn) throws IOException {

		final boolean durable = true;
		final boolean autoDelete = false;
		final boolean exclusive = false;
		final String type = "direct";

		final String routingKey = AMQPQueues.OUTBOUND_SMS_ROUTING_KEY;
		String exchangeName = AMQPQueues.OUTBOUND_EXCHANGE;
		String queueName = AMQPQueues.OUTBOUND_QUEUE;

		Channel channel = conn.createChannel();

		channel.exchangeDeclare(exchangeName, type, durable);
		channel.queueDeclare(queueName, durable, exclusive, autoDelete, false, null);
		channel.queueBind(queueName, exchangeName, routingKey);

		logger.info("Declaring exchange ["+exchangeName+"] and queue ["+queueName+"]");
		
	}
}
