package org.teksme.server.web.api.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.teksme.model.teks.Teks;
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
			final ServletInputStream in = request.getInputStream();
			final BufferedReader reader = new BufferedReader(
					new InputStreamReader(in));
			final ServletOutputStream outStream = response.getOutputStream();
			outStream.println("OK, got you");
			String inXMLString = null;
			StringBuffer xmlBuff = new StringBuffer();
			boolean gotNessage = false;
			while ((inXMLString = reader.readLine()) != null) {
				// outStream.println();
				// logger.info("Read " + message);
				xmlBuff.append(inXMLString);
				gotNessage = true;
			}
			reader.close();
			// logger.info("XML Buff: " + xmlBuff.toString());
			Teks teksModel = createPollBean.createPollModelFromXml(xmlBuff
					.toString());

			createPollBean.persistPoll(teksModel);

			if (!gotNessage) {
				outStream.println("Got no message");
				response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				response.getWriter().print(message);
				response.getWriter().close();
				return;
			}

			outStream
					.println("getContentLength: " + request.getContentLength());
			outStream.println("getContentType: " + request.getContentType());

			// set the response code and write the response data
			response.setStatus(HttpServletResponse.SC_OK);
			OutputStreamWriter writer = new OutputStreamWriter(
					response.getOutputStream());

			writer.write(xmlBuff.toString());
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
