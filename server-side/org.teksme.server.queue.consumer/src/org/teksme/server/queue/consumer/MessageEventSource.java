package org.teksme.server.queue.consumer;


public interface MessageEventSource<M> {

	void addMessageListener(MessageListener<M> listener);

}
