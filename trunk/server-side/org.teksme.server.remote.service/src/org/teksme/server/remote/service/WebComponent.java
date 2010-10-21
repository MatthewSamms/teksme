/**
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

package org.teksme.server.remote.service;

import java.util.logging.Logger;

import javax.servlet.ServletException;

import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.teksme.server.common.persistence.IPersistenceManager;
import org.teksme.server.common.persistence.IPersistenceManagerFactory;
import org.teksme.server.common.persistence.PersistenceException;
import org.teksme.server.queue.sender.MessageQueueSender;
import org.teksme.server.remote.service.http.SendMessageServlet;

public class WebComponent {

	private static final String SEND_MSG_SERVLET_ALIAS = "/sendmsg";

	private static Logger logger = Logger.getLogger(WebComponent.class.getName());

	private MessageQueueSender queueSender;
	private HttpService httpService;
	private IPersistenceManagerFactory persistenceMgrFactory;

	public void bind(HttpService httpService) {
		this.httpService = httpService;
	}

	public void bind(MessageQueueSender queueSender) {
		this.queueSender = queueSender;
	}

	public void bind(IPersistenceManagerFactory persistenceMgrFactory) {
		this.persistenceMgrFactory = persistenceMgrFactory;
	}

	public void unbind(HttpService httpService) {
		this.httpService = null;
	}

	public void unbind(MessageQueueSender queueSender) {
		this.queueSender = null;
	}

	public void unbind(IPersistenceManagerFactory persistenceMgrFactory) {
		this.persistenceMgrFactory = null;
	}

	public void activate() {
		try {
			IPersistenceManager persistenceMgr = persistenceMgrFactory.getPersistenceManager();
			logger.info("Starting up sevlet at " + SEND_MSG_SERVLET_ALIAS);
			SendMessageServlet sendMsgServlet = new SendMessageServlet();
			sendMsgServlet.setMessageQueueSenderService(queueSender);
			sendMsgServlet.setPersistenceManagerFactory(persistenceMgrFactory);
			httpService.registerServlet(SEND_MSG_SERVLET_ALIAS, sendMsgServlet, null, null);

		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (NamespaceException e) {
			e.printStackTrace();
		}
	}

	public void deactivate() {
		httpService.unregister(SEND_MSG_SERVLET_ALIAS);
	}

}