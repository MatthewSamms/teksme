/**
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.teksme.server.common.utils.TeksConfig.MessageMiddleware;
import org.teksme.server.common.utils.TeksConfig.MessageMiddleware.Queue;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Command;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ShutdownListener;
import com.rabbitmq.client.ShutdownSignalException;

public final class AMQPBrokerManager implements ShutdownListener {

	private static Logger logger = Logger.getLogger(AMQPBrokerManager.class.getName());

	private Connection conn;

	protected Connection connect(MessageMiddleware msgMiddlewareConfig) throws IOException {

		logger.info("Connecting to AMQP broker...");

		ConnectionFactory connFactory = new ConnectionFactory();
		connFactory.setUsername(msgMiddlewareConfig.getUsername());
		connFactory.setPassword(msgMiddlewareConfig.getPasswd());
		connFactory.setVirtualHost(msgMiddlewareConfig.getVirtualHost());
		connFactory.setHost(msgMiddlewareConfig.getHost());
		connFactory.setRequestedHeartbeat(0);
		connFactory.setPort(msgMiddlewareConfig.getPort() == null ? AMQP.PROTOCOL.PORT : msgMiddlewareConfig.getPort());

		toString(connFactory);

		try {
			conn = connFactory.newConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		conn.addShutdownListener(this);

		logger.info("RabbitMQ AMQP broker connected!");

		return conn;
	}

	protected void declareQueueing(Connection conn, MessageMiddleware config) throws IOException {

		String routingKey = null;
		String exchangeName = null;
		String queueName = null;
		String type = null;
		boolean durable = false;
		boolean autoDelete = false;
		boolean exclusive = false;

		List<MessageMiddleware.Queue> queues = config.getQueues();
		for (Queue queue : queues) {
			queueName = queue.getName();
			routingKey = queue.getKey();
			exchangeName = queue.getExchange();
			type = queue.getType();
			durable = queue.isDurable();
			autoDelete = queue.isAutoDelete();
			exclusive = queue.isExclusive();

			logger.info("Declaring exchange [" + exchangeName + "] and queue [" + queueName + "]");

			Channel channel = conn.createChannel();

			channel.exchangeDeclare(exchangeName, type, durable);
			channel.queueDeclare(queueName, durable, exclusive, autoDelete, null);

			logger.info("Binding queue [" + queueName + "] and exchange [" + exchangeName + "] to routing key [" + routingKey + "]");
			channel.queueBind(queueName, exchangeName, routingKey);

		}

	}

	protected void deleteExchange(Channel channel, String exchange) throws IOException {
		channel.exchangeDelete(exchange);
	}

	protected void deleteQueue(Channel channel, String queue) throws IOException {
		channel.queueDelete(queue);
	}

	public void shutdownCompleted(ShutdownSignalException sse) {

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
