package org.teksme.server.queue.consumer.impl;

import java.util.logging.Logger;

import org.teksme.model.teks.OutboundTextMessage;

public class OutboundSMSHandler extends TeksMessageHandler<OutboundTextMessage> {

	Logger logger = Logger.getLogger(OutboundSMSHandler.class.getName());

	@Override
	public void consume(final OutboundTextMessage message) {

		logger.info("Message received");
	}
}
