package org.teksme.client.test.model;

import java.io.IOException;
import java.io.StringReader;
import java.util.Date;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.teksme.client.test.TestUtils;
import org.teksme.model.teks.InboundTextMessage;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.TextMessage;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class CreateInboundMsgTest {

	private static final String APPID = "128552450490126";

	private static final String MODEL_FILE = "output/clickatell_mo.xml";

	@Test
	public void createInboundMsgModelFromXml() throws IOException,
			SAXException, ParserConfigurationException {

		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		f.setValidating(false);

		final String xmlInput = TestUtils.getInstance().convertXMLFileToString(
				MODEL_FILE);

		StringReader reader = new StringReader(xmlInput);
		InputSource inputSource = new InputSource(reader);
		Document doc = f.newDocumentBuilder().parse(inputSource);
		reader.close();

		System.out.println("Root element :"
				+ doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("clickmo");
		System.out.println("-----------------------");

		String apiId = null;
		String moMsgId = null;
		String from = null;
		String to = null;
		String timestamp = null;
		String text = null;
		String charset = null;
		String udh = null;

		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;

				apiId = getTagValue("api_id", eElement);
				moMsgId = getTagValue("moMsgId", eElement);
				from = getTagValue("from", eElement);
				to = getTagValue("to", eElement);
				timestamp = getTagValue("timestamp", eElement);
				text = getTagValue("text", eElement);
				charset = getTagValue("charset", eElement);
				udh = getTagValue("udh", eElement);

			}
		}

		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		// Create an instance of Teks
		Teks teksModel = factory.createTeks();
		teksModel.setAppId(APPID);

		InboundTextMessage inboundMsg = factory.createInboundTextMessage();

		inboundMsg.setMoMsgId(moMsgId);
		inboundMsg.setOriginator(from);
		inboundMsg.setTo(to);
		inboundMsg.setTimestamp(new Date());

		TextMessage textMsg = factory.createTextMessage();
		textMsg.setText(text);

		inboundMsg.setTextMessage(textMsg);

		inboundMsg.setEncoding(charset);

		inboundMsg.setUdh(udh);

	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0)
				.getChildNodes();
		Node nValue = (Node) nlList.item(0);

		if(nValue == null)
			return null;
		
		return nValue.getNodeValue();
	}
}
