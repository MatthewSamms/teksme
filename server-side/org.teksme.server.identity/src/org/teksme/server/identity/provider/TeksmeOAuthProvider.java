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
package org.teksme.server.identity.provider;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.oauth.OAuthAccessor;
import net.oauth.OAuthConsumer;
import net.oauth.OAuthException;
import net.oauth.OAuthMessage;
import net.oauth.OAuthProblemException;
import net.oauth.server.OAuthServlet;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 
 * @since 0.5
 */
public class TeksmeOAuthProvider {

	private static final Map<String, OAuthConsumer> CONSUMERS = Collections.synchronizedMap(new HashMap<String, OAuthConsumer>(10));

	private static final Collection<OAuthAccessor> TOKENS = new HashSet<OAuthAccessor>();

	private static Properties consumerProperties = null;

	//TODO replace it by consumers from db
	public static synchronized void loadConsumers(ServletConfig config) throws IOException {
		Properties p = consumerProperties;
		if (p == null) {
			p = new Properties();
			String resourceName = Messages.TeksmeOAuthProvider_0 + TeksmeOAuthProvider.class.getPackage().getName().replace(Messages.TeksmeOAuthProvider_1, Messages.TeksmeOAuthProvider_2) + Messages.TeksmeOAuthProvider_3;
			URL resource = TeksmeOAuthProvider.class.getClassLoader().getResource(resourceName);
			if (resource == null) {
				throw new IOException(Messages.TeksmeOAuthProvider_4 + resourceName);
			}
			InputStream stream = resource.openStream();
			try {
				p.load(stream);
			} finally {
				stream.close();
			}
		}
		consumerProperties = p;

		// for each entry in the properties file create a OAuthConsumer
		for (Map.Entry prop : p.entrySet()) {
			String consumer_key = (String) prop.getKey();
			// make sure it's key not additional properties
			if (!consumer_key.contains(".")) { //$NON-NLS-1$
				String consumer_secret = (String) prop.getValue();
				if (consumer_secret != null) {
					String consumer_description = (String) p.getProperty(consumer_key + ".description"); //$NON-NLS-1$
					String consumer_callback_url = (String) p.getProperty(consumer_key + ".callbackURL"); //$NON-NLS-1$
					// Create OAuthConsumer w/ key and secret
					OAuthConsumer consumer = new OAuthConsumer(consumer_callback_url, consumer_key, consumer_secret, null);
					consumer.setProperty(Messages.TeksmeOAuthProvider_5, consumer_key);
					consumer.setProperty(Messages.TeksmeOAuthProvider_9, consumer_description);
					CONSUMERS.put(consumer_key, consumer);
				}
			}
		}

	}

	public static synchronized OAuthConsumer getConsumer(OAuthMessage requestMessage) throws IOException, OAuthProblemException {

		OAuthConsumer consumer = null;
		// try to load from local cache if not throw exception
		String consumer_key = requestMessage.getConsumerKey();

		consumer = TeksmeOAuthProvider.CONSUMERS.get(consumer_key);

		if (consumer == null) {
			OAuthProblemException problem = new OAuthProblemException(Messages.TeksmeOAuthProvider_10);
			throw problem;
		}

		return consumer;
	}


	public static synchronized OAuthAccessor getAccessor(OAuthMessage requestMessage) throws IOException, OAuthProblemException {

		// try to load from local cache if not throw exception
		String consumer_token = requestMessage.getToken();
		OAuthAccessor accessor = null;
		for (OAuthAccessor a : TeksmeOAuthProvider.TOKENS) {
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
			OAuthProblemException problem = new OAuthProblemException(Messages.TeksmeOAuthProvider_11);
			throw problem;
		}

		return accessor;
	}

	/**
	 * Set the access token
	 */
	public static synchronized void markAsAuthorized(OAuthAccessor accessor, String userId) throws OAuthException {

		// first remove the accessor from cache
		TOKENS.remove(accessor);

		accessor.setProperty(Messages.TeksmeOAuthProvider_12, userId);
		accessor.setProperty(Messages.TeksmeOAuthProvider_13, Boolean.TRUE);

		// update token in local cache
		TOKENS.add(accessor);
	}


	public static synchronized void generateAccessToken(OAuthAccessor accessor) throws OAuthException {

		// generate oauth_token and oauth_secret
		String consumer_key = (String) accessor.consumer.getProperty(Messages.TeksmeOAuthProvider_14);
		// generate token and secret based on consumer_key

		// for now use md5 of name + current time as token
		String token_data = consumer_key + System.nanoTime();
		String token = DigestUtils.md5Hex(token_data);
		// first remove the accessor from cache
		TOKENS.remove(accessor);

		accessor.requestToken = null;
		accessor.accessToken = token;

		// update token in local cache
		TOKENS.add(accessor);
	}

	public static void handleException(Exception e, HttpServletRequest request, HttpServletResponse response, boolean sendBody)
			throws IOException, ServletException {
		String realm = (request.isSecure()) ? "https://" : "http://"; //$NON-NLS-1$ //$NON-NLS-2$
		realm += request.getLocalName();
		OAuthServlet.handleException(response, e, realm, sendBody);
	}

}
