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

package org.teksme.server.web.api.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.teksme.server.SMSPollHandler;

/**
 * Servlet implementation class CreatePoll
 */
public class CreatePollServlet extends HttpServlet {

	Logger logger = Logger.getLogger(CreatePollServlet.class.getName());

	private static final long serialVersionUID = 1L;

	private static String message = "Error during Servlet processing";

	@EJB(mappedName = SMSPollHandler.JNDI_NAME)
	private SMSPollHandler createPollBean;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreatePollServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) {

		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					request.getInputStream()));

			final ServletOutputStream outStream = response.getOutputStream();

			logger.info("OK, got you");

			String inXMLString = null;

			StringBuffer xmlBuff = new StringBuffer();

			boolean gotNessage = false;

			while ((inXMLString = reader.readLine()) != null) {
				// outStream.println();
				xmlBuff.append(inXMLString);
				gotNessage = true;
			}
			reader.close();

			if (!gotNessage) {
				outStream.println("Got no message");
				response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				response.getWriter().print(message);
				response.getWriter().close();
				return;
			}

			logger.info("XML Buff: " + xmlBuff.toString());
			logger.info("getContentLength: " + request.getContentLength());
			logger.info("getContentType: " + request.getContentType());

			createPollBean.createPollModelFromXml(xmlBuff.toString());

			// set the response code and write the response data
			response.setStatus(HttpServletResponse.SC_OK);
			OutputStreamWriter writer = new OutputStreamWriter(
					response.getOutputStream());
			writer.write("Result");
			writer.flush();
			writer.close();

		} catch (IOException e) {
			try {
				response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				response.getWriter().print(e.getMessage());
				response.getWriter().close();
			} catch (IOException ioe) {
			}
		}
	}
}
