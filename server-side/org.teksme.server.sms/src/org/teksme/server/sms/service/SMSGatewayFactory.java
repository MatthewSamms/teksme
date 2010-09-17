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

package org.teksme.server.sms.service;

import java.io.IOException;

import org.smslib.GatewayException;
import org.smslib.SMSLibException;
import org.smslib.Service;
import org.smslib.TimeoutException;
import org.smslib.http.BulkSmsHTTPGateway;
import org.smslib.http.ClickatellHTTPGateway;
import org.smslib.modem.SerialModemGateway;
import org.teksme.server.sms.service.impl.SMSGatewayFactoryImpl;

public interface SMSGatewayFactory {

	SMSGatewayFactory INSTANCE = SMSGatewayFactoryImpl.init();

	SerialModemGateway createSerialModemGateway() throws TimeoutException, GatewayException, IOException, InterruptedException;

	BulkSmsHTTPGateway createBulkSmsHTTPGateway();

	ClickatellHTTPGateway createClickatellHTTPGateway();

	// DigicelHTTPGateway createDigicelHTTPGateway();

	SMSGatewayKind getDefaultSMSGatewayClazz();

	Service startSMSGateway() throws IOException, InterruptedException, SMSLibException;

	void stopSMSGateway() throws TimeoutException, GatewayException, SMSLibException, IOException, InterruptedException;

	String getSMSGatewayId();

}
