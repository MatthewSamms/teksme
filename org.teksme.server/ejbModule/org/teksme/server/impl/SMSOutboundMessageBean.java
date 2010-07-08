package org.teksme.server.impl;

import java.io.IOException;
import java.util.UUID;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.smslib.OutboundMessage;
import org.smslib.Service;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.impl.TeksPackageImpl;
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

	private static final String MODEL_FILE = "/Users/fabianocruz/teks_outmsg.xml";

	public SMSOutboundMessageBean() {
	}

	@PostConstruct
	public static void setResourceSet() {
		TeksPackageImpl.init();
	}

	public void sendMessage(OutboundTextMessage message) throws Exception {
		// Send a message synchronously.

		Service srv = factory.getDefaultSMSGatewayService();

		OutboundMessage msg = new OutboundMessage(message.getRecipient(0),
				message.getTextMessage().getText());

		// srv.sendMessage(msg);

		logger.info(msg.toString());
		// System.in.read();

	}

	@Override
	public Teks createOutboundMsgModelFromXml(String xmlInput)
			throws IOException {

		Teks teksObj = (Teks) TeksModelHelper.INSTANCE
				.createTeksModelFromXml(xmlInput);

		OutboundTextMessage outMsg = teksObj.getOutboundMessage(0);
		outMsg.setId(UUID.randomUUID().toString());

		logger.info(outMsg.getTextMessage().getText());

		TeksModelHelper.INSTANCE.serializeTeksModelXMLData(teksObj, MODEL_FILE);

		return teksObj;

	}

	@Override
	public void persistOutboundMessage(Teks teksInquiry) {

		TeksModelHelper.INSTANCE.persistPoll(teksInquiry);

	}

}// class
