package org.teksme.server.remote.service.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

/**
 * Servlet implementation class ClickatellCallbackServlet
 */
@SuppressWarnings("serial")
public class ClickatellCallbackServlet extends HttpServlet {

	Logger logger = Logger.getLogger(ClickatellCallbackServlet.class.getName());

	private static String message = "Error during Servlet processing";

	// TODO Inject the service
	// SMSInboundMessage smsInboundMessage;
	// TODO Inject the service
	// JMSMsgQueueSender outboundMsgQueueSender;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClickatellCallbackServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));

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

			// InboundTextMessage inboundMsg =
			// smsInboundMessage.createInboundMsgModelFromXml(xmlBuff.toString());

			// logger.info("MO: " + inboundMsg.getOriginator());

			// outboundMsgQueueSender.send(inboundMsg);

			// set the response code and write the response data
			response.setStatus(HttpServletResponse.SC_OK);
			OutputStreamWriter writer = new OutputStreamWriter(response.getOutputStream());
			writer.write("Result");
			writer.flush();
			writer.close();

			/*
		} catch (IOException e) {
			try {
				response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				response.getWriter().print(e.getMessage());
				response.getWriter().close();
			} catch (IOException ioe) {
			}
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
