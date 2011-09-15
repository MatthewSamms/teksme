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
package org.teksme.server.sms.movistar.x2m;

import java.io.IOException;
import java.util.logging.Logger;

import org.smslib.SMSLibException;
import org.teksme.server.provider.sms.service.SMSConnectionServiceFactory;

public class SMSGatewayComponent {

	private static Logger logger = Logger.getLogger(SMSGatewayComponent.class
			.getName());

	private MovistarSMSGatewayProxy movistarGatewayProxy = null;

	private SMSConnectionServiceFactory smsConnServiceFactory = null;

	public void bind(SMSConnectionServiceFactory smsGatewayFactory) {
		this.smsConnServiceFactory = smsGatewayFactory;
	}

	public void unbind(SMSConnectionServiceFactory smsGatewayFactory) {
		this.smsConnServiceFactory = null;
	}

	protected void activate() {
		movistarGatewayProxy = new MovistarSMSGatewayProxy();
		movistarGatewayProxy.setSMSServiceFactory(smsConnServiceFactory);
		movistarGatewayProxy.startGateway();
	}

	protected void deactivate() {
		try {
			logger.info("Removing Clickatell SMS gateway...");
			smsConnServiceFactory.removeSMSGateway(movistarGatewayProxy
					.getHttpGateway());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (SMSLibException e) {
			e.printStackTrace();
		}
	}
}
