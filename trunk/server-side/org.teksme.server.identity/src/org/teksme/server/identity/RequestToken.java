/*
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.identity;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.oauth.OAuth;
import net.oauth.OAuthAccessor;
import net.oauth.OAuthConsumer;
import net.oauth.OAuthMessage;
import net.oauth.server.OAuthServlet;

import org.teksme.model.teks.User;
import org.teksme.server.common.persistence.IPersistenceManager;
import org.teksme.server.common.persistence.IPersistenceManagerFactory;
import org.teksme.server.common.persistence.PersistenceException;
import org.teksme.server.identity.provider.TeksOAuthProvider;

/**
 * 
 * Authentication approach using the 2-legged idea
 * 
 * @since 0.5
 */
public class RequestToken extends HttpServlet {

	private IPersistenceManagerFactory persistenceMgrFactory;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// loading TeksMe oAuth consumer from the database
		try {
			IPersistenceManager persistenceMgr;
			persistenceMgr = persistenceMgrFactory.getPersistenceManager();
			TeksOAuthProvider.loadConsumers(config, persistenceMgr);
		} catch (PersistenceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			throw new ServletException(e.getMessage());
		}
	}

	public void setPersistenceManagerFactory(IPersistenceManagerFactory persistenceMgrFactory) {
		this.persistenceMgrFactory = persistenceMgrFactory;

	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		processRequest(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		processRequest(request, response);
	}

	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		try {
			OAuthMessage requestMessage = OAuthServlet.getMessage(request, null);

			OAuthConsumer consumer = TeksOAuthProvider.getConsumer(requestMessage);

			OAuthAccessor accessor = new OAuthAccessor(consumer);
			
			TeksOAuthProvider.VALIDATOR.validateMessage(requestMessage, accessor);
			{
				// Support the 'Variable Accessor Secret' extension
				// described in http://oauth.pbwiki.com/AccessorSecret
				String secret = requestMessage.getParameter("oauth_accessor_secret");
				if (secret != null) {
					accessor.setProperty(OAuthConsumer.ACCESSOR_SECRET, secret);
				}
			}
			// generate request_token and secret
			TeksOAuthProvider.generateRequestToken(accessor);

			response.setContentType("text/plain");
			OutputStream out = response.getOutputStream();

			User user = (User) consumer.getProperty("userObj");
			response.setHeader("userID", user.getEmail());

			OAuth.formEncode(OAuth.newList("oauth_token", accessor.requestToken, "oauth_token_secret", accessor.tokenSecret), out);

			out.close();

		} catch (Exception e) {
			TeksOAuthProvider.handleException(e, request, response, true);
		}

	}

	private static final long serialVersionUID = 1L;

}
