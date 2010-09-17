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

package org.teksme.server.sms.service.impl;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.smslib.AGateway;
import org.smslib.AGateway.Protocols;
import org.smslib.GatewayException;
import org.smslib.SMSLibException;
import org.smslib.Service;
import org.smslib.TimeoutException;
import org.smslib.http.BulkSmsHTTPGateway;
import org.smslib.http.ClickatellHTTPGateway;
import org.smslib.modem.SerialModemGateway;
import org.teksme.server.sms.Configuration;
import org.teksme.server.sms.modem.CallNotification;
import org.teksme.server.sms.modem.GatewayStatusNotification;
import org.teksme.server.sms.modem.InboundNotification;
import org.teksme.server.sms.modem.OrphanedMessageNotification;
import org.teksme.server.sms.modem.OutboundNotification;
import org.teksme.server.sms.service.SMSGatewayFactory;
import org.teksme.server.sms.service.SMSGatewayKind;

public class SMSGatewayFactoryImpl implements SMSGatewayFactory {

	private static Logger logger = Logger.getLogger(SMSGatewayFactoryImpl.class.getName());

	private static Map<String, Object> registry = Collections.synchronizedMap(new HashMap<String, Object>());

	private static SMSGatewayFactoryImpl INSTANCE = null;

	private String gatewayId = null;

	public void stopSMSGateway() throws TimeoutException, GatewayException, SMSLibException, IOException, InterruptedException {
		Service srv = (Service) registry.get(Service.class.getSimpleName());

		if (srv != null) {

			registry.remove(Service.class.getSimpleName());
			srv.stopService();

		}
	}

	public String getSMSGatewayId() {
		return this.gatewayId;
	}

	public Service startSMSGateway() throws IOException, InterruptedException, SMSLibException {

		Service srv = (Service) registry.get(Service.class.getSimpleName());

		if (srv != null) {

			return srv;

		} else {

			srv = new Service();

			if (getDefaultSMSGatewayClazz() == SMSGatewayKind.SERIAL_MODEM) {

				SerialModemGateway serialModemGateway = createSerialModemGateway();
				// Set the modem protocol to PDU (alternative is TEXT). PDU is
				// the
				// default, anyway...
				serialModemGateway.setProtocol(Protocols.PDU);
				srv.addGateway(serialModemGateway);
				srv.startService();

				logger.info("Modem Information:");
				logger.info("  Manufacturer: " + serialModemGateway.getManufacturer());
				logger.info("  Model: " + serialModemGateway.getModel());
				logger.info("  Serial No: " + serialModemGateway.getSerialNo());
				logger.info("  SIM IMSI: " + serialModemGateway.getImsi());
				logger.info("  Signal Level: " + serialModemGateway.getSignalLevel() + "%");
				logger.info("  Battery Level: " + serialModemGateway.getBatteryLevel() + "%");

			} else if (getDefaultSMSGatewayClazz() == SMSGatewayKind.CLICKATELL_HTTP_GATEWAY) {

				ClickatellHTTPGateway clickatellHTTPGateway = createClickatellHTTPGateway();
				// Set the modem protocol to PDU (alternative is TEXT). PDU is
				// the
				// default, anyway...
				clickatellHTTPGateway.setProtocol(Protocols.PDU);
				srv.addGateway(clickatellHTTPGateway);
				srv.startService();

			}

			OutboundNotification outboundNotification = new OutboundNotification();

			// Create the notification callback method for inbound & status
			// report
			// messages.
			InboundNotification inboundNotification = new InboundNotification();

			// Create the notification callback method for inbound voice calls.
			CallNotification callNotification = new CallNotification();

			// Create the notification callback method for gateway statuses.
			GatewayStatusNotification statusNotification = new GatewayStatusNotification();

			OrphanedMessageNotification orphanedMessageNotification = new OrphanedMessageNotification();

			// Set up the notification methods.
			srv.setInboundMessageNotification(inboundNotification);
			srv.setCallNotification(callNotification);
			srv.setGatewayStatusNotification(statusNotification);
			srv.setOrphanedMessageNotification(orphanedMessageNotification);
			srv.setOutboundMessageNotification(outboundNotification);

			registry.put(Service.class.getSimpleName(), srv);

			return srv;
		}

	}

