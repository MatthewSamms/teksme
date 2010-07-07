package org.teksme.server.web.api.http;

import java.io.IOException;
import java.util.List;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.server.impl.ServiceLocator;
import org.teksme.server.impl.ServiceLocatorException;

@SuppressWarnings("serial")
public class SendMessageServlet extends HttpServlet {

	public SendMessageServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		execute(request, response);
	}

	private void execute(HttpServletRequest request,
			HttpServletResponse response) {

		String username = request.getParameter("user");
		String password = request.getParameter("passwd");
		String apiId = request.getParameter("api_id");
		String to = request.getParameter("to");
		String text = request.getParameter("text");

		System.out.println("username: " + username);

		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;

		OutboundTextMessage msg = factory.createOutboundTextMessage();

		Connection connection = null;
		Session session = null;

		try {

			// Lookup the connection factory
			ConnectionFactory cf;
			cf = ServiceLocator.getInstance().getQueueConnectionFactory(
					"/ConnectionFactory");

			// Lookup the JMS queue
			Queue queue = ServiceLocator.getInstance().getQueue(
					"/queue/testQueue");

			// Create the JMS objects to connect to the server and manage a
			// session
			connection = cf.createConnection();

			// Create a JMS Session
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			ObjectMessage objMsg = session.createObjectMessage();
			// objMsg.setObject(msg);
			// objMsg.setJMSType(this.CMD_TYPE_MESSAGETYPE_OBJECT);

			// Create a JMS Message Producer
			MessageProducer producer = session.createProducer(queue);

			producer.send(objMsg);

			// Thread.sleep(1000);

		} catch (ServiceLocatorException e) {
			e.printStackTrace();

		} catch (JMSException e) {
			e.printStackTrace();

		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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

}
