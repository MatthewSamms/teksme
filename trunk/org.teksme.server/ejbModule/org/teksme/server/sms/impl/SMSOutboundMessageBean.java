package org.teksme.server.sms.impl;

import java.io.IOException;
import java.util.logging.Logger;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.smslib.Library;
import org.smslib.OutboundMessage;
import org.smslib.SMSLibException;
import org.smslib.Service;
import org.smslib.TimeoutException;
import org.smslib.http.ClickatellHTTPGateway;
import org.smslib.modem.SerialModemGateway;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.server.SMSGatewayFactory;
import org.teksme.server.SMSGatewayKind;
import org.teksme.server.SMSOutboundMessage;
import org.teksme.server.SMSOutboundMessageLocal;

@Local({ SMSOutboundMessageLocal.class })
@Remote({ SMSOutboundMessage.class })
@Stateless(name = "SMSOutboundMessage", mappedName = SMSOutboundMessage.JNDI_NAME)
public class SMSOutboundMessageBean implements SMSOutboundMessage,
		SMSOutboundMessageLocal {

	Logger logger = Logger.getLogger(SMSOutboundMessageBean.class.getName());

	SMSGatewayFactory factory = SMSGatewayFactory.INSTANCE;

	public SMSOutboundMessageBean() {
	}

	public void sendMessage(OutboundTextMessage message) throws Exception {

		switch (factory.getDefaultSMSGateway()) {
		case SERIAL_MODEM:
			sendMessage(message, SMSGatewayKind.SERIAL_MODEM);
		case CLICKATELL_HTTP_GATEWAY:
			sendMessage(message, factory.createClickatellHTTPGateway());
		default:
			throw new IllegalArgumentException(
					"No SMS gateway defined. Please have a look at the gateway properties file and change the configuration.");
		}

	}

	private void sendMessage(OutboundTextMessage message,
			SMSGatewayKind serialModem) throws TimeoutException,
			SMSLibException, IOException, InterruptedException {
		final Service srv;
		final OutboundMessage msg;
		final OutboundNotification outboundNotification = new OutboundNotification();
		srv = new Service();
		final SerialModemGateway serialModemGateway = factory
				.createSerialModemGateway();

		srv.setOutboundMessageNotification(outboundNotification);
		srv.addGateway(serialModemGateway);
		srv.startService();
		logger.info("Modem Information:");
		logger.info("  Manufacturer: " + serialModemGateway.getManufacturer());
		logger.info("  Model: " + serialModemGateway.getModel());
		logger.info("  Serial No: " + serialModemGateway.getSerialNo());
		logger.info("  SIM IMSI: " + serialModemGateway.getImsi());
		logger.info("  Signal Level: " + serialModemGateway.getSignalLevel()
				+ "%");
		logger.info("  Battery Level: " + serialModemGateway.getBatteryLevel()
				+ "%");
		// Send a message synchronously.
		msg = new OutboundMessage(message.getTo(0), message.getTextMessage());
		srv.sendMessage(msg);
		System.out.println(msg);
//		System.out.println("Now Sleeping - Hit <enter> to terminate.");
		System.in.read();
		srv.stopService();

	}

	private void sendMessage(OutboundTextMessage message,
			ClickatellHTTPGateway createClickatellHTTPGateway) {
		// TODO Auto-generated method stub

	}

}
