package org.teksme.server.mail.parser;

import org.teksme.model.teks.SMSGatewayKind;

public class Test {
	public static void main(String[] args) {
		String smsGtw = "BULKSMS";
		System.out.println(SMSGatewayKind.getByName(smsGtw));
	}
}
