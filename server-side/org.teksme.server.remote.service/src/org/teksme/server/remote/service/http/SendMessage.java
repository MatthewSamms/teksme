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
import org.teksme.model.teks.User;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.server.common.persistence.IPersistenceManager;
import org.teksme.server.common.persistence.IPersistenceManagerFactory;
import org.teksme.server.common.persistence.PersistenceException;
import org.teksme.server.common.utils.HttpUtils;
import org.teksme.server.common.utils.TeksModelHelper;
import org.teksme.server.common.validator.Screening;
import org.teksme.server.common.validator.Validator;
import org.teksme.server.identity.service.IAuth;
import org.teksme.server.queue.sender.MessageQueueSender;

public class SendMessage extends HttpServlet {

	private static Logger logger = Logger.getLogger(SendMessage.class.getName());

	private MessageQueueSender queueSender;

	private IPersistenceManagerFactory persistenceMgrFactory;

	private IAuth authorization;

	private Validator requestValidation;

	private Map<Object, Object> requestOptions;

	public SendMessage() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String[] requiredParams = { "from", "to", "channel", "shout" };

		requestOptions = new HashMap<Object, Object>();
		requestOptions.put(Validator.CONTENT_TYPE, request.getContentType());
		requestOptions.put(Validator.ENCODING, request.getCharacterEncoding());
		requestOptions.put(Validator.HTTP_GET_REQUIRED_DATA, requiredParams);

		processRequest(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		final ServletInputStream in = request.getInputStream();

		String postData = new HttpUtils().parsePostData(request, in);

		requestOptions = new HashMap<Object, Object>();
		requestOptions.put(Validator.CONTENT_TYPE, request.getContentType());
		requestOptions.put(Validator.ENCODING, request.getCharacterEncoding());
		requestOptions.put(Validator.HTTP_POST_DATA, postData);

		processRequest(request, response);
	}

	@SuppressWarnings("unchecked")
	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		final String method = request.getMethod();

		if (authorization.isValidToken(request, response)) {
			logger.info("User has been authorized!");

			final ServletOutputStream outStream = response.getOutputStream();
			OutputStreamWriter writer = new OutputStreamWriter(outStream);

			try {

				Screening diagnostic = requestValidation.validate(request, this.requestOptions);
				logger.info("OK, just got a new request via HTTP!");

				if (!diagnostic.getChildren().isEmpty()) {

					Response teksResponse = requestValidation.handleResponse(diagnostic);
					String strResp = requestValidation.getXMLResponse(teksResponse);
					// set the response code and write the response data
					response.setStatus(teksResponse.getError().getStatus());
					writer.write(strResp);
					writer.flush();
					writer.close();
					return;

				} else {

					TeksPackageImpl.init();
					// Retrieve the default factory singleton
					Teks teksModel = null;

					if (method.equalsIgnoreCase("GET")) {
						teksModel = TeksModelHelper.INSTANCE.createOutMessageFromRequestParameters(request.getParameterMap());
					} else if (method.equalsIgnoreCase("POST")) {
						String postData = (String) requestOptions.get(Validator.HTTP_POST_DATA);
						teksModel = TeksModelHelper.INSTANCE.createTeksModelFromXml(postData);
					}

					logger.info("The request message was successfully validated!");

					User user = authorization.getAuthUser(request, response);
					teksModel.setAccount(user);

					OutboundMessage outMsg = teksModel.getOutboundMessage(0);

					logger.info("Outbound message object: " + outMsg);
					logger.info("Pls send this message to " + outMsg.getRouting().getLiteral() + " gateway.");

					queueSender.publishMessage(outMsg);

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

		}
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

	private static final long serialVersionUID = 1L;

}
