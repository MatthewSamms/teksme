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

import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.server.sms.service.SMSOutboundMessage;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

/**
 * 
 * @since 0.5
 *
 */
public class SMSOutboundConsumer extends DefaultConsumer {

	private SMSOutboundMessage outboundMessage;
	
	public SMSOutboundConsumer(Channel channel) {
		super(channel);
	}

	@Override
	public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties, byte[] body) throws IOException {
		long deliveryTag = envelope.getDeliveryTag();

		OutboundTextMessage message = null;
		try {
			message = (OutboundTextMessage)new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(body)).readObject();
			outboundMessage.sendMessage(message);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		getChannel().basicAck(deliveryTag, false);
	}

}
