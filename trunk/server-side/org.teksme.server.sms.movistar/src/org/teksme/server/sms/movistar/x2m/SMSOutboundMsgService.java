package org.teksme.server.sms.movistar.x2m;

import java.io.IOException;

import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.Teks;
import org.teksme.server.sms.movistar.x2m.impl.MovistartX2MGateway;
import org.teksme.server.sms.service.SMSOutboundMessage;

public class SMSOutboundMsgService implements SMSOutboundMessage {

	public void sendMessage(OutboundTextMessage message) throws Exception {
		try {
			new MovistartX2MGateway().sendMessage(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Teks createOutboundMsgModelFromXml(String xmlInput)
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public void persistOutboundMessage(Teks teksInquiry) throws IOException {
		// TODO Auto-generated method stub

	}

}
