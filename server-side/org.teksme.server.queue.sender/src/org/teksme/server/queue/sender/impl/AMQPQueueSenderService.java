/**
 * Copyright 2010 TksMe, Inc.
 * TksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.teksme.server.queue.sender.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.logging.Logger;

import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.teksme.model.teks.InboundTextMessage;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.server.common.messaging.AMQPBrokerParameters;
import org.teksme.server.common.messaging.AMQPQueues;
import org.teksme.server.queue.sender.Activator;
import org.teksme.server.queue.sender.MessageQueueSender;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class AMQPQueueSenderService implements MessageQueueSender {

	Logger logger = Logger.getLogger(AMQPQueueSenderService.class.getName());

	public void publishMessage(OutboundTextMessage outboundMsg) {

		Channel lChannel = null;
		Connection lConnection = null;

		try {

			lConnection = getAMQPConnServiceReference();

			lChannel = lConnection.createChannel();

			byte[] data = convertToSend(outboundMsg);

			// Parameters to constructor for new AMQP.BasicProperties are:
			// (contentType, contentEncoding, headers, deliveryMode, priority,
			// correlationId, replyTo, expiration, messageId, timestamp,
			// type, userId, appId, clusterId)
			// http://www.rabbitmq.com/releases/rabbitmq-java-client/v2.1.0/rabbitmq-java-client-javadoc-2.1.0/

			final String contentType = "text/xml";
			final String contentEncoding = null;// outboundMsg.getEncoding(0);
			final Integer PERSISTENT = 2;
			final Integer deliveryMode = PERSISTENT;
			final Integer priority = outboundMsg.getDeliveryQueuePriority(0);
			final String replyTo = outboundMsg.getFrom(0);
			final String expiration = outboundMsg.getValidityTimeframe(0).toString();
			final String messageId = outboundMsg.getId();
			final Date timestamp = outboundMsg.getTimestamp();

			AMQP.BasicProperties messageProps = new AMQP.BasicProperties(contentType, contentEncoding, null, deliveryMode, priority, null,
					replyTo, expiration, messageId, timestamp, null, null, null, null);

			logger.info("Publishing message to queue " + AMQPQueues.OUTBOUND_EXCHANGE + " with routing key "
					+ AMQPQueues.OUTBOUND_SMS_ROUTING_KEY + "...");

			lChannel.basicPublish(AMQPQueues.OUTBOUND_EXCHANGE, AMQPQueues.OUTBOUND_SMS_ROUTING_KEY, messageProps, data);

		} catch (InvalidSyntaxException e) {
			// Shouldn't happen
			e.printStackTrace();
		} catch (Exception lIoException) {
			throw new RuntimeException(lIoException);
		} finally {
			try {
				closeChannel(lChannel);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void closeChannel(Channel channel) throws IOException {
		if (channel != null) {
			channel.abort();
			channel = null;
		}
	}

	public void publishMessage(InboundTextMessage inboundMsg) {

		try {

			Connection lConnection = getAMQPConnServiceReference();

			Channel lChannel = lConnection.createChannel();

			byte[] data = convertToSend(inboundMsg);

			// Parameters to constructor for new AMQP.BasicProperties are:
			// (contentType, contentEncoding, headers, deliveryMode, priority,
			// correlationId, replyTo,
			// expiration, messageId, timestamp, type, userId, appId, clusterId)
			// Here we're just specifying that the message is persistant
			AMQP.BasicProperties messageProperties = new AMQP.BasicProperties(null, null, null, new Integer(2), null, null, null, null,
					null, null, null, null, null, null);

			lChannel.basicPublish(AMQPQueues.INBOUND_EXCHANGE, AMQPQueues.INBOUND_QUEUE, messageProperties, data);
			lChannel.close();
			// lConnection.close();
		} catch (Exception lIoException) {
			throw new RuntimeException(lIoException);
		}

	}

	private byte[] convertToSend(Object message) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(message);
		oos.flush();
		oos.close();
		bos.close();
		byte[] data = bos.toByteArray();
		return data;
	}

	private Connection getAMQPConnServiceReference() throws InvalidSyntaxException {

		BundleContext bundleContext = Activator.getContext();

		ServiceReference result = null;
		ServiceReference[] refs = bundleContext.getServiceReferences(Connection.class.getName(),
				String.format("(%s=%s)", AMQPBrokerParameters.CONNECTION_NAME, AMQPBrokerParameters.PROP_NAME));
		if (refs != null && refs.length > 0) {
			result = refs[0];
		}

		Connection lConnection = (Connection) bundleContext.getService(result);

		return lConnection;
	}

}
