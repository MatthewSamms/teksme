package org.teksme.server.remote.service;

import javax.servlet.ServletException;

import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.teksme.server.remote.service.http.SendMessageServlet;
import org.teksme.server.sms.service.SMSOutboundMessage;

public class WebComponent {

	private static final String SEND_MSG_SERVLET_ALIAS = "/sendmsg";

	private SMSOutboundMessage outboundMsg;
	private HttpService httpService;

	public synchronized void bind(HttpService httpService) {
		this.httpService = httpService;
	}

	public synchronized void bind(SMSOutboundMessage outboundMsg) {
		this.outboundMsg = outboundMsg;

	}

	public synchronized void unbind(HttpService httpService) {
		this.httpService = null;
	}

	public synchronized void unbind(SMSOutboundMessage outboundMsg) {
		this.outboundMsg = null;

	}

	protected void activate() {
		try {
			System.out
					.println("Staring up sevlet at " + SEND_MSG_SERVLET_ALIAS);
			SendMessageServlet sendMsgServlet = new SendMessageServlet();
			sendMsgServlet.registerRequiredService(outboundMsg);
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