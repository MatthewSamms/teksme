/*
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.provider.sms.impl;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.smslib.AGateway;
import org.smslib.Service;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.SMSGatewayKind;
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

	public void sendMessage(OutboundMessage message) throws Exception {
		Service srv = smsConnServiceFactory.startSMSService();
		// TODO adapter Teksme outbound message to SMSlib outbound message
		ArrayList<org.smslib.OutboundMessage> msgs = adapt(message);
		final String gatewayId = message.getRouting().getName();
		AGateway gateway = smsConnServiceFactory.getSMSGateway(gatewayId);

		for (org.smslib.OutboundMessage outMessage : msgs) {
			outMessage.setGatewayId(gatewayId);
			logger.info("SMS gateway status: " + gateway.getStatus());
			if (SMSGatewayKind.CLICKATELL.getName().equals(gateway.getGatewayId()))
				logger.info("Is recipient's network covered? : " + gateway.queryCoverage(outMessage));
			srv.sendMessage(outMessage, gatewayId);
			logger.info(outMessage.toString());
		}
	}

	private ArrayList<org.smslib.OutboundMessage> adapt(OutboundMessage teksOutMsg) {
		ArrayList<org.smslib.OutboundMessage> outMsgs = new ArrayList<org.smslib.OutboundMessage>();
		String[] to = teksOutMsg.getTo().split(",");
		for (int i = 0; i < to.length; i++) {
			org.smslib.OutboundMessage msg = new org.smslib.OutboundMessage(to[i].trim(), teksOutMsg.getShout().getThis());
			msg.setId(teksOutMsg.getId());
			msg.setFrom(teksOutMsg.getFrom());
			msg.setDate(teksOutMsg.getDate());
			outMsgs.add(msg);
		}

		return outMsgs;

		// msg.setDCSMessageClass(getDCSMessageClass());
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
		// msg.setStatusReport(teksOutMsg.getDeliveryAck(0));

		// TODO teksOutMsg getFlashSms
		// msg.setFlashSms(getFlashSms());

		// TODO teksOutMsg message statuses
		// msg.setMessageStatus(getMessageStatus());
		// TODO teksOutMsg failure cause
		// msg.setFailureCause(getFailureCause());

		// msg.setRetryCount(teksOutMsg.getRetryCount());

		// TODO teksOutMsg getPriority
		// msg.setPriority(teksOutMsg.getPriority());

		// msg.setRefNo(teksOutMsg.getRefNo());

	}

}
