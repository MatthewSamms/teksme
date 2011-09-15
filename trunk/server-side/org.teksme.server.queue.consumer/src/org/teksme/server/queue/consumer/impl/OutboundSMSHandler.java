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
package org.teksme.server.queue.consumer.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.teksme.model.teks.OutboundMessage;
import org.teksme.server.provider.sms.service.SMSGatewayService;

public class OutboundSMSHandler extends TeksMessageHandler<OutboundMessage> {

	Logger logger = Logger.getLogger(OutboundSMSHandler.class.getName());

	public static Map<String, Object> registry = Collections.synchronizedMap(new HashMap<String, Object>());

	private SMSGatewayService smsGateway = null;

	public void bind(SMSGatewayService smsGateway) {
		this.smsGateway = smsGateway;
	}

	public void unbind(SMSGatewayService smsGateway) {
		this.smsGateway = null;
	}

	protected void activate() {
		registry.put(SMSGatewayService.class.getSimpleName(), smsGateway);

	}

	protected void deactivate() {
	}

	@Override
	public void consume(final OutboundMessage message) {

		logger.info("Message received");

		SMSGatewayService smsGateway = (SMSGatewayService) registry.get(SMSGatewayService.class.getSimpleName());

		try {
			smsGateway.sendMessage(message);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
