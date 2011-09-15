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

package org.teksme.server.tests.oauth;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;

import net.oauth.OAuthAccessor;
import net.oauth.OAuthException;
import net.oauth.client.OAuthClient;
import net.oauth.client.httpclient4.HttpClient4;

import org.junit.Test;

public class AuthorizationTest extends OAuthTest {

	@Test
	public void requestTokenTest() throws IOException, OAuthException,
			URISyntaxException {

		String consumerKey = props.getProperty("consumerKey");
		String consumerSecret = props.getProperty("consumerSecret");
		String callbackUrl = null;

		OAuthAccessor accessor = createOAuthAccessor(consumerKey,
				consumerSecret, callbackUrl);
		OAuthClient client = new OAuthClient(new HttpClient4());
		client.getRequestToken(accessor, "POST");

		assertNotNull("Request token cannot be null!", accessor.requestToken);
		assertNotNull("Token secret cannot be null!", accessor.tokenSecret);

		props.setProperty("requestToken", accessor.requestToken);
		props.setProperty("tokenSecret", accessor.tokenSecret);

		updateProperties("Last action: added requestToken");
	}

	@Test(expected = OAuthException.class)
	public void requestTokenForUnknownUserTest() throws IOException,
			URISyntaxException, OAuthException {

		String consumerKey = "8726136782616871687681468";
		String consumerSecret = props.getProperty("consumerSecret");

		OAuthAccessor accessor = createOAuthAccessor(consumerKey,
				consumerSecret, null);
		OAuthClient client = new OAuthClient(new HttpClient4());
		client.getRequestToken(accessor);

	}

}
