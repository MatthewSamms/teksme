package org.teksme.server;

import java.io.IOException;

import org.smslib.GatewayException;
import org.smslib.SMSLibException;
import org.smslib.Service;
import org.smslib.TimeoutException;
import org.smslib.http.BulkSmsHTTPGateway;
import org.smslib.http.ClickatellHTTPGateway;
import org.smslib.modem.SerialModemGateway;
import org.teksme.server.sms.impl.DigicelHTTPGateway;

public interface SMSGatewayFactory {

	SMSGatewayFactory INSTANCE = org.teksme.server.sms.impl.SMSGatewayFactoryImpl
			.init();

	SerialModemGateway createSerialModemGateway() throws TimeoutException,
			GatewayException, IOException, InterruptedException;

	BulkSmsHTTPGateway createBulkSmsHTTPGateway();

	ClickatellHTTPGateway createClickatellHTTPGateway();

	DigicelHTTPGateway createDigicelHTTPGateway();

	SMSGatewayKind getDefaultSMSGateway();

	Service getDefaultSMSGatewayService() throws IOException,
			InterruptedException, SMSLibException;

}
