package org.teksme.server.tests.oauth;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

import net.oauth.OAuthAccessor;
import net.oauth.OAuthConsumer;
import net.oauth.OAuthServiceProvider;

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

}
