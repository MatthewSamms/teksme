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

package org.teksme.server.sms.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.smslib.OutboundMessage;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;
import org.teksme.server.SMSOutboundMessage;
import org.teksme.server.SMSOutboundMessageLocal;
import org.teksme.server.impl.TeksModelHelper;

@Local({ SMSOutboundMessageLocal.class })
@Remote({ SMSOutboundMessage.class })
@Stateless(name = "SMSOutboundMessage", mappedName = SMSOutboundMessage.JNDI_NAME)
public class SMSOutboundMessageBean implements SMSOutboundMessage,
		SMSOutboundMessageLocal {

	private Logger logger = Logger.getLogger(SMSOutboundMessageBean.class
			.getName());

	private static final String MODEL_FILE = "/Users/fabianocruz/teks_outmsg.xml";

	private static ResourceSet resourceSet = null;

	public SMSOutboundMessageBean() {
	}

	@PostConstruct
	public static void setResourceSet() {
		// create resource set and resource
		resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new TeksResourceFactoryImpl());

		TeksPackageImpl.init();
	}

	@Override
	public void sendMessage(OutboundTextMessage message) throws Exception {

		OutboundMessage msg = new OutboundMessage(message.getRecipient(0),
				message.getTextMessage().getText());

		TeksSMSGateway.getInstance().sendMessage(msg);

		logger.info(msg.toString());

	}

	@Override
	public Teks createOutboundMsgModelFromXml(String xmlInput)
			throws IOException {

		logger.info("XML: " + xmlInput);

		InputStream is = new ByteArrayInputStream(xmlInput.getBytes("ASCII"));

		XMLResourceImpl load_resource = (XMLResourceImpl) resourceSet
				.createResource(URI.createURI("*.xml"));
		load_resource.load(is, null);

		Teks teksObj = (Teks) load_resource.getContents().get(0);

		OutboundTextMessage outMsg = teksObj.getOutboundMessage(0);
		outMsg.setId(UUID.randomUUID().toString());

		logger.info(outMsg.getTextMessage().getText());

		return teksObj;

	}

	@Override
	public void persistOutboundMessage(Teks teksObj) throws IOException {

		TeksModelHelper.INSTANCE.persistPoll(teksObj);

		serializeTeksModelXMLData(resourceSet, teksObj, MODEL_FILE);

	}

	private void serializeTeksModelXMLData(ResourceSet resourceSet2,
			Teks teksObj, String filePath) throws IOException {
		Resource resource = resourceSet.createResource(URI
				.createFileURI(filePath));
		// add the root object to the resource
		resource.getContents().add(teksObj);
		// serialize resource – you can specify also serialization
		// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
		resource.save(null);

	}

}// class
