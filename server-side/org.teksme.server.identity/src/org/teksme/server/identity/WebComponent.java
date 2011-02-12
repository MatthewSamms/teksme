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
package org.teksme.server.identity;

import java.util.logging.Logger;

import javax.servlet.ServletException;

import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.teksme.server.common.persistence.IPersistenceManagerFactory;

/**
 * 
 * @since 0.5
 * 
 */
public class WebComponent {

	private static final String REQUEST_TOKEN_SERVLET_ALIAS = "/oauth/login";

	private static final String ECHO_SERVLET_ALIAS = "/oauth/echo";

	private static Logger logger = Logger.getLogger(WebComponent.class.getName());

	private HttpService httpService;
	private IPersistenceManagerFactory persistenceMgrFactory;

	public void bind(HttpService httpService) {
		this.httpService = httpService;
	}

	public void bind(IPersistenceManagerFactory persistenceMgrFactory) {
		this.persistenceMgrFactory = persistenceMgrFactory;
	}

	public void unbind(HttpService httpService) {
		this.httpService = null;
	}

	public void unbind(IPersistenceManagerFactory persistenceMgrFactory) {
		this.persistenceMgrFactory = null;
	}

	public void activate() {
		try {
			logger.info("Starting up sevlet at " + REQUEST_TOKEN_SERVLET_ALIAS);
			RequestToken auth = new RequestToken();
			auth.setPersistenceManagerFactory(persistenceMgrFactory);
			httpService.registerServlet(REQUEST_TOKEN_SERVLET_ALIAS, auth, null, null);
			logger.info("Sevlet up " + REQUEST_TOKEN_SERVLET_ALIAS);
			logger.info("Starting up sevlet at " + ECHO_SERVLET_ALIAS);
			EchoServlet echo = new EchoServlet();
			httpService.registerServlet(ECHO_SERVLET_ALIAS, echo, null, null);
			logger.info("Sevlet up " + ECHO_SERVLET_ALIAS);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (NamespaceException e) {
			e.printStackTrace();
		}
	}

	public void deactivate() {
		httpService.unregister(REQUEST_TOKEN_SERVLET_ALIAS);
	}

}
