package org.teksme.server.queue.sender.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.UUID;
import java.util.logging.Logger;

import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.Teks;
import org.teksme.server.common.utils.TeksModelHelper;

public class Test {

	final static String xmlBuff = "<?xml version=\"1.0\" encoding=\"ASCII\" standalone=\"no\"?><teks:Teks xmlns:teks=\"http://teksme.org/meta/1.0.0/teks\">  <outboundMessage>    <channels>      <channel>Twitter</channel>    </channels>    <to>+12028125643</to>    <shout this=\"Hello from TeksMe Cloud!\"/>    <id>ee7c4984-6853-447a-8fb1-9a7646404abf</id>    <from>+12023567865</from>    <schedule>2010-11-02T19:19:17.849-0400</schedule>    <callback>http://www.www.com</callback>    <routing>BULKSMS</routing>  </outboundMessage>  <accountSID>ACc4836ef31bb2d557bf9d5fd5f050cd93</accountSID></teks:Teks>";

	private static Logger logger = Logger.getLogger(Test.class.getName());

	public static void main(String[] args) {
		new Test().run();
	}

	public void run() {
		// logger.info("XML Buff: " + xmlBuff.toString());
		Teks teksModel;
		try {

			teksModel = TeksModelHelper.INSTANCE.createTeksModelFromXml(xmlBuff);

			OutboundMessage outMsg = teksModel.getOutboundMessage(0);
			outMsg.setId(UUID.randomUUID().toString());

			logger.info(outMsg.getShout().getThis());
			logger.info("Pls send this message to " + outMsg.getRouting().getName() + " gateway.");

			byte[] data = convertToSend(outMsg);

			outMsg = (OutboundMessage) new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(data)).readObject();

			logger.info("Channel(s) : " + outMsg.getChannels());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static byte[] convertToSend(Object message) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(message);
		oos.flush();
		oos.close();
		bos.close();
		byte[] data = bos.toByteArray();
		return data;
	}
}
