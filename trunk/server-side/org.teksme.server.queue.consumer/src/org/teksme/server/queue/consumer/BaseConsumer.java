package org.teksme.server.queue.consumer;

import org.teksme.model.teks.Message;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DefaultConsumer;

public abstract class BaseConsumer extends DefaultConsumer implements MessageEventSource<Message> {

	public BaseConsumer(Channel channel) {
		super(channel);
	}

	public abstract void addMessageListener(MessageListener<Message> listener);

}
