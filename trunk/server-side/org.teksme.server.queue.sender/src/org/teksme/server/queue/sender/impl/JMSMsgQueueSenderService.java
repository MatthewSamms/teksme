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

import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.teksme.model.teks.InboundTextMessage;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.server.common.jms.PropertiesMQ;
import org.teksme.server.queue.sender.Activator;
import org.teksme.server.queue.sender.JMSMsgQueueSender;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * 
 * @since 0.5
 *
 */
public class JMSMsgQueueSenderService implements JMSMsgQueueSender {

	public void send(OutboundTextMessage outboundMsg) {

		BundleContext bundleContext = Activator.getContext();
		
		try {

			ServiceReference result = null;
			try {
				ServiceReference[] refs = bundleContext.getServiceReferences(Connection.class.getName(),
						String.format("(%s=%s)", PropertiesMQ.CONNECTION_NAME, PropertiesMQ.PROP_NAME));
				if (refs != null && refs.length > 0) {
					result = refs[0];
				}
			} catch (InvalidSyntaxException e) {
				// Shouldn't happen
				e.printStackTrace();
			}

			Connection lConnection = (Connection) bundleContext.getService(result);

			Channel lChannel = lConnection.createChannel();

			byte[] data = toBytes(outboundMsg);
		    
			// Parameters to constructor for new AMQP.BasicProperties are:
			// (contentType, contentEncoding, headers, deliveryMode, priority,
			// correlationId, replyTo,
			// expiration, messageId, timestamp, type, userId, appId, clusterId)
			// Here we're just specifying that the message is persistant
			AMQP.BasicProperties messageProperties = new AMQP.BasicProperties(null, null, null, new Integer(2), null, null, null, null,
					null, null, null, null, null, null);
			
			lChannel.basicPublish(PropertiesMQ.EXCHANGE_NAME_OUTBOUND, PropertiesMQ.QUEUE_NAME_OUTBOUND, messageProperties, data);
			lChannel.close();
			lConnection.close();
		} catch (Exception lIoException) {
			throw new RuntimeException(lIoException);
		}

	}


	public void send(InboundTextMessage inboundMsg) {
		
		BundleContext bundleContext = Activator.getContext();
		
		try {

			ServiceReference result = null;
			try {
				ServiceReference[] refs = bundleContext.getServiceReferences(Connection.class.getName(),
						String.format("(%s=%s)", PropertiesMQ.CONNECTION_NAME, PropertiesMQ.PROP_NAME));
				if (refs != null && refs.length > 0) {
					result = refs[0];
				}
			} catch (InvalidSyntaxException e) {
				// Shouldn't happen
				e.printStackTrace();
			}

			Connection lConnection = (Connection) bundleContext.getService(result);

			Channel lChannel = lConnection.createChannel();

			byte[] data = toBytes(inboundMsg);
			
			// Parameters to constructor for new AMQP.BasicProperties are:
			// (contentType, contentEncoding, headers, deliveryMode, priority,
			// correlationId, replyTo,
			// expiration, messageId, timestamp, type, userId, appId, clusterId)
			// Here we're just specifying that the message is persistant
			AMQP.BasicProperties messageProperties = new AMQP.BasicProperties(null, null, null, new Integer(2), null, null, null, null,
					null, null, null, null, null, null);
			
			lChannel.basicPublish(PropertiesMQ.EXCHANGE_NAME_INBOUND, PropertiesMQ.QUEUE_NAME_INBOUND, messageProperties, data);
			lChannel.close();
			lConnection.close();
		} catch (Exception lIoException) {
			throw new RuntimeException(lIoException);
		}

	}
	
	
	private byte[] toBytes(Object message) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
		ObjectOutputStream oos = new ObjectOutputStream(bos); 
		oos.writeObject(message);
		oos.flush(); 
		oos.close(); 
		bos.close();
		byte [] data = bos.toByteArray();
		return data;
	}


}
