package org.teksme.server.mail.parser;

import java.io.IOException;

import org.teksme.model.teks.Teks;

public class TeksModelBuilderDirector {

	private TeksBuilder outboundSMSBuilder;

	public void setOutboundSMSBuilder(TeksBuilder sb) {
		outboundSMSBuilder = sb;
	}

	public Teks getTeksModel() {
		return outboundSMSBuilder.getTeksModel();
	}

	public void constructTeksModel() throws IOException {
		outboundSMSBuilder.createNewTeksModel();
		outboundSMSBuilder.buildModelDoc();
		outboundSMSBuilder.buildModelHeader();
		outboundSMSBuilder.buildModelBody();
	}

}
