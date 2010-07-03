package org.teksme.server.comm.sms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.smslib.AGateway;
import org.smslib.http.BulkSmsHTTPGateway;
import org.smslib.http.ClickatellHTTPGateway;
import org.smslib.modem.SerialModemGateway;
import org.teksme.server.comm.SMSGatewayFactory;
import org.teksme.server.comm.SMSGatewayKind;

public class GatewayFactoryImpl implements SMSGatewayFactory {

	private static Logger logger = Logger.getLogger("SMSGatewayFactoryImpl");

	private static Map<String, Object> registry = Collections
			.synchronizedMap(new HashMap<String, Object>());

	private static SMSGatewayFactoryImpl INSTANCE = null;

	@Override
	public SerialModemGateway createSerialModemGateway() {
		SerialModemGateway serialModemGateway = new SerialModemGateway(
				Configuration.getString("modem1.id"), //$NON-NLS-1$
				Configuration.getString("modem1.port"),
				Integer.getInteger(Configuration.getString("modem1.baundrate")),
				Configuration.getString("modem1.manufacturer"), Configuration
						.getString("modem1.model"));

		serialModemGateway.setInbound(Boolean.getBoolean(Configuration
				.getString("modem1.inbound")));
		serialModemGateway.setOutbound(Boolean.getBoolean(Configuration
				.getString("modem1.outbound")));
		serialModemGateway.setSimPin(Configuration.getString("modem1.pin")); //$NON-NLS-1$

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
				Configuration.getString("http.gateway1.id"),
				Configuration.getString("http.gateway1.appid"),
				Configuration.getString("http.gateway1.username"),
				Configuration.getString("http.gateway1.passwd"));
		gateway.setOutbound(Boolean.getBoolean(Configuration
				.getString("http.gateway1.modem1.outbound")));
		gateway.setInbound(Boolean.getBoolean(Configuration
				.getString("http.gateway1.modem1.inbound")));
		return null;
	}

	private GatewayFactoryImpl() {

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
}
