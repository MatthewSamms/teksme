package org.teksme.server.provider.sms.impl;

import java.util.logging.Logger;

import org.smslib.AGateway;
import org.smslib.OutboundMessage;
import org.smslib.Service;
import org.teksme.model.teks.OutboundTextMessage;
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

	public void sendMessage(OutboundTextMessage message) throws Exception {
		Service srv = smsConnServiceFactory.startSMSService();
		// TODO adapter Teksme outbound message to SMSlib outbound message
		OutboundMessage msg = adapt(message);
		final String gatewayId = message.getSmsGateway().getName();
		AGateway gateway = smsConnServiceFactory.getSMSGateway(gatewayId);

		msg.setGatewayId(gatewayId);

		logger.info("SMS gateway status: " + gateway.getStatus());

		logger.info("Is recipient's network covered? : " + gateway.queryCoverage(msg));

		srv.sendMessage(msg, gatewayId);

		logger.info(msg.toString());
	}

	private OutboundMessage adapt(OutboundTextMessage teksOutMsg) {

		OutboundMessage msg = new OutboundMessage(teksOutMsg.getRecipient(0), teksOutMsg.getMessage().getText());

		// msg.setDate(teksOutMsg.getTimestamp());

		// msg.setDCSMessageClass(getDCSMessageClass());
		// msg.setId(teksOutMsg.getId());
		// msg.setGatewayId(teksOutMsg.getSmsGateway().getName());

		// TODO review
		// msg.setEncoding(MessageEncodings.valueOf(teksOutMsg.getEncoding(0)));
		// msg.setEncoding(MessageEncodings.ENC7BIT);
		// msg.setSrcPort(-1);
		// msg.setDstPort(-1);

		// msg.setType(getType());

		// msg.messageCharCount = this.messageCharCount;

		// msg.setRecipient(teksOutMsg.getRecipient(0));
		// msg.setDispatchDate(teksOutMsg.getDeliveryScheduledTime(0));
		// msg.setValidityPeriod(teksOutMsg.getValidityTimeframe(0).intValue());
		msg.setStatusReport(teksOutMsg.getDeliveryAck(0));

		// TODO teksOutMsg getFlashSms
		// msg.setFlashSms(getFlashSms());

		msg.setFrom(teksOutMsg.getFrom(0));

		// TODO teksOutMsg message statuses
		// msg.setMessageStatus(getMessageStatus());
		// TODO teksOutMsg failure cause
		// msg.setFailureCause(getFailureCause());

		// msg.setRetryCount(teksOutMsg.getRetryCount());

		// TODO teksOutMsg getPriority
		// msg.setPriority(teksOutMsg.getPriority());

		// msg.setRefNo(teksOutMsg.getRefNo());

		return msg;
	}

}
