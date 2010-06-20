package org.teksme.server.comm.sms;

import javax.ejb.Stateless;

import org.smslib.Library;
import org.smslib.OutboundMessage;
import org.smslib.Service;
import org.smslib.modem.SerialModemGateway;
import org.teksme.server.comm.SMSOutboundMessage;
import org.teksme.server.comm.SMSOutboundMessageLocal;

/**
 * Session Bean implementation class SMSSender
 */
@Stateless(name = "SMSOutboundMessageBean", mappedName="ejb/JNDI/SMSOutboundMessage")
public class SMSOutboundMessageBean implements SMSOutboundMessage,
		SMSOutboundMessageLocal {

	public SMSOutboundMessageBean() {
	}

	public void sendMessage(OutboundMessage message) throws Exception {

		Service srv;
		OutboundMessage msg;
		OutboundNotification outboundNotification = new OutboundNotification();
		System.out.println("Example: Send message from a serial gsm modem.");
		System.out.println(Library.getLibraryDescription());
		System.out.println("Version: " + Library.getLibraryVersion());
		srv = new Service();
		SerialModemGateway gateway = new SerialModemGateway("usbmodem412",
				"/dev/tty.usbmodem412", 115200, "Nokia", "6212 classic");
		gateway.setInbound(true);
		gateway.setOutbound(true);
		gateway.setSimPin("0000");
		srv.setOutboundMessageNotification(outboundNotification);
		srv.addGateway(gateway);
		srv.startService();
		System.out.println();
		System.out.println("Modem Information:");
		System.out.println("  Manufacturer: " + gateway.getManufacturer());
		System.out.println("  Model: " + gateway.getModel());
		System.out.println("  Serial No: " + gateway.getSerialNo());
		System.out.println("  SIM IMSI: " + gateway.getImsi());
		System.out.println("  Signal Level: " + gateway.getSignalLevel() + "%");
		System.out.println("  Battery Level: " + gateway.getBatteryLevel()
				+ "%");
		System.out.println();
		// Send a message synchronously.
		msg = new OutboundMessage("+12028129412", "Hello from SMSLib!");
		srv.sendMessage(msg);
		System.out.println(msg);
		// Or, send out a WAP SI message.
		// OutboundWapSIMessage wapMsg = new
		// OutboundWapSIMessage("+306948494037", new
		// URL("https://mail.google.com/"), "Visit GMail now!");
		// srv.sendMessage(wapMsg);
		// System.out.println(wapMsg);
		// You can also queue some asynchronous messages to see how the
		// callbacks
		// are called...
		// msg = new OutboundMessage("+309999999999", "Wrong number!");
		// srv.queueMessage(msg, gateway.getGatewayId());
		// msg = new OutboundMessage("+308888888888", "Wrong number!");
		// srv.queueMessage(msg, gateway.getGatewayId());
		System.out.println("Now Sleeping - Hit <enter> to terminate.");
		System.in.read();
		srv.stopService();

	}

}
