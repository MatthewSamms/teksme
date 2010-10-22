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

package org.teksme.server.queue.consumer;

import java.io.IOException;
import java.util.logging.Logger;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import org.teksme.server.common.messaging.AMQPBrokerParameters;
import org.teksme.server.common.messaging.AMQPServiceRegistry;
import org.teksme.server.queue.consumer.impl.OutboundMessageConsumer;
import org.teksme.server.queue.consumer.impl.OutboundSMSHandler;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * 
 * @since 0.5
 * 
 */
public class ChannelOutboundTracker extends ServiceTracker {

	private final String queueName;

	private static Logger logger = Logger.getLogger(ChannelOutboundTracker.class.getName());

	public ChannelOutboundTracker(BundleContext context, String queueName) {
		super(context, Connection.class.getName(), null);
		this.queueName = queueName;
	}

	@Override
	public Object addingService(ServiceReference reference) {
		Connection conn = (Connection) context.getService(reference);
		String consumerTag = null;

		Channel channel = null;
		try {

//			final boolean durable = Boolean.getBoolean(AMQPBrokerParameters.DURABLE);
//			final boolean autoDelete = Boolean.getBoolean(AMQPBrokerParameters.AUTO_DELETE);
//			final boolean exclusive = Boolean.getBoolean(AMQPBrokerParameters.EXCLUSIVE);

			channel = conn.createChannel();

			// ensure you never have more than 100 messages queued up in your
			// QueueingConsumer
			channel.basicQos(100);

			// channel.queueDeclare(queueName, durable, exclusive, autoDelete,
			// null);

			logger.info("Declaring basic MQ consumer for queue: " + queueName);

			OutboundMessageConsumer consumer = new OutboundMessageConsumer(channel);
			consumer.addMessageListener(new OutboundSMSHandler());
			consumerTag = channel.basicConsume(queueName, consumer);

			return new AMQPServiceRegistry<Channel, String>(channel, consumerTag);

		} catch (IOException e) {
			System.err.println("Error subscribing consumer");
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void removedService(ServiceReference reference, Object service) {
		@SuppressWarnings("unchecked")
		AMQPServiceRegistry<Channel, String> pair = (AMQPServiceRegistry<Channel, String>) service;

		try {
			pair.getFst().basicCancel(pair.getSender());
			pair.getFst().close();
		} catch (IOException e) {
			System.err.println("Error unsubscribing consumer");
			e.printStackTrace();
		}

		context.ungetService(reference);
	}
}
