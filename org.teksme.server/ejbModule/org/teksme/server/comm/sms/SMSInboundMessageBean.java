package org.teksme.server.comm.sms;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.crypto.spec.SecretKeySpec;
import javax.ejb.Stateless;

import org.smslib.AGateway.Protocols;
import org.smslib.InboundMessage;
import org.smslib.InboundMessage.MessageClasses;
import org.smslib.Library;
import org.smslib.Service;
import org.smslib.crypto.AESKey;
import org.smslib.test.TestGateway;
import org.teksme.server.comm.SMSInboundMessageLocal;

/**
 * Session Bean implementation class SMSReceiver
 */
@Stateless(name = "SMSInboundMessage")
public class SMSInboundMessageBean implements SMSInboundMessageLocal {

	Service srv;

	/**
	 * Default constructor.
	 */
	public SMSInboundMessageBean() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void initializeSMSGateway() throws Exception {
		// Define a list which will hold the read messages.
		List<InboundMessage> msgList;

		// Create the notification callback method for inbound & status report
		// messages.
		InboundNotification inboundNotification = new InboundNotification();

		// Create the notification callback method for gateway statuses.
		GatewayStatusNotification statusNotification = new GatewayStatusNotification();

		OrphanedMessageNotification orphanedMessageNotification = new OrphanedMessageNotification();

		try {
			System.out
					.println("Example: Read messages from a serial gsm modem.");
			System.out.println(Library.getLibraryDescription());
			System.out.println("Version: " + Library.getLibraryVersion());

			// Create new Service object - the parent of all and the main
			// interface
			// to you.
			this.srv = new Service();

			// Create the Gateway representing the serial GSM modem.
			TestGateway gateway = new TestGateway("usbmodem622");

			// Set the modem protocol to PDU (alternative is TEXT). PDU is the
			// default, anyway...
			gateway.setProtocol(Protocols.PDU);

			// Set up the notification methods.
			this.srv.setInboundMessageNotification(inboundNotification);
			this.srv.setGatewayStatusNotification(statusNotification);
			this.srv.setOrphanedMessageNotification(orphanedMessageNotification);

			// Add the Gateway to the Service object.
			this.srv.addGateway(gateway);

			// Similarly, you may define as many Gateway objects, representing
			// various GSM modems, add them in the Service object and control
			// all of them.

			// Start! (i.e. connect to all defined Gateways)
			this.srv.startService();

			// In case you work with encrypted messages, its a good time to
			// declare your keys.
			// Create a new AES Key with a known key value.
			// Register it in KeyManager in order to keep it active. SMSLib will
			// then automatically
			// encrypt / decrypt all messages send to / received from this
			// number.
			this.srv.getKeyManager().registerKey(
					"+306948494037",
					new AESKey(new SecretKeySpec("0011223344556677".getBytes(),
							"AES")));

			// Read Messages. The reading is done via the Service object and
			// affects all Gateway objects defined. This can also be more
			// directed to a specific
			// Gateway - look the JavaDocs for information on the Service method
			// calls.
			msgList = new ArrayList<InboundMessage>();
			this.srv.readMessages(msgList, MessageClasses.ALL);
			for (InboundMessage msg : msgList)
				System.out.println(msg);

			// Sleep now. Emulate real world situation and give a chance to the
			// notifications
			// methods to be called in the event of message or voice call
			// reception.

			System.out.println("Now Sleeping - Hit <enter> to stop service.");
			System.in.read();
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.srv.stopService();
		}
	}

}
