package org.teksme.server;

import org.smslib.http.BulkSmsHTTPGateway;
import org.smslib.http.ClickatellHTTPGateway;
import org.smslib.modem.SerialModemGateway;
import org.teksme.server.sms.impl.DigicelHTTPGateway;

public interface SMSGatewayFactory {

	SMSGatewayFactory INSTANCE = org.teksme.server.sms.impl.SMSGatewayFactoryImpl
			.init();

	SerialModemGateway createSerialModemGateway();

	BulkSmsHTTPGateway createBulkSmsHTTPGateway();

	ClickatellHTTPGateway createClickatellHTTPGateway();

	DigicelHTTPGateway createDigicelHTTPGateway();

	SMSGatewayKind getDefaultSMSGateway();
		
}
