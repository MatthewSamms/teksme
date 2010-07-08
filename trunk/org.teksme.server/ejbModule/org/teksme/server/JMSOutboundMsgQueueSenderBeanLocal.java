package org.teksme.server;
import javax.ejb.Local;

import org.teksme.model.teks.OutboundTextMessage;

@Local
public interface JMSOutboundMsgQueueSenderBeanLocal {

	void send(OutboundTextMessage outboundMsg);

}
