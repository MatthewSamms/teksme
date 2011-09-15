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

package org.teksme.server.sms.clickatell;

import java.io.IOException;
import java.util.logging.Logger;

import org.smslib.AGateway;
import org.smslib.SMSLibException;
import org.teksme.model.teks.SMSGatewayKind;
import org.teksme.server.provider.sms.service.SMSConnectionServiceFactory;

public class ClickatellSMSGateway {

	private static Logger logger = Logger.getLogger(ClickatellSMSGateway.class
			.getName());

	private AGateway httpGateway = null;

	private SMSConnectionServiceFactory smsConnServiceFactory = null;

	public void startGateway() {
		try {
			smsConnServiceFactory.startSMSService();
			httpGateway = createClickatellHTTPGateway();
			logger.info("Starting Clickatell SMS gateway...");
			smsConnServiceFactory.addSMSGateway(httpGateway);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (SMSLibException e) {
			e.printStackTrace();
		}
	}

	private ClickatellHTTPGateway createClickatellHTTPGateway() {

		final String id = SMSGatewayKind.CLICKATELL.getName();
		// BundleConfig.getString("http.gateway.id");
		// this.setSMSGatewayId(id);

		final String appId = Configuration.getString("http.gateway.appid");
		final String username = Configuration
				.getString("http.gateway.username");
		final String passwd = Configuration.getString("http.gateway.passwd");

		ClickatellHTTPGateway clickatellGateway = new ClickatellHTTPGateway(id,
				appId, username, passwd);

		final Boolean inbound = Boolean.valueOf(Configuration
				.getString("http.gateway.inbound"));

		final Boolean outbound = Boolean.valueOf(Configuration
				.getString("http.gateway.outbound"));

		clickatellGateway.setInbound(inbound);
		clickatellGateway.setOutbound(outbound);

		return clickatellGateway;
	}

	public void setSMSServiceFactory(
			SMSConnectionServiceFactory smsServiceFactory) {
		this.smsConnServiceFactory = smsServiceFactory;
	}

	protected AGateway getHttpGateway() {
		return httpGateway;
	}

}
