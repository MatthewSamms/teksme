/**
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.common.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.teksme.model.teks.Channel;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.Response;
import org.teksme.model.teks.SMSGatewayKind;
import org.teksme.model.teks.Shout;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;

public class TeksModelHelper {

	public static TeksModelHelper INSTANCE = TeksModelHelper.init();

	Logger logger = Logger.getLogger(TeksModelHelper.class.getName());

	private TeksModelHelper() {
	}

	private static TeksModelHelper init() {
		if (INSTANCE == null) {
			INSTANCE = new TeksModelHelper();
		}
		return INSTANCE;
	}

	@SuppressWarnings("unchecked")
	public Teks createOutMessageFromRequest(HttpServletRequest request) throws IOException {

		final String method = request.getMethod();

		Teks teksModel = null;

		if (method.equalsIgnoreCase("GET")) {
			teksModel = TeksModelHelper.INSTANCE.createOutMessageFromRequestGet(request.getParameterMap());
		} else if (method.equalsIgnoreCase("POST")) {
			String postData = request.getParameter("data");
			if (postData != null)
				teksModel = createTeksModelFromXml(postData);
		}

		return teksModel;

	}

	public Teks createOutMessageFromRequestGet(Map<String, String[]> parameters) throws UnsupportedEncodingException {

		TeksFactory factory = TeksFactory.eINSTANCE;
		Teks teksModel = factory.createTeks();

		OutboundMessage outMsg = factory.createOutboundMessage();
		outMsg.setId(UUID.randomUUID().toString());

		byte fromBytes[] = parameters.get("from")[0].toString().getBytes("ISO-8859-1");
		byte toBytes[] = parameters.get("to")[0].toString().getBytes("ISO-8859-1");
		byte channelBytes[] = parameters.get("channel")[0].toString().getBytes("ISO-8859-1");
		byte shoutBytes[] = parameters.get("shout")[0].toString().getBytes("ISO-8859-1");

		String strfrom = new String(fromBytes, "UTF-8");
		String strTo = new String(toBytes, "UTF-8");
		String strChannel = new String(channelBytes, "UTF-8");
		String strShout = new String(shoutBytes, "UTF-8");

		outMsg.setFrom(strfrom);
		outMsg.setTo(strTo);

		Channel channel = factory.createChannel();
		channel.setChannel(new String[] { strChannel });
		outMsg.setChannels(channel);

		Shout shout = factory.createShout();
		shout.setThis(strShout);
		outMsg.setShout(shout);

		if (parameters.get("routing") != null) {
			byte routingBytes[] = parameters.get("routing")[0].toString().getBytes("ISO-8859-1");
			String strRouting = new String(routingBytes, "UTF-8");
			outMsg.setRouting(SMSGatewayKind.getByName(strRouting));
		} else {
			// default
			outMsg.setRouting(SMSGatewayKind.MOVISTAR_PERU);
		}
		outMsg.setTeksRef(teksModel);

		outMsg.setDate(new Date());

		teksModel.setOutboundMessage(0, outMsg);

		return teksModel;
	}

	public Teks createTeksModelFromXml(String xmlInput) throws IOException {

		InputStream is = new ByteArrayInputStream(xmlInput.getBytes("ASCII"));

		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new TeksResourceFactoryImpl());

		TeksPackageImpl.init();

		XMLResourceImpl load_resource = (XMLResourceImpl) resourceSet.createResource(URI.createURI("*.xml"));
		load_resource.load(is, null);

		Teks teksObj = (Teks) load_resource.getContents().get(0);

		OutboundMessage outMsg = teksObj.getOutboundMessage(0);
		outMsg.setId(UUID.randomUUID().toString());

		return teksObj;

	}

	public String getXMLFromResponseObject(Response teksResponse) throws IOException {

		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;

		// Create an instance of Teks
		Teks teksModel = factory.createTeks();
		teksModel.setResponse(teksResponse);

		return getXMLFromTeksModel(teksModel);
	}

	public String getXMLFromTeksModel(Teks teksModel) throws IOException {

		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		URI uri = URI.createPlatformResourceURI("*.xml", true);
		XMLResource xmlResource = new XMLResourceImpl(uri);
		xmlResource.getContents().add(teksModel);
		StringWriter stringWriter = new StringWriter();
		xmlResource.save(new URIConverter.WriteableOutputStream(stringWriter, xmlResource.getEncoding()), options);
		String result = stringWriter.getBuffer().toString();

		return result;

	}

}
