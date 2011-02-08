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

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.Response;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.server.common.persistence.IPersistenceManager;
import org.teksme.server.common.persistence.IPersistenceManagerFactory;
import org.teksme.server.common.persistence.PersistenceException;
import org.teksme.server.common.utils.TeksModelHelper;
import org.teksme.server.common.validator.Screening;
import org.teksme.server.common.validator.Validator;
import org.teksme.server.identity.service.IAuth;
import org.teksme.server.queue.sender.MessageQueueSender;

@SuppressWarnings("serial")
public class SendMessageServlet extends HttpServlet {

	private static String message = "Error during Servlet processing";

	private static Logger logger = Logger.getLogger(SendMessageServlet.class.getName());

	private MessageQueueSender queueSender;

	private IPersistenceManagerFactory persistenceMgrFactory;

	private IAuth authorization;

	private Validator requestValidation;

	public SendMessageServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}

	private void execute(HttpServletRequest request, HttpServletResponse response) {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (authorization.isValidToken(request)) {
			final ServletOutputStream outStream = response.getOutputStream();
			final ServletInputStream in = request.getInputStream();

			OutputStreamWriter writer = new OutputStreamWriter(outStream);

			try {

				logger.info("OK, just got a new request via HTTP!");

				String postData = HttpUtils.INSTANCE.parsePostData(request.getContentLength(), in);

				Map<Object, Object> options = new HashMap<Object, Object>();
				options.put(Validator.CONTENT_TYPE, request.getContentType());
				options.put(Validator.ENCODING, request.getCharacterEncoding());
				options.put(Validator.HTTP_POST_DATA, postData);

				Screening diagnostic = requestValidation.validate(request, options);

				if (!diagnostic.getChildren().isEmpty()) {
					Response teksResponse = requestValidation.handleResponse(diagnostic);
					String strResp = requestValidation.getXMLResponse(teksResponse);

					// set the response code and write the response data
					response.setStatus(teksResponse.getError().getStatus());
					response.setContentType("text/xml; charset=ISO-8859-1");

					writer.write(strResp);
					writer.flush();
					writer.close();

					return;

				} else {

					logger.info("The request message was successfully validated!");

					TeksPackageImpl.init();
					// Retrieve the default factory singleton
					Teks teksModel = TeksModelHelper.INSTANCE.createTeksModelFromXml(postData);

					OutboundMessage outMsg = teksModel.getOutboundMessage(0);
					outMsg.setId(UUID.randomUUID().toString());

					logger.info(outMsg.getShout().getThis());
					logger.info("Pls send this message to " + outMsg.getRouting().getLiteral() + " gateway.");

					// queueSender.publishMessage(outMsg);

					IPersistenceManager persistenceMgr = persistenceMgrFactory.getPersistenceManager();
					persistenceMgr.makePersistent(teksModel);

					response.setStatus(HttpServletResponse.SC_OK);
					outStream.println("getContentLength: " + request.getContentLength());
					outStream.println("getContentType: " + request.getContentType());
				}

			} catch (PersistenceException e) {
				e.printStackTrace();
			} catch (IOException e) {
				try {
					response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
					writer.write(e.getMessage());
					writer.flush();
					writer.close();

				} catch (IOException ioe) {
				}
			}

		}// OAuth
	}

	public void setMessageQueueSenderService(final MessageQueueSender queueSender) {
		this.queueSender = queueSender;
	}

	public void setPersistenceManagerFactory(IPersistenceManagerFactory persistenceMgrFactory) {
		this.persistenceMgrFactory = persistenceMgrFactory;
	}

	public void setRequestValidation(Validator requestValidation) {
		this.requestValidation = requestValidation;
	}

	public void setRequestAuthorization(IAuth authorization) {
		this.authorization = authorization;
	}

}