	public SerialModemGateway createSerialModemGateway() throws TimeoutException, GatewayException, IOException, InterruptedException {

		SerialModemGateway theSerialModemGateway = (SerialModemGateway) registry.get(SerialModemGateway.class.getSimpleName());

		if (theSerialModemGateway != null) {
			return theSerialModemGateway;

		} else {

			final String id = Configuration.getString("modem.id");
			this.gatewayId = id;

			final String port = Configuration.getString("modem.port");
			final Integer baudrate = Integer.valueOf(Configuration.getString("modem.baudrate"));
			final String manufacturer = Configuration.getString("modem.manufacturer");
			final String model = Configuration.getString("modem.model");

			theSerialModemGateway = new SerialModemGateway(id, port, baudrate, manufacturer, model);

			final Boolean inbound = Boolean.valueOf(Configuration.getString("modem.inbound"));

			final Boolean outbound = Boolean.valueOf(Configuration.getString("modem.outbound"));

			final String pin = Configuration.getString("modem.pin");

			theSerialModemGateway.setInbound(inbound);
			theSerialModemGateway.setOutbound(outbound);
			theSerialModemGateway.setSimPin(pin); //$NON-NLS-1$

			registry.put(SerialModemGateway.class.getSimpleName(), theSerialModemGateway);

			return theSerialModemGateway;
		}
	}

	public BulkSmsHTTPGateway createBulkSmsHTTPGateway() {
		// BulkSmsHTTPGateway bulkSmsHTTPGateway = new BulkSmsHTTPGateway();
		return null;
	}

	public ClickatellHTTPGateway createClickatellHTTPGateway() {
		ClickatellHTTPGateway clickatellGateway = (ClickatellHTTPGateway) registry.get(ClickatellHTTPGateway.class.getSimpleName());

		if (clickatellGateway != null) {
			return clickatellGateway;

		} else {

			final String id = Configuration.getString("http.gateway.id");
			this.gatewayId = id;

			final String appId = Configuration.getString("http.gateway.appid");
			final String username = Configuration.getString("http.gateway.username");
			final String passwd = Configuration.getString("http.gateway.passwd");

			clickatellGateway = new ClickatellHTTPGateway(id, appId, username, passwd);

			final Boolean inbound = Boolean.valueOf(Configuration.getString("http.gateway.inbound"));

			final Boolean outbound = Boolean.valueOf(Configuration.getString("http.gateway.outbound"));

			clickatellGateway.setInbound(inbound);
			clickatellGateway.setOutbound(outbound);

			registry.put(ClickatellHTTPGateway.class.getSimpleName(), clickatellGateway);

			return clickatellGateway;

		}
	}

	private SMSGatewayFactoryImpl() {

	}

	public static SMSGatewayFactory init() {
		try {

			if (registry.containsKey(SMSGatewayFactory.class.getSimpleName())) {
				SMSGatewayFactory theGatewayFactory = (SMSGatewayFactory) registry.get(SMSGatewayFactory.class.getSimpleName());

				if (theGatewayFactory != null) {
					return theGatewayFactory;
				}
			}

			INSTANCE = new SMSGatewayFactoryImpl();
			registry.put(SMSGatewayFactory.class.getSimpleName(), INSTANCE);

		} catch (Exception exception) {
			logger.severe(exception.getMessage());
			exception.printStackTrace();
		}
		return INSTANCE;
	}

	public AGateway create(SMSGatewayKind smsGateway) throws TimeoutException, GatewayException, IOException, InterruptedException {
		switch (smsGateway) {
		case SERIAL_MODEM:
			return createSerialModemGateway();
		case CLICKATELL_HTTP_GATEWAY:
			return createClickatellHTTPGateway();
		case DIGICEL_HTTP_GATEWAY:
			// return createDigicelHTTPGateway();
		default:
			throw new IllegalArgumentException("The class '" + smsGateway.getName() + "' is not a valid classifier");
		}
	}

	public SMSGatewayKind getDefaultSMSGatewayClazz() {
		return SMSGatewayKind.getByName(Configuration.getString("gateway.default.class"));
	}
}
