/**
 * Copyright 2010 TksMe, Inc.
 * TksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.teksme.server.identity.service.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.oauth.OAuth;
import net.oauth.OAuthAccessor;
import net.oauth.OAuthMessage;
import net.oauth.OAuthProblemException;
import net.oauth.server.OAuthServlet;

import org.teksme.model.teks.Application;
import org.teksme.model.teks.Profile;
import org.teksme.model.teks.User;
import org.teksme.server.common.persistence.IPersistenceManager;
import org.teksme.server.common.persistence.IPersistenceManagerFactory;
import org.teksme.server.common.persistence.PersistenceException;
import org.teksme.server.identity.provider.TeksOAuthProvider;
import org.teksme.server.identity.service.IAuth;

/**
 * 
 * @since 0.5
 * 
 */
public class AuthImpl implements IAuth {

	@SuppressWarnings("unused")
	private IPersistenceManager pm;
	private IPersistenceManagerFactory persistenceMgrFactory;

	public void bind(IPersistenceManagerFactory persistenceMgrFactory) {
		this.persistenceMgrFactory = persistenceMgrFactory;
	}

	public void unbind(IPersistenceManagerFactory persistenceMgrFactory) {
		this.persistenceMgrFactory = null;
	}

	public void activate() {
		try {
			pm = persistenceMgrFactory.getPersistenceManager();
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isValidToken(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		try {
			OAuthMessage requestMessage = OAuthServlet.getMessage(request, null);

			// look up user's access token object from cache
			// TODO fallback to the database if necessary
			OAuthAccessor accessor = TeksOAuthProvider.getAccessor(requestMessage);

			TeksOAuthProvider.VALIDATOR.validateMessage(requestMessage, accessor);

			if (accessor.tokenSecret.isEmpty()) {
				// for some reason, neither can be retrieved, then something has
				// gone wrong and proactively deny access
				OAuthProblemException problem = new OAuthProblemException("permission_denied");
				throw problem;
			}

			// make sure token is authorized
			if (!Boolean.TRUE.equals(accessor.getProperty("authorized"))) {
				// set userId in accessor and mark it as authorized
				TeksOAuthProvider.markAsAuthorized(accessor, accessor.consumer.consumerKey);
			}

			return true;

		} catch (Exception e) {
			TeksOAuthProvider.handleException(e, request, response, true);
		}

		return false;

	}

	public User getAuthUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		User userTeksObj = null;
		try {
			OAuthMessage requestMessage = OAuthServlet.getMessage(request, null);
			OAuthAccessor accessor = TeksOAuthProvider.getAccessor(requestMessage);
			userTeksObj = (User) accessor.getProperty("userObj");
		} catch (Exception e) {
			TeksOAuthProvider.handleException(e, request, response, true);
		}
		return userTeksObj;
	}

	@SuppressWarnings("unused")
	private void returnToConsumer(HttpServletRequest request, HttpServletResponse response, OAuthAccessor accessor) throws IOException,
			ServletException {
		// send the user back to site's callBackUrl
		String callback = request.getParameter("oauth_callback");
		if ("none".equals(callback) && accessor.consumer.callbackURL != null && accessor.consumer.callbackURL.length() > 0) {
			// first check if we have something in our properties file
			callback = accessor.consumer.callbackURL;
		}

		if ("none".equals(callback)) {
			// no call back it must be a client
			response.setContentType("text/plain");
			PrintWriter out = response.getWriter();
			out.println("You have successfully authorized '" + accessor.consumer.getProperty("description")
					+ "'. Please close this browser window and click continue" + " in the client.");
			out.close();
		} else {
			// if callback is not passed in, use the callback from config
			if (callback == null || callback.length() <= 0)
				callback = accessor.consumer.callbackURL;
			String token = accessor.requestToken;
			if (token != null) {
				callback = OAuth.addParameters(callback, "oauth_token", token);
			}

			response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", callback);
		}
	}

	public synchronized void refreshOAuthConsumersCache(User user) {
		// for each entry in the list create a OAuthConsumer
		Profile profile = user.getProfile();
		List<Application> apps = profile.getApplicationList();

		if (apps != null)
			TeksOAuthProvider.loadConsumersApps(apps, user);

	}

}
