package org.teksme.server.queue.consumer.impl;

import org.teksme.model.teks.Message;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.server.queue.consumer.MessageEventSource;
import org.teksme.server.queue.consumer.MessageListener;

public class EventTest implements MessageEventSource<Message> {

	private final MessageEventDispatcher<Message> dispatcher = new MessageEventDispatcher<Message>();

	public void addMessageListener(MessageListener<Message> listener) {
		dispatcher.addListener(listener);
	}

	public void go() {
		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		// Create an instance of Teks
		OutboundTextMessage outMsg = factory.createOutboundTextMessage();
		dispatcher.fire(outMsg);
	}

	public static void main(String[] args) {
		EventTest tester = new EventTest();
		tester.addMessageListener(new OutboundSMSHandler());
		tester.go();
	}

}

class Handler<T> implements MessageListener<Message> {

	public void onMessage(Message recvMsg) {
		System.out.println("Handler.onMessage()");

	}

}
