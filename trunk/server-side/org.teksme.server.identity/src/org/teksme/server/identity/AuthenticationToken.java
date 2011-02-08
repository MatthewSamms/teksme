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

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.StringTokenizer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.oauth.OAuth;
import net.oauth.OAuthAccessor;
import net.oauth.OAuthConsumer;
import net.oauth.OAuthMessage;
import net.oauth.OAuthProblemException;
import net.oauth.server.OAuthServlet;

import org.apache.commons.codec.binary.Base64;
import org.teksme.model.teks.User;
import org.teksme.server.common.persistence.IPersistenceManager;
import org.teksme.server.identity.provider.TeksmeOAuthProvider;

/**
 * 
 * Authentication approach using the 2-legged idea
 * 
 * @since 0.5
 */
public class AuthenticationToken extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4712860526093888675L;
	private IPersistenceManager persistenceMgr;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// nothing at this point
		try {
			TeksmeOAuthProvider.loadConsumers(config);
		} catch (IOException e) {
			throw new ServletException(e.getMessage());
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		processRequest(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		processRequest(request, response);
	}

	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		try {

			String userID = null;
			String password = null;

			boolean valid = false;

			String authHeader = request.getHeader(Messages.AuthenticationToken_auth);
			if (authHeader != null) {
				StringTokenizer st = new StringTokenizer(authHeader);
				if (st.hasMoreTokens()) {
					String basic = st.nextToken();

					// We only handle HTTP Basic authentication
					if (basic.equalsIgnoreCase(Messages.AuthenticationToken_basic)) {
						String credentials = st.nextToken();

						byte b[] = Base64.decodeBase64(credentials.getBytes());
						String userPass = new String(b);

						int p = userPass.indexOf(":"); //$NON-NLS-1$
						if (p != -1) {
							userID = userPass.substring(0, p);
							password = userPass.substring(p + 1);

							if ((!userID.trim().equals("")) && (!password.trim().equals(""))) { //$NON-NLS-1$ //$NON-NLS-2$
								valid = true;
								if (!validUser(userID, password)) {
									valid = false;
								}

							}
						}
					}
				}
			}

			if (!valid) {
				OAuthProblemException problem = new OAuthProblemException(Messages.AuthenticationToken_permission_denied);
				throw problem;
			} else {

				OAuthMessage requestMessage = OAuthServlet.getMessage(request, null);
				OAuthConsumer consumer = TeksmeOAuthProvider.getConsumer(requestMessage);

				OAuthAccessor accessor = new OAuthAccessor(consumer);

				accessor.setProperty(Messages.AuthenticationToken_authorized, true);
				// generate secret token
				TeksmeOAuthProvider.generateAccessToken(accessor);
				// set userId in accessor and mark it as authorized
				TeksmeOAuthProvider.markAsAuthorized(accessor, userID);
				response.setContentType(Messages.AuthenticationToken_text);
				OutputStream out = response.getOutputStream();
				OAuth.formEncode(OAuth.newList(Messages.AuthenticationToken_token, accessor.accessToken), out);
				out.close();

			}

		} catch (Exception e) {
			TeksmeOAuthProvider.handleException(e, request, response, true);
		}

	}

	private boolean validUser(String email, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException, Exception {

		User user = persistenceMgr.getUser(email, password);
		return user == null ? false : true;
	}

	public void setPersistenceManagerFactory(IPersistenceManager persistenceMgr) {
		this.persistenceMgr = persistenceMgr;

	}

}
