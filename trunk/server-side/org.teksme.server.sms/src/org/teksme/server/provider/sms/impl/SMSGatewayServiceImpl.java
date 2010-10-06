package org.teksme.server.provider.sms.impl;

import java.util.logging.Logger;

import org.smslib.AGateway;
import org.smslib.OutboundMessage;
import org.smslib.Service;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.server.provider.sms.service.GatewayKind;
import org.teksme.server.provider.sms.service.SMSConnectionServiceFactory;
import org.teksme.server.provider.sms.service.SMSGatewayService;

public class SMSGatewayServiceImpl implements SMSGatewayService {

	private static Logger logger = Logger.getLogger(SMSGatewayServiceImpl.class.getName());

	private SMSConnectionServiceFactory smsConnServiceFactory = null;

	public void bind(SMSConnectionServiceFactory smsGatewayFactory) {
		this.smsConnServiceFactory = smsGatewayFactory;
	}

	public void unbind(SMSConnectionServiceFactory smsGatewayFactory) {
		this.smsConnServiceFactory = null;
	}

	public void sendMessage(OutboundTextMessage message, GatewayKind gatewayType) throws Exception {
		Service srv = smsConnServiceFactory.startSMSService();
		// TODO adapter Teksme outbound message to SMSlib outbound message
		OutboundMessage msg = new OutboundMessage("+552197694913", "Hello from TeksMe (Clickatell handler)");
		AGateway gateway = smsConnServiceFactory.getSMSGateway(gatewayType.getName());
		System.out.println("Is recipient's network covered? : " + gateway.queryCoverage(msg));
		srv.sendMessage(msg);
		logger.info(msg.toString());
	}

}
