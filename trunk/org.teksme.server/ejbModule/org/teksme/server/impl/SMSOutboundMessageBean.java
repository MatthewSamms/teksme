package org.teksme.server.impl;

import java.util.logging.Logger;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.smslib.OutboundMessage;
import org.smslib.Service;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.server.SMSGatewayFactory;
import org.teksme.server.SMSOutboundMessage;
import org.teksme.server.SMSOutboundMessageLocal;

@Local({ SMSOutboundMessageLocal.class })
@Remote({ SMSOutboundMessage.class })
@Stateless(name = "SMSOutboundMessage", mappedName = SMSOutboundMessage.JNDI_NAME)
public class SMSOutboundMessageBean implements SMSOutboundMessage,
		SMSOutboundMessageLocal {

	private Logger logger = Logger.getLogger(SMSOutboundMessageBean.class
			.getName());

	private SMSGatewayFactory factory = SMSGatewayFactory.INSTANCE;

	public SMSOutboundMessageBean() {
	}

	public void sendMessage(OutboundTextMessage message) throws Exception {
		// Send a message synchronously.

		Service srv = factory.getDefaultSMSGatewayService();

		OutboundMessage msg = new OutboundMessage(message.getRecipient(0),
				message.getText());

		// srv.sendMessage(msg);

		logger.info(msg.toString());
		// System.in.read();

	}

}
