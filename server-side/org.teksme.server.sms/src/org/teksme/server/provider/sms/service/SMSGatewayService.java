package org.teksme.server.provider.sms.service;

import org.teksme.model.teks.OutboundMessage;

public interface SMSGatewayService {

	void sendMessage(OutboundMessage message) throws Exception;

}
