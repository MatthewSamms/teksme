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

package org.teksme.server.remote.service.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.teksme.model.teks.ChannelKind;
import org.teksme.model.teks.Developer;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.TextMessage;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.server.common.persistence.IPersistenceManager;
import org.teksme.server.common.persistence.IPersistenceManagerFactory;
import org.teksme.server.common.persistence.PersistenceException;
import org.teksme.server.common.utils.TeksModelHelper;
import org.teksme.server.queue.sender.MessageQueueSender;

@SuppressWarnings("serial")
public class SendMessageServlet extends HttpServlet {

	private static String message = "Error during Servlet processing";

	private static Logger logger = Logger.getLogger(SendMessageServlet.class.getName());

	private MessageQueueSender queueSender;

	private IPersistenceManagerFactory persistenceMgrFactory;

	public SendMessageServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}

	private void execute(HttpServletRequest request, HttpServletResponse response) {

		String devId = request.getParameter("dev_id");
		String apiId = request.getParameter("api_id");
		String to = request.getParameter("to");
		String text = request.getParameter("text");
		String from = request.getParameter("from");

		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;

		Teks teksModel = factory.createTeks();
		teksModel.setAppId(apiId);

		Developer developerProfile = factory.createDeveloper();
		developerProfile.setId(devId);

		teksModel.setDeveloper(developerProfile);

		OutboundTextMessage outMsg = factory.createOutboundTextMessage();
		outMsg.setCommunicationChannel(new ChannelKind[] { ChannelKind.SMS });
		outMsg.setFrom(0, from);
		outMsg.setRecipient(new String[] { to });
		outMsg.setTimestamp(new Date());

		TextMessage textMsg = factory.createTextMessage();
		textMsg.setText(text);

		outMsg.setMessage(textMsg);
		outMsg.setTeksRef(teksModel);
		teksModel.setOutboundMessage(0, outMsg);

		// outboundMsgQueueSender.send(outMsg);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {

			final ServletInputStream in = request.getInputStream();
			final BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			final ServletOutputStream outStream = response.getOutputStream();

			logger.info("OK, got you");

			String inXMLString = null;
			StringBuffer xmlBuff = new StringBuffer();

			boolean gotNessage = false;
			while ((inXMLString = reader.readLine()) != null) {
				xmlBuff.append(inXMLString);
				gotNessage = true;
			}
			reader.close();

			if (!gotNessage) {
				logger.log(Level.WARNING, "Got no message!");
				response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				response.getWriter().print(message);
				response.getWriter().close();
				return;
			}

			IPersistenceManager persistenceMgr = persistenceMgrFactory.getPersistenceManager();

			// logger.info("XML Buff: " + xmlBuff.toString());
			Teks teksModel = TeksModelHelper.INSTANCE.createTeksModelFromXml(xmlBuff.toString());

			OutboundTextMessage outMsg = teksModel.getOutboundMessage(0);
			outMsg.setId(UUID.randomUUID().toString());

			logger.info(outMsg.getMessage().getText());

			persistenceMgr.makePersistent(teksModel);
			queueSender.publishMessage(outMsg);

			outStream.println("getContentLength: " + request.getContentLength());
			outStream.println("getContentType: " + request.getContentType());

			// set the response code and write the response data
			response.setStatus(HttpServletResponse.SC_OK);
			OutputStreamWriter writer = new OutputStreamWriter(response.getOutputStream());

			writer.write(xmlBuff.toString());
			writer.flush();
			writer.close();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			try {
				response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				response.getWriter().print(e.getMessage());
				response.getWriter().close();
			} catch (IOException ioe) {
			}
		}

	}

	String ExpandHttpHeaders(List<HttpHeader> httpHeaderList) {
		StringBuffer buffer = new StringBuffer();
		for (HttpHeader h : httpHeaderList) {
			buffer.append(h.key);
			buffer.append("=");
			buffer.append(h.value);
			buffer.append("&");
		}
		return buffer.toString();
	}

	class HttpHeader {
		public String key;

		public String value;

		public boolean unicode;

		public HttpHeader() {
			this.key = "";
			this.value = "";
			this.unicode = false;
		}

		public HttpHeader(String myKey, String myValue, boolean myUnicode) {
			this.key = myKey;
			this.value = myValue;
			this.unicode = myUnicode;
		}
	}

	public void setMessageQueueSenderService(final MessageQueueSender queueSender) {
		this.queueSender = queueSender;
	}

	public void setPersistenceManagerFactory(IPersistenceManagerFactory persistenceMgrFactory) {
		this.persistenceMgrFactory = persistenceMgrFactory;
	}

}
