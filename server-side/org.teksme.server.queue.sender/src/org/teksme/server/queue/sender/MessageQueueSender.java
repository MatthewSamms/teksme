package org.teksme.server.queue.sender;

import org.teksme.model.teks.InboundTextMessage;
import org.teksme.model.teks.OutboundTextMessage;

public interface MessageQueueSender {

	void publishMessage(OutboundTextMessage outboundMsg);

	void publishMessage(InboundTextMessage inboundMsg);

}
