package org.teksme.server.provider.sms.service;

import org.teksme.model.teks.OutboundTextMessage;

public interface SMSGatewayService {

	void sendMessage(OutboundTextMessage message) throws Exception;

}
