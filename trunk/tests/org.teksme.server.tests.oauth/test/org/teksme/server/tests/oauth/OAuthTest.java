package org.teksme.server.tests.oauth;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import net.oauth.OAuth;
import net.oauth.OAuthAccessor;
import net.oauth.OAuthConsumer;
import net.oauth.OAuthException;
import net.oauth.OAuthMessage;
import net.oauth.OAuthServiceProvider;
import net.oauth.client.OAuthClient;
import net.oauth.client.httpclient4.HttpClient4;

import org.junit.Before;

public class OAuthTest {

	Properties props;

	@Before
	public void setup() {
		props = new Properties();
		try {
			props.load(getClass().getResourceAsStream("oauth.properties"));
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	void updateProperties(String msg) throws IOException, URISyntaxException {
		URL url = OAuthTest.class.getResource("oauth.properties");
		String path = url.getPath().replace("bin", "properties");
		props.store(new FileOutputStream(new File(path)), msg);
	}

	OAuthAccessor createOAuthAccessor(String consumerKey,
			String consumerSecret, String callbackUrl) {

		String reqUrl = props.getProperty("requestUrl");

		OAuthServiceProvider provider = new OAuthServiceProvider(reqUrl, null,
				null);
		OAuthConsumer consumer = new OAuthConsumer(callbackUrl, consumerKey,
				consumerSecret, provider);
		return new OAuthAccessor(consumer);
	}

	@SuppressWarnings("rawtypes")
	OAuthMessage sendRequest(Map map, String url, String method,
			String consumerKey, String consumerSecret, String callbackUrl)
			throws IOException, URISyntaxException, OAuthException {
		List<Map.Entry> params = new ArrayList<Map.Entry>();
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry p = (Map.Entry) it.next();
			params.add(new OAuth.Parameter((String) p.getKey(), (String) p
					.getValue()));
		}
		OAuthAccessor accessor = createOAuthAccessor(consumerKey,
				consumerSecret, callbackUrl);
		accessor.tokenSecret = props.getProperty("tokenSecret");
		OAuthClient client = new OAuthClient(new HttpClient4());
		return client.invoke(accessor, method, url, params);
	}

}
