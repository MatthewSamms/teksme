/*
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.queue.consumer.impl;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import org.teksme.server.common.messaging.AMQPServiceRegistry;
import org.teksme.server.common.utils.TeksConfig;
import org.teksme.server.common.utils.TeksConfig.MessageMiddleware;
import org.teksme.server.common.utils.TeksConfig.MessageMiddleware.Queue;
import org.teksme.server.common.utils.XmlConfiguration;
import org.teksme.server.queue.consumer.BaseConsumer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * 
 * @since 0.5
 * 
 */
public class ChannelTracker extends ServiceTracker<Object, Map<Channel, String>> {

	private static Logger logger = Logger.getLogger(ChannelTracker.class.getName());

	public ChannelTracker(BundleContext context) {
		super(context, Connection.class.getName(), null);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map<Channel, String> addingService(ServiceReference reference) {
		Connection conn = (Connection) context.getService(reference);
		String consumerTag = null;

		Map<Channel, String> registry = new HashMap<Channel, String>();
		Channel channel = null;
		try {

			XmlConfiguration read = new XmlConfiguration();

			TeksConfig.MessageMiddleware config = read.readMessageMiddlewareConfig("teks-server.xml");

			String queueName = null;

			List<MessageMiddleware.Queue> queues = config.getQueues();
			for (Queue queue : queues) {
				queueName = queue.getName();

				logger.info("Declaring basic MQ consumer for queue: " + queueName);

				channel = conn.createChannel();

				// ensure you never have more than 100 messages queued up in the
				// consumer
				channel.basicQos(100);

				Class consumerClazz;
				consumerClazz = Class.forName(queue.getConsumerClass());
				Constructor constructor = consumerClazz.getConstructor(Channel.class);

				BaseConsumer consumer = (BaseConsumer) constructor.newInstance(channel);

				// OutboundMessageConsumer consumer = new
				// OutboundMessageConsumer(channel);

				consumer.addMessageListener(new OutboundSMSHandler());
				consumerTag = channel.basicConsume(queueName, consumer);

				registry.put(channel, consumerTag);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return registry;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void removedService(ServiceReference reference, Map registry) {
		// return new AMQPServiceRegistry<Channel, String>(channel,
		// consumerTag);

		Iterator it = registry.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();

			AMQPServiceRegistry<Channel, String> pair = new AMQPServiceRegistry<Channel, String>((Channel) pairs.getKey(),
					(String) pairs.getValue());
			try {
				pair.getFst().basicCancel(pair.getSender());
				pair.getFst().close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		context.ungetService(reference);
	}
}
