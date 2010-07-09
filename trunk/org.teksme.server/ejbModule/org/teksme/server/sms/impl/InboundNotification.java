/*
 * Copyright 2010 TksMe, Inc.
 * TksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.teksme.server.sms.impl;

import org.smslib.AGateway;
import org.smslib.IInboundMessageNotification;
import org.smslib.InboundMessage;
import org.smslib.Message.MessageTypes;

public class InboundNotification implements IInboundMessageNotification {
	public void process(AGateway gateway, MessageTypes msgType,
			InboundMessage msg) {
		if (msgType == MessageTypes.INBOUND)
			System.out
					.println(">>> New Inbound message detected from Gateway: "
							+ gateway.getGatewayId());
		else if (msgType == MessageTypes.STATUSREPORT)
			System.out
					.println(">>> New Inbound Status Report message detected from Gateway: "
							+ gateway.getGatewayId());
		System.out.println(msg);
	}
}
