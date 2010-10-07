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
import org.teksme.model.teks.SMSGatewayKind;

public interface SMSConnectionServiceFactory {

	Service startSMSService() throws IOException, InterruptedException, SMSLibException;

	void stopSMSService() throws TimeoutException, GatewayException, SMSLibException, IOException, InterruptedException;

	void removeSMSGateway(AGateway httpGateway) throws IOException, InterruptedException, SMSLibException;

	void addSMSGateway(AGateway httpGateway) throws IOException, InterruptedException, SMSLibException;

	void setSMSGatewayId(String id);

	void setInboundMessageNotification(InboundNotification inboundNotification);

	// Create the notification callback method for inbound voice calls.
	void setCallNotification(CallNotification callNotification);

	// Create the notification callback method for gateway statuses.
	void setGatewayStatusNotification(GatewayStatusNotification statusNotification);

	void setOrphanedMessageNotification(OrphanedMessageNotification orphanedMessageNotification);

	void setOutboundMessageNotification(OutboundNotification outboundNotification);

	SMSGatewayKind getDefaultSMSGatewayClazz();

	String getSMSGatewayId();

	AGateway getSMSGateway(String gatewayId) throws IOException, InterruptedException, SMSLibException;

}
