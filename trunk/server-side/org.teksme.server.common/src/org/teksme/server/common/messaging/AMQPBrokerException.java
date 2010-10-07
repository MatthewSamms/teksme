package org.teksme.server.common.messaging;

@SuppressWarnings("serial")
public class AMQPBrokerException extends Exception {

	public AMQPBrokerException(String errorMessage) {
		super(errorMessage);
	}

	public AMQPBrokerException() {
		super();
	}
}
