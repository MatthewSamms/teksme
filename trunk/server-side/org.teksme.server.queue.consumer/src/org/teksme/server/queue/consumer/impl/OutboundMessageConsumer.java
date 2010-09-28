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

package org.teksme.server.queue.consumer.impl;

import java.io.IOException;

import org.teksme.model.teks.Message;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.server.common.messaging.AMQPQueues;
import org.teksme.server.queue.consumer.MessageEventSource;
import org.teksme.server.queue.consumer.MessageListener;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

/**
 * 
 * @since 0.5
 * 
 */
public class OutboundMessageConsumer extends DefaultConsumer implements MessageEventSource<Message> {

	private final MessageEventDispatcher<Message> dispatcher = new MessageEventDispatcher<Message>();

	public OutboundMessageConsumer(Channel channel) {
		super(channel);
	}

	@Override
	public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties, byte[] body) throws IOException {

		try {

			String routingKey = envelope.getRoutingKey();
			// String contentType = properties.contentType;
			long deliveryTag = envelope.getDeliveryTag();

			// TODO implement a better messaging handler
			if (AMQPQueues.OUTBOUND_SMS_ROUTING_KEY.equals(routingKey)) {
				OutboundTextMessage outMsg = (OutboundTextMessage) new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(body)).readObject();
				dispatcher.fire(outMsg);
			}

			getChannel().basicAck(deliveryTag, false);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addMessageListener(MessageListener<Message> listener) {
		dispatcher.addListener(listener);
	}

}
