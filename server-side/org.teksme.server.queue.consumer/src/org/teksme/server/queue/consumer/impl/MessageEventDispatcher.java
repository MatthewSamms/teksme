package org.teksme.server.queue.consumer.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.teksme.server.queue.consumer.MessageListener;


public class MessageEventDispatcher<M> {

	private List<MessageListener<M>> listeners = new CopyOnWriteArrayList<MessageListener<M>>();

	public void addListener(MessageListener<M> listener) {
		listeners.add(listener);
	}

	public void removeListener(MessageListener<M> listener) {
		listeners.remove(listener);
	}

	public void fire(M event) {
		for (MessageListener<M> listener : listeners) {
			listener.onMessage(event);
		}
	}
}
