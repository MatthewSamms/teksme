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
package org.teksme.server.identity.provider;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.oauth.OAuthAccessor;
import net.oauth.OAuthConsumer;
import net.oauth.OAuthException;
import net.oauth.OAuthMessage;
import net.oauth.OAuthProblemException;
import net.oauth.OAuthValidator;
import net.oauth.SimpleOAuthValidator;
import net.oauth.server.OAuthServlet;

import org.apache.commons.codec.digest.DigestUtils;
import org.teksme.model.teks.Application;
import org.teksme.model.teks.Profile;
import org.teksme.model.teks.User;
import org.teksme.server.common.persistence.IPersistenceManager;

public class TeksOAuthProvider {

	private static Logger logger = Logger.getLogger(TeksOAuthProvider.class.getName());

	public static final OAuthValidator VALIDATOR = new SimpleOAuthValidator();

	public static final Map<String, OAuthConsumer> ALL_CONSUMERS = Collections.synchronizedMap(new HashMap<String, OAuthConsumer>(10));

	private static final Collection<OAuthAccessor> ALL_TOKENS = new HashSet<OAuthAccessor>();

	public static synchronized void loadConsumers(ServletConfig config, IPersistenceManager persistenceMgr) throws IOException {
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) persistenceMgr.getTeksObjects(User.class);
		if (users != null && !users.isEmpty())
			createOAuthConsumersCache(users);
	}

	public static synchronized OAuthConsumer getConsumer(OAuthMessage requestMessage) throws IOException, OAuthProblemException {

		OAuthConsumer consumer = null;
		// try to load from local cache if not throw exception
		String consumer_key = requestMessage.getConsumerKey();

		consumer = TeksOAuthProvider.ALL_CONSUMERS.get(consumer_key);

		if (consumer == null) {
			OAuthProblemException problem = new OAuthProblemException("token_rejected");
			throw problem;
		}

		return consumer;
	}

	/**
	 * Get the access token and token secret for the given oauth_token.
	 */
	public static synchronized OAuthAccessor getAccessor(OAuthMessage requestMessage) throws IOException, OAuthProblemException {

		// try to load from local cache if not throw exception
		String consumer_token = requestMessage.getToken();
		OAuthAccessor accessor = null;
		for (OAuthAccessor a : TeksOAuthProvider.ALL_TOKENS) {
			if (a.requestToken != null) {
				if (a.requestToken.equals(consumer_token)) {
					accessor = a;
					break;
				}
			} else if (a.accessToken != null) {
				if (a.accessToken.equals(consumer_token)) {
					accessor = a;
					break;
				}
			}
		}

		if (accessor == null) {
			OAuthProblemException problem = new OAuthProblemException("token_expired");
			throw problem;
		}

		return accessor;
	}

	/**
	 * Set the access token
	 * 
	 * @param consumerKey
	 */
	public static synchronized void markAsAuthorized(OAuthAccessor accessor, String consumerKey) throws OAuthException {

		// first remove the accessor from cache
		ALL_TOKENS.remove(accessor);

		logger.info("Marking user " + consumerKey + " as authorized!");

		// accessor.setProperty("user", userId);
		accessor.setProperty("authorized", Boolean.TRUE);
		accessor.setProperty("consumerKey", consumerKey);

		// update token in local cache
		ALL_TOKENS.add(accessor);
	}

	/**
	 * Generate a fresh request token and secret for a consumer.
	 * 
	 * @throws OAuthException
	 */
	public static synchronized void generateRequestToken(OAuthAccessor accessor) throws OAuthException {

		// generate oauth_token and oauth_secret
		String consumer_key = (String) accessor.consumer.getProperty("consumerKey");
		// generate token and secret based on consumer_key

		// for now use md5 of name + current time as token
		String token_data = consumer_key + System.nanoTime();
		String token = DigestUtils.md5Hex(token_data);
		// for now use md5 of name + current time + token as secret
		String secret_data = consumer_key + System.nanoTime() + token;
		String secret = DigestUtils.md5Hex(secret_data);

		accessor.requestToken = token;
		accessor.tokenSecret = secret;
		accessor.accessToken = null;

		// add to the local cache
		ALL_TOKENS.add(accessor);

	}

	/**
	 * Generate a fresh request token and secret for a consumer.
	 * 
	 * @throws OAuthException
	 */
	public static synchronized void generateAccessToken(OAuthAccessor accessor) throws OAuthException {

		// generate oauth_token and oauth_secret
		String consumer_key = (String) accessor.consumer.getProperty("name");
		// generate token and secret based on consumer_key

		// for now use md5 of name + current time as token
		String token_data = consumer_key + System.nanoTime();
		String token = DigestUtils.md5Hex(token_data);
		// first remove the accessor from cache
		ALL_TOKENS.remove(accessor);

		accessor.requestToken = null;
		accessor.accessToken = token;

		// update token in local cache
		ALL_TOKENS.add(accessor);
	}

	public static void handleException(Exception e, HttpServletRequest request, HttpServletResponse response, boolean sendBody)
			throws IOException, ServletException {
		String realm = (request.isSecure()) ? "https://" : "http://";
		realm += request.getLocalName();
		OAuthServlet.handleException(response, e, realm, sendBody);
	}

	private static synchronized void createOAuthConsumersCache(List<User> users) {
		logger.info("Creating oAuth cosumers cache ...");
		// for each entry in the list create a OAuthConsumer
		for (User user : users) {
			Profile profile = user.getProfile();
			List<Application> apps = profile.getApplicationList();
			if (apps != null)
				TeksOAuthProvider.loadConsumersApps(apps, user);
		}
		logger.info("oAuth cosumers cache has been successfuly created...");
	}

	public static void loadConsumersApps(List<Application> apps, User user) {
		for (Application application : apps) {
			String consumerKey = application.getKey();
			// make sure it's key not additional properties
			if (consumerKey != null && !consumerKey.equals("")) {
				String sharedSecret = application.getSharedSecret();
				if (sharedSecret != null) {
					String consumerDescription = application.getDescription();
					String consumerCallbackURL = application.getCallbackURL();
					// Create OAuthConsumer w/ key and secret
					OAuthConsumer consumer = new OAuthConsumer(consumerCallbackURL, consumerKey, sharedSecret, null);
					consumer.setProperty("name", application.getName());
					consumer.setProperty("consumerKey", consumerKey);
					consumer.setProperty("description", consumerDescription);
					consumer.setProperty("userObj", user);
					ALL_CONSUMERS.put(consumerKey, consumer);
				}
			}
		}
	}

}
