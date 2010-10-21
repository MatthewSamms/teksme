/**
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
package org.teksme.server.common.messaging;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Command;
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
		connFactory.setRequestedHeartbeat(0);
		connFactory.setPort(portObj == null ? AMQP.PROTOCOL.PORT : portObj.intValue());

		toString(connFactory);

		Connection conn = connFactory.newConnection();

		conn.addShutdownListener(this);

		logger.info("RabbitMQ AMQP broker connected!");

		return conn;
	}

	protected void declareQueueing(Connection conn, AMQPQueueType queueType) throws IOException {

		final boolean durable = Boolean.getBoolean(AMQPBrokerParameters.DURABLE);
		final boolean autoDelete = Boolean.getBoolean(AMQPBrokerParameters.AUTO_DELETE);
		final boolean exclusive = Boolean.getBoolean(AMQPBrokerParameters.EXCLUSIVE);
		final String type = AMQPBrokerParameters.TYPE;

		final String routingKey = queueType.getSmsRoutingKey();
		String exchangeName = queueType.getExchange();
		String queueName = queueType.getQueue();

		Channel channel = conn.createChannel();

		channel.exchangeDeclare(exchangeName, type, durable);
		channel.queueDeclare(queueName, durable, exclusive, autoDelete, null);
		channel.queueBind(queueName, exchangeName, routingKey);

		logger.info("Declaring exchange [" + exchangeName + "] and queue [" + queueName + "]");

	}

	protected void deleteExchange(Channel channel, String exchange) throws IOException {
		channel.exchangeDelete(exchange);
	}

	protected void deleteQueue(Channel channel, String queue) throws IOException {
		channel.queueDelete(queue);
	}

	public void shutdownCompleted(ShutdownSignalException sse) {
		// TODO Auto-generated method stub

		Connection conn = (Connection) sse.getReference();
		Command closeCommand = (Command) sse.getReason();
		if (sse.isHardError()) {
			if (!sse.isInitiatedByApplication()) {
				AMQP.Connection.Close closeMethod = (AMQP.Connection.Close) closeCommand.getMethod();
				logger.log(Level.SEVERE, "Connection host [" + conn.getHost() + "] closed. Shutdown reason: " + closeMethod.getReplyCode());
			}
		} else {
			Channel ch = (Channel) sse.getReference();
			logger.info("Connection host [" + conn.getHost() + "] closed. Shutdown reason: " + ch.getCloseReason());
		}

		logger.info("RabbitMQ AMQP broker shutdown completed!");

	}

	private void toString(ConnectionFactory connFactory) {
		logger.info("[ Username: " + connFactory.getUsername() + " | Password: ****** | Virtual Host: " + connFactory.getVirtualHost()
				+ " | Host: " + connFactory.getHost() + " | Port: " + connFactory.getPort() + " ]");
	}

}
