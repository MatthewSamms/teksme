/*
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.teksme.server.provider.sms.service;

import java.io.IOException;

import org.smslib.AGateway;
import org.smslib.GatewayException;
import org.smslib.SMSLibException;
import org.smslib.Service;
import org.smslib.TimeoutException;

public interface SMSGatewayFactory {

	public GatewayKind getDefaultSMSGatewayClazz();

	public void addSMSGateway(AGateway httpGateway) throws IOException, InterruptedException, SMSLibException;

	public Service startSMSGateway() throws IOException, InterruptedException, SMSLibException;

	public void stopSMSGateway() throws TimeoutException, GatewayException, SMSLibException, IOException, InterruptedException;

	public String getSMSGatewayId();

	public void setSMSGatewayId(String id);

	public void setInboundMessageNotification(InboundNotification inboundNotification);

	// Create the notification callback method for inbound voice calls.
	public void setCallNotification(CallNotification callNotification);

	// Create the notification callback method for gateway statuses.
	public void setGatewayStatusNotification(GatewayStatusNotification statusNotification);

	public void setOrphanedMessageNotification(OrphanedMessageNotification orphanedMessageNotification);

	public void setOutboundMessageNotification(OutboundNotification outboundNotification);

}
