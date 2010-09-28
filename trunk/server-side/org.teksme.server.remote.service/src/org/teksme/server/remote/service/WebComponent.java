package org.teksme.server.remote.service;

import java.util.logging.Logger;

import javax.servlet.ServletException;

import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.teksme.server.queue.sender.MessageQueueSender;
import org.teksme.server.remote.service.http.SendMessageServlet;

public class WebComponent {

	private static final String SEND_MSG_SERVLET_ALIAS = "/sendmsg";

	private static Logger logger = Logger.getLogger(WebComponent.class.getName());

	private MessageQueueSender queueSender;
	private HttpService httpService;

	public void bind(HttpService httpService) {
		this.httpService = httpService;
	}

	public void bind(MessageQueueSender queueSender) {
		this.queueSender = queueSender;
	}

	public void unbind(HttpService httpService) {
		this.httpService = null;
	}

	public void unbind(MessageQueueSender queueSender) {
		this.queueSender = null;

	}

	protected void activate() {
		try {
			logger.info("Starting up sevlet at " + SEND_MSG_SERVLET_ALIAS);
			SendMessageServlet sendMsgServlet = new SendMessageServlet();
			sendMsgServlet.setMessageQueueSenderService(queueSender);
			httpService.registerServlet(SEND_MSG_SERVLET_ALIAS, sendMsgServlet, null, null);

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