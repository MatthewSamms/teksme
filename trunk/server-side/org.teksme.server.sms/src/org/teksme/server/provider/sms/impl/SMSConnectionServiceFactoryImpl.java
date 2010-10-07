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

package org.teksme.server.provider.sms.impl;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.smslib.AGateway;
import org.smslib.GatewayException;
import org.smslib.Library;
import org.smslib.SMSLibException;
import org.smslib.Service;
import org.smslib.TimeoutException;
import org.teksme.model.teks.SMSGatewayKind;
import org.teksme.server.provider.sms.Configuration;
import org.teksme.server.provider.sms.service.CallNotification;
import org.teksme.server.provider.sms.service.GatewayStatusNotification;
import org.teksme.server.provider.sms.service.InboundNotification;
import org.teksme.server.provider.sms.service.OrphanedMessageNotification;
import org.teksme.server.provider.sms.service.OutboundNotification;
import org.teksme.server.provider.sms.service.SMSConnectionServiceFactory;

public class SMSConnectionServiceFactoryImpl implements SMSConnectionServiceFactory {

	private String gatewayId = null;

	private static Logger logger = Logger.getLogger(SMSConnectionServiceFactoryImpl.class.getName());

	public static Map<String, Object> registry = Collections.synchronizedMap(new HashMap<String, Object>());

	public void stopSMSService() throws TimeoutException, GatewayException, SMSLibException, IOException, InterruptedException {
		Service srv = (Service) registry.get(Service.class.getSimpleName());
		if (srv != null) {
			logger.info("Stoping TeksMe SMS broker...");
			registry.remove(Service.class.getSimpleName());
			srv.stopService();
		}
	}

	public AGateway getSMSGateway(String gatewayId) throws TimeoutException, GatewayException, SMSLibException, IOException,
			InterruptedException {
		Service srv = (Service) registry.get(Service.class.getSimpleName());
		AGateway gateway = null;
		if (srv != null) {
			logger.info("Retrieving Gateway Id >> " + gatewayId);
			gateway = srv.getGateway(gatewayId);
		}
		return gateway;
	}

	public void stopSMSGateway(AGateway httpGateway) throws TimeoutException, GatewayException, SMSLibException, IOException,
			InterruptedException {
		Service srv = (Service) registry.get(Service.class.getSimpleName());
		if (srv != null) {
			logger.info("Stoping SMS gateway >> Id: " + httpGateway.getGatewayId());
			httpGateway.stopGateway();
		}
	}

	public void addSMSGateway(AGateway httpGateway) throws IOException, InterruptedException, SMSLibException {
		Service srv = (Service) registry.get(Service.class.getSimpleName());
		if (httpGateway != null) {
			srv.stopService();
			logger.info("Adding SMS gateway >> Id: " + httpGateway.getGatewayId());
			srv.addGateway(httpGateway);
			srv.startService();
		}
	}

	public void removeSMSGateway(AGateway httpGateway) throws IOException, InterruptedException, SMSLibException {
		Service srv = (Service) registry.get(Service.class.getSimpleName());
		if (httpGateway != null) {
			logger.info("Removing SMS gateway >> Id: " + httpGateway.getGatewayId());
			srv.stopService();
			srv.removeGateway(httpGateway);
			srv.startService();
		}
	}

	public Service startSMSService() throws IOException, InterruptedException, SMSLibException {
		Service srv = (Service) registry.get(Service.class.getSimpleName());
		if (srv != null) {
			return srv;
		} else {
			logger.info("Starting TeksMe SMS broker...");
			logger.info("Provider: " + Library.getLibraryDescription());
			logger.info("Version: " + Library.getLibraryVersion());
			srv = new Service();
		}
		registry.put(Service.class.getSimpleName(), srv);
		return srv;
	}

	// Create the notification callback method for inbound & status report
	// messages.
	public void setInboundMessageNotification(InboundNotification inboundNotification) {
		Service srv = (Service) registry.get(Service.class.getSimpleName());
		srv.setInboundMessageNotification(inboundNotification);
	}

	// Create the notification callback method for inbound voice calls.
	public void setCallNotification(CallNotification callNotification) {
		Service srv = (Service) registry.get(Service.class.getSimpleName());
		srv.setCallNotification(callNotification);

	}

	// Create the notification callback method for gateway statuses.
	public void setGatewayStatusNotification(GatewayStatusNotification statusNotification) {
		Service srv = (Service) registry.get(Service.class.getSimpleName());
		srv.setGatewayStatusNotification(statusNotification);

	}

	public void setOrphanedMessageNotification(OrphanedMessageNotification orphanedMessageNotification) {
		Service srv = (Service) registry.get(Service.class.getSimpleName());
		srv.setOrphanedMessageNotification(orphanedMessageNotification);
	}

	public void setOutboundMessageNotification(OutboundNotification outboundNotification) {
		Service srv = (Service) registry.get(Service.class.getSimpleName());
		srv.setOutboundMessageNotification(outboundNotification);

	}

	public SMSGatewayKind getDefaultSMSGatewayClazz() {
		return SMSGatewayKind.getByName(Configuration.getString("gateway.default.class"));
	}

	public String getSMSGatewayId() {
		return this.gatewayId;
	}

	public void setSMSGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

}
