package org.teksme.server.tests.oauth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import net.oauth.OAuth;
import net.oauth.OAuthAccessor;
import net.oauth.OAuthConsumer;
import net.oauth.OAuthServiceProvider;

public class OAuthTest {

	static OAuthAccessor createOAuthAccessor(String consumerKey,
			String consumerSecret, String reqUrl, String callbackUrl) {

		OAuthServiceProvider provider = new OAuthServiceProvider(reqUrl, null,
				null);
		OAuthConsumer consumer = new OAuthConsumer(callbackUrl, consumerKey,
				consumerSecret, provider);
		return new OAuthAccessor(consumer);
	}

	@SuppressWarnings("rawtypes")
	static Collection<? extends Entry> getOAuthParams(Properties map) {
		List<Map.Entry> params = new ArrayList<Map.Entry>();
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry p = (Map.Entry) it.next();
			params.add(new OAuth.Parameter((String) p.getKey(), (String) p
					.getValue()));
		}
		return params;
	}

}
