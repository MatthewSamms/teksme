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
import java.util.logging.Logger;

import org.teksme.model.teks.Message;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.server.queue.consumer.BaseConsumer;
import org.teksme.server.queue.consumer.MessageEventDispatcher;
import org.teksme.server.queue.consumer.MessageListener;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Envelope;
import com.rabbitmq.client.ShutdownSignalException;

/**
 * 
 * @since 0.5
 * 
 */
public class OutboundMessageConsumer extends BaseConsumer {

	private final MessageEventDispatcher<Message> dispatcher = new MessageEventDispatcher<Message>();

	Logger logger = Logger.getLogger(OutboundMessageConsumer.class.getName());

	public OutboundMessageConsumer(Channel channel) {
		super(channel);
	}

	@Override
	public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties, byte[] body) throws IOException {

		try {

			String routingKey = envelope.getRoutingKey();
			// String contentType = properties.contentType;
			long deliveryTag = envelope.getDeliveryTag();

			logger.info("Oubound message consumer invoked to handle routing key: " + routingKey);

			// TODO implement a better messaging handler
//			if (AMQPQueueType.OUTBOUND_QUEUE.getSmsRoutingKey().equals(routingKey)) {
//				logger.info("Partial matching based on the message key: " + AMQPQueueType.OUTBOUND_QUEUE.getSmsRoutingKey());
				OutboundMessage outMsg = (OutboundMessage) new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(body))
						.readObject();
				logger.info("Channel(s) : " + outMsg.getChannels());
				logger.info("Gateway: " + outMsg.getRouting().getLiteral());
				dispatcher.fire(outMsg);
//			}

			getChannel().basicAck(deliveryTag, false);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void addMessageListener(MessageListener<Message> listener) {
		dispatcher.addListener(listener);
	}

	@Override
	public void handleConsumeOk(String c) {
		logger.info(this + ".handleConsumeOk(" + c + ")");
		super.handleConsumeOk(c);
	}

	@Override
	public void handleCancelOk(String c) {
		logger.info(this + ".handleCancelOk(" + c + ")");
		super.handleCancelOk(c);
	}

	@Override
	public void handleShutdownSignal(String c, ShutdownSignalException sig) {
		logger.info(this + ".handleShutdownSignal(" + c + ", " + sig + ")");
		super.handleShutdownSignal(c, sig);
	}

}
