package org.teksme.server.queue.consumer;

public interface MessageListener<M> {

	public void onMessage(M recvMsg);

}
