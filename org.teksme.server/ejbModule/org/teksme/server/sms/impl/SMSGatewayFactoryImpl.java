package org.teksme.server.sms.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.smslib.AGateway;
import org.smslib.http.BulkSmsHTTPGateway;
import org.smslib.http.ClickatellHTTPGateway;
import org.smslib.modem.SerialModemGateway;
import org.teksme.server.SMSGatewayFactory;
import org.teksme.server.SMSGatewayKind;

public class SMSGatewayFactoryImpl implements SMSGatewayFactory {

	private static Logger logger = Logger.getLogger("SMSGatewayFactoryImpl");

	private static Map<String, Object> registry = Collections
			.synchronizedMap(new HashMap<String, Object>());

	private static SMSGatewayFactoryImpl INSTANCE = null;

	@Override
	public SerialModemGateway createSerialModemGateway() {
		final String id = Configuration.getString("modem.id");
		final String port = Configuration.getString("modem.port");
		final Integer baudrate = Integer.valueOf(Configuration
				.getString("modem.baudrate"));
		final String manufacturer = Configuration
				.getString("modem.manufacturer");
		final String model = Configuration.getString("modem.model");

		SerialModemGateway serialModemGateway = new SerialModemGateway(id,
				port, baudrate, manufacturer, model);

		final Boolean inbound = Boolean.valueOf(Configuration
				.getString("modem.inbound"));

		final Boolean outbound = Boolean.valueOf(Configuration
				.getString("modem.outbound"));

		final String pin = Configuration.getString("modem.pin");

//		SerialModemGateway gateway = new SerialModemGateway("usbmodem412", "/dev/tty.usbmodem412", 115200, "Nokia", "6212 classic");
		serialModemGateway.setInbound(true);
		serialModemGateway.setOutbound(true);
		serialModemGateway.setSimPin("0000");

//		serialModemGateway.setInbound(inbound);
//		serialModemGateway.setOutbound(outbound);
//		serialModemGateway.setSimPin(pin); //$NON-NLS-1$

		return serialModemGateway;
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
						.get(SMSGatewayFactory.class);

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

	public AGateway create(SMSGatewayKind smsGateway) {
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
