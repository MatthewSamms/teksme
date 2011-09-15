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
package org.teksme.server.tests.oauth;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import net.oauth.OAuth;
import net.oauth.OAuthAccessor;
import net.oauth.OAuthConsumer;
import net.oauth.OAuthMessage;
import net.oauth.OAuthServiceProvider;
import net.oauth.http.HttpMessage;
import net.oauth.http.HttpMessageDecoder;

public class OAuthTest {

	static OAuthAccessor createOAuthAccessor(String consumerKey,
			String consumerSecret, String reqUrl, String callbackUrl) {

		OAuthServiceProvider provider = new OAuthServiceProvider(reqUrl, null,
				null);
		OAuthConsumer consumer = new OAuthConsumer(callbackUrl, consumerKey,
				consumerSecret, provider);
		consumer.setProperty(OAuthConsumer.ACCEPT_ENCODING,
				HttpMessageDecoder.ACCEPTED);
		return new OAuthAccessor(consumer);
	}

	@SuppressWarnings("rawtypes")
	static Collection<OAuth.Parameter> getOAuthParams(Properties map)
			throws UnsupportedEncodingException {
		List<OAuth.Parameter> params = new ArrayList<OAuth.Parameter>();
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry p = (Map.Entry) it.next();
			final byte[] utf8 = ((String) p.getValue())
					.getBytes(OAuth.ENCODING);
			params.add(new OAuth.Parameter((String) p.getKey(), new String(utf8, "ISO-8859-1")));
		}
		return params;
	}

	static class MessageWithBody extends OAuthMessage {

		public MessageWithBody(String method, String URL,
				Collection<OAuth.Parameter> parameters, String contentType,
				byte[] body) {
			super(method, URL, parameters);
			this.body = body;
			Collection<Map.Entry<String, String>> headers = getHeaders();
			headers.add(new OAuth.Parameter(HttpMessage.ACCEPT_ENCODING,
					HttpMessageDecoder.ACCEPTED));
			if (body != null) {
				headers.add(new OAuth.Parameter(HttpMessage.CONTENT_LENGTH,
						String.valueOf(body.length)));
			}
			if (contentType != null) {
				headers.add(new OAuth.Parameter(HttpMessage.CONTENT_TYPE,
						contentType));
			}
		}

		private final byte[] body;

		@Override
		public InputStream getBodyAsStream() {
			return (body == null) ? null : new ByteArrayInputStream(body);
		}
	}

}
