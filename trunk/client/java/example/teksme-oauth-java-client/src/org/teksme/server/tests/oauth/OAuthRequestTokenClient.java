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

import java.io.IOException;
import java.net.URISyntaxException;

import net.oauth.OAuthAccessor;
import net.oauth.OAuthConsumer;
import net.oauth.OAuthException;
import net.oauth.OAuthServiceProvider;
import net.oauth.client.OAuthClient;
import net.oauth.client.httpclient4.HttpClient4;

public class OAuthRequestTokenClient {

	public static void main(String[] args) throws IOException, OAuthException,
			URISyntaxException {

		String consumerKey = "675hvkhmkp5sd5v7yd6cp3uj";
		String consumerSecret = "6BU4893qXN";
		String reqUrl = "http://localhost:8080/oauth/login";

		OAuthServiceProvider provider = new OAuthServiceProvider(reqUrl, null,
				null);
		OAuthConsumer consumer = new OAuthConsumer(null, consumerKey,
				consumerSecret, provider);

		OAuthAccessor accessor = new OAuthAccessor(consumer);

		OAuthClient client = new OAuthClient(new HttpClient4());
		client.getRequestToken(accessor);

		System.out.println("oauth_token : "+accessor.requestToken);
		System.out.println("oauth_token_secret : "+accessor.tokenSecret);

	}

}
