package org.teksme.server.remote.service;

import java.util.logging.Logger;

import javax.servlet.ServletException;

import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.teksme.server.remote.service.http.SendMessageServlet;
import org.teksme.server.sms.service.SMSOutboundMessage;

public class WebComponent {

	private static final String SEND_MSG_SERVLET_ALIAS = "/sendmsg";

	private static Logger logger = Logger.getLogger(WebComponent.class
			.getName());

	private SMSOutboundMessage outboundMsg;
	private HttpService httpService;

	public void bind(HttpService httpService) {
		this.httpService = httpService;
	}

	public void bind(SMSOutboundMessage outMsg) {
		this.outboundMsg = outMsg;
	}

	public void unbind(HttpService httpService) {
		this.httpService = null;
	}

	public void unbind(SMSOutboundMessage outboundMsg) {
		this.outboundMsg = null;

	}

	protected void activate() {
		try {
			logger.info("Starting up sevlet at " + SEND_MSG_SERVLET_ALIAS);
			SendMessageServlet sendMsgServlet = new SendMessageServlet();
			sendMsgServlet.setOutMsgService(outboundMsg);
			httpService.registerServlet(SEND_MSG_SERVLET_ALIAS, sendMsgServlet,
					null, null);

		} catch (ServletException e) {
			e.printStackTrace();
		} catch (NamespaceException e) {
			e.printStackTrace();
		}
	}

	protected void deactivate() {
		httpService.unregister(SEND_MSG_SERVLET_ALIAS);
	}

}