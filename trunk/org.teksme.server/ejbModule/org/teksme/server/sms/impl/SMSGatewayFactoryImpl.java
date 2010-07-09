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

package org.teksme.server.sms.impl;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.smslib.AGateway;
import org.smslib.GatewayException;
import org.smslib.SMSLibException;
import org.smslib.Service;
import org.smslib.TimeoutException;
import org.smslib.http.BulkSmsHTTPGateway;
import org.smslib.http.ClickatellHTTPGateway;
import org.smslib.modem.SerialModemGateway;
import org.teksme.server.SMSGatewayFactory;
import org.teksme.server.SMSGatewayKind;

public class SMSGatewayFactoryImpl implements SMSGatewayFactory {

	private static Logger logger = Logger.getLogger(SMSGatewayFactoryImpl.class
			.getName());

	private static Map<String, Object> registry = Collections
			.synchronizedMap(new HashMap<String, Object>());

	private static SMSGatewayFactoryImpl INSTANCE = null;

	@Override
	public Service getDefaultSMSGatewayService() throws IOException,
			InterruptedException, SMSLibException {

		Service srv = (Service) registry.get(Service.class.getSimpleName());

		if (srv != null) {

			return srv;

		} else {

			srv = new Service();

			OutboundNotification outboundNotification = new OutboundNotification();
			srv.setOutboundMessageNotification(outboundNotification);

			if (getDefaultSMSGateway() == SMSGatewayKind.SERIAL_MODEM) {

				SerialModemGateway serialModemGateway = createSerialModemGateway();
				srv.addGateway(serialModemGateway);
				srv.startService();

				logger.info("Modem Information:");
				logger.info("  Manufacturer: "
						+ serialModemGateway.getManufacturer());
				logger.info("  Model: " + serialModemGateway.getModel());
				logger.info("  Serial No: " + serialModemGateway.getSerialNo());
				logger.info("  SIM IMSI: " + serialModemGateway.getImsi());
				logger.info("  Signal Level: "
						+ serialModemGateway.getSignalLevel() + "%");
				logger.info("  Battery Level: "
						+ serialModemGateway.getBatteryLevel() + "%");

			} else if (getDefaultSMSGateway() == SMSGatewayKind.CLICKATELL_HTTP_GATEWAY) {

				ClickatellHTTPGateway clickatellHTTPGateway = createClickatellHTTPGateway();
				srv.addGateway(clickatellHTTPGateway);
				srv.startService();

			}

			registry.put(Service.class.getSimpleName(), srv);

			// srv.stopService();

			return srv;
		}

	}

	@Override
	public SerialModemGateway createSerialModemGateway()
			throws TimeoutException, GatewayException, IOException,
			InterruptedException {

		SerialModemGateway theSerialModemGateway = (SerialModemGateway) registry
				.get(SerialModemGateway.class.getSimpleName());

		if (theSerialModemGateway != null) {
			return theSerialModemGateway;

		} else {

			final String id = Configuration.getString("modem.id");
			final String port = Configuration.getString("modem.port");
			final Integer baudrate = Integer.valueOf(Configuration
					.getString("modem.baudrate"));
			final String manufacturer = Configuration
					.getString("modem.manufacturer");
			final String model = Configuration.getString("modem.model");

			theSerialModemGateway = new SerialModemGateway(id, port, baudrate,
					manufacturer, model);

			final Boolean inbound = Boolean.valueOf(Configuration
					.getString("modem.inbound"));

			final Boolean outbound = Boolean.valueOf(Configuration
					.getString("modem.outbound"));

			final String pin = Configuration.getString("modem.pin");

			theSerialModemGateway.setInbound(inbound);
			theSerialModemGateway.setOutbound(outbound);
			theSerialModemGateway.setSimPin(pin); //$NON-NLS-1$

			registry.put(SerialModemGateway.class.getSimpleName(),
					theSerialModemGateway);

			return theSerialModemGateway;
		}
	}

	@Override
	public BulkSmsHTTPGateway createBulkSmsHTTPGateway() {
		// BulkSmsHTTPGateway bulkSmsHTTPGateway = new BulkSmsHTTPGateway();
		return null;
	}

	@Override
	public DigicelHTTPGateway createDigicelHTTPGateway() {
		// BulkSmsHTTPGateway bulkSmsHTTPGateway = new BulkSmsHTTPGateway();
		return null;
	}

	@Override
	public ClickatellHTTPGateway createClickatellHTTPGateway() {
		ClickatellHTTPGateway gateway = new ClickatellHTTPGateway(
				Configuration.getString("http.gateway.id"),
				Configuration.getString("http.gateway.appid"),
				Configuration.getString("http.gateway.username"),
				Configuration.getString("http.gateway.passwd"));
		gateway.setOutbound(Boolean.getBoolean(Configuration
				.getString("http.gateway.outbound")));
		gateway.setInbound(Boolean.getBoolean(Configuration
				.getString("http.gateway.inbound")));
		return null;
	}

	private SMSGatewayFactoryImpl() {

	}

	public static SMSGatewayFactory init() {
		try {

			if (registry.containsKey(SMSGatewayFactory.class.getSimpleName())) {
				SMSGatewayFactory theGatewayFactory = (SMSGatewayFactory) registry
						.get(SMSGatewayFactory.class.getSimpleName());

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

	public AGateway create(SMSGatewayKind smsGateway) throws TimeoutException,
			GatewayException, IOException, InterruptedException {
		switch (smsGateway) {
		case SERIAL_MODEM:
			return createSerialModemGateway();
		case CLICKATELL_HTTP_GATEWAY:
			return createClickatellHTTPGateway();
		case DIGICEL_HTTP_GATEWAY:
			return createDigicelHTTPGateway();
		default:
			throw new IllegalArgumentException("The class '"
					+ smsGateway.getName() + "' is not a valid classifier");
		}
	}

	public SMSGatewayKind getDefaultSMSGateway() {
		return SMSGatewayKind.getByName(Configuration
				.getString("gateway.default.class"));
	}
}
