/*
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.teksme.server.sms.service.impl;

import java.io.IOException;
import java.io.StringReader;
import java.util.Date;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.teksme.model.teks.InboundTextMessage;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.TextMessage;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;
import org.teksme.server.sms.TeksSMSGateway;
import org.teksme.server.sms.service.SMSInboundMessage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class SMSInboundMessageBean implements SMSInboundMessage{

	private Logger logger = Logger.getLogger(SMSInboundMessageBean.class
			.getName());

	private TeksSMSGateway smsGateway = null;

	private static ResourceSet resourceSet = null;

//	@PostConstruct
	public static void setResource() {
		// create resource set and resource
		resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new TeksResourceFactoryImpl());

		TeksPackageImpl.init();

	}

	/**
	 * Default constructor.
	 * 
	 * @throws SMSLibException
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public SMSInboundMessageBean() throws IOException, InterruptedException{//,	SMSLibException {
//		smsGateway = TeksSMSGateway.getInstance();
//		smsGateway.setReceiveCycle(10000);
	}


	public void readMessage(InboundTextMessage inboundMessage) {

	}


	public InboundTextMessage createInboundMsgModelFromXml(String xmlInput)	throws IOException, SAXException, ParserConfigurationException {

		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		f.setValidating(false);

		StringReader reader = new StringReader(xmlInput);
		InputSource inputSource = new InputSource(reader);
		Document doc = f.newDocumentBuilder().parse(inputSource);
		reader.close();

		String apiId = null;
		String moMsgId = null;
		String from = null;
		String to = null;
		String timestamp = null;
		String text = null;
		String charset = null;
		String udh = null;

		logger.info("-----------------------");
		logger.info("Root element :" + doc.getDocumentElement().getNodeName());

		NodeList nList = doc.getElementsByTagName("clickmo");

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

		logger.info("[apiId = " + apiId + " | moMsgId = " + moMsgId
				+ " | from = " + from + " | to " + to + " | timestamp = "
				+ timestamp + " | text = " + text + " | charset = " + charset
				+ " | udh = " + udh + "]");

		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		// Create an instance of Teks

		InboundTextMessage inboundMsg = factory.createInboundTextMessage();

//		inboundMsg.setMoMsgId(moMsgId);
//		inboundMsg.setOriginator(from);
//		inboundMsg.setTo(to);
//		inboundMsg.setTimestamp(new Date());
//
//		TextMessage textMsg = factory.createTextMessage();
//		textMsg.setText(text);
//
//		inboundMsg.setTextMessage(textMsg);
//
//		inboundMsg.setEncoding(charset);
//
//		inboundMsg.setUdh(udh);

		return inboundMsg;

	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0)
				.getChildNodes();
		Node nValue = (Node) nlList.item(0);

		if (nValue == null)
			return null;

		return nValue.getNodeValue();
	}

	public void setReceiveCycle(int receiveCycle) {
	//	smsGateway.setReceiveCycle(receiveCycle);
	}

}
