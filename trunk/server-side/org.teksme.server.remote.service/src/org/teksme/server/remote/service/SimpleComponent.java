package org.teksme.server.remote.service;

import javax.servlet.ServletException;

import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.teksme.server.remote.service.http.SendMessageServlet;
import org.teksme.server.remote.service.http.SimpleServlet;
import org.teksme.server.sms.service.SMSOutboundMessage;

public class SimpleComponent {

	private static final String SERVLET_ALIAS = "/hellods";
	private static final String SEND_MSG_SERVLET_ALIAS = "/sendmsg";

	private HttpService httpService;

	public void setHttpService(HttpService httpService) {
		this.httpService = httpService;
	}
	private SMSOutboundMessage outboundMsg;

	// Method will be used by DS to set the quote service
	public synchronized void setOutMessage(SMSOutboundMessage outboundMsg) {
		System.out.println("Service was set. Thank you DS!");
		this.outboundMsg = outboundMsg;
	}

	protected void startup() {
		try {
			System.out.println("Staring up sevlet at " + SERVLET_ALIAS);
			SimpleServlet servlet = new SimpleServlet();
			httpService.registerServlet(SERVLET_ALIAS, servlet, null, null);
			System.out.println("Staring up sevlet at " + SERVLET_ALIAS);
			SendMessageServlet sendMsgServlet = new SendMessageServlet();
			httpService.registerServlet(SEND_MSG_SERVLET_ALIAS, sendMsgServlet,
					null, null);

		} catch (ServletException e) {
			e.printStackTrace();
		} catch (NamespaceException e) {
			e.printStackTrace();
		}
	}

	protected void shutdown() {
		httpService.unregister(SERVLET_ALIAS);
	}

}