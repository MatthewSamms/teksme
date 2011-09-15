/*
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.remote.service.http;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.ServletException;
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
import org.teksme.server.common.utils.TeksModelHelper;
import org.teksme.server.common.utils.Utils;
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

		// request.setCharacterEncoding("ISO-8859-1");

		logger.info("OK, just got a new request via HTTP GET!");

		String[] requiredParams = { "from", "to", "channel", "shout" };

		requestOptions = new HashMap<Object, Object>();
		requestOptions.put(Validator.CONTENT_TYPE, request.getContentType());
		requestOptions.put(Validator.ENCODING, request.getCharacterEncoding());
		requestOptions.put(Validator.HTTP_GET_REQUIRED_DATA, requiredParams);

		processRequest(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		logger.info("OK, just got a new request via HTTP POST!");

		String postData = request.getParameter("data");

		System.out.println("CONTENT-TYPE: " + request.getContentType());
		System.out.println("ENCODING: " + request.getCharacterEncoding());

		byte bytes[] = request.getParameter("shout").toString().getBytes("ISO-8859-1");
		String s = new String(bytes, "UTF-8");

		logger.info("Shout: " + s);

		requestOptions = new HashMap<Object, Object>();
		requestOptions.put(Validator.CONTENT_TYPE, request.getContentType());
		requestOptions.put(Validator.ENCODING, request.getCharacterEncoding());
		requestOptions.put(Validator.HTTP_POST_DATA, postData);

		processRequest(request, response);
	}

	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		if (authorization.isValidToken(request, response)) {
			logger.info("User has been authorized through OAuth!");

			final ServletOutputStream outStream = response.getOutputStream();
			OutputStreamWriter writer = new OutputStreamWriter(outStream);

			try {

				Screening diagnostic = requestValidation.validate(request, this.requestOptions);

				if (!diagnostic.getChildren().isEmpty()) {

					Response teksResponse = requestValidation.handleResponse(diagnostic);
					String strErrorResp = TeksModelHelper.INSTANCE.getXMLFromResponseObject(teksResponse);
					int status = teksResponse.getError().getStatus();
					setResponseData(response, writer, strErrorResp, status);

				} else {

					logger.info("The request message was successfully validated!");

					TeksPackageImpl.init();
					Teks teksModel = TeksModelHelper.INSTANCE.createOutMessageFromRequest(request);

					User user = authorization.getAuthUser(request, response);
					teksModel.setAccount(user);

					OutboundMessage outMsg = teksModel.getOutboundMessage(0);

					logger.info("Pls send this message to " + outMsg.getRouting().getLiteral() + " gateway.");

					queueSender.publishMessage(outMsg);

					IPersistenceManager persistenceMgr = persistenceMgrFactory.getPersistenceManager();
					persistenceMgr.makePersistent(teksModel);

					String strResp = TeksModelHelper.INSTANCE.getXMLFromTeksModel(teksModel);
					setResponseData(response, writer, strResp, HttpServletResponse.SC_OK);

				}

				return;

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

	private void setResponseData(HttpServletResponse response, OutputStreamWriter writer, String strDataResp, int status)
			throws IOException {
		// set the response code and write the response data
		response.setStatus(status);
		response.setHeader("Date", Utils.getDateRFCFormat(new Date()));
		response.setHeader("Expires", Utils.getDateRFCFormat(new Date()));
		response.setContentType("application/xml; charset=UTF-8");
		response.setHeader("Server", "TeksMe Web API Server");
		response.setHeader("Cache-Control", "private, max-age=0, must-revalidate, no-transform");
		response.setContentLength(strDataResp.getBytes().length);
		writer.write(strDataResp);
		writer.flush();
		writer.close();
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
