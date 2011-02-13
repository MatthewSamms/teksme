package org.teksme.server.tests.oauth;

import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import net.oauth.OAuth;
import net.oauth.OAuthAccessor;
import net.oauth.OAuthException;
import net.oauth.OAuthMessage;
import net.oauth.client.OAuthClient;
import net.oauth.client.httpclient4.HttpClient4;

import org.junit.Test;

public class SignedRequestsTest extends OAuthTest {

	@SuppressWarnings("rawtypes")
	private OAuthMessage sendRequest(Map map, String url, String consumerKey,
			String consumerSecret, String callbackUrl) throws IOException,
			URISyntaxException, OAuthException {
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
		return client.invoke(accessor, "GET", url, params);
	}

	@Test
	public void sendSignedRequestTest() {
		// access the resource
		Properties paramProps = new Properties();
		paramProps
				.setProperty("oauth_token", props.getProperty("requestToken"));

		// send an SMS message
		String sendMsgURL = "http://localhost:8080/sendmsg";
		paramProps.setProperty("from", "+12376487628");
		paramProps.setProperty("to", "+12028129412");
		paramProps.setProperty("channel", "SMS");
		paramProps.setProperty("shout", "Hello from TeksMe!");

		String consumerKey = props.getProperty("consumerKey");
		String consumerSecret = props.getProperty("consumerSecret");
		String callbackUrl = null;

		OAuthMessage response = null;
		try {
			response = sendRequest(paramProps, sendMsgURL, consumerKey,
					consumerSecret, callbackUrl);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (OAuthException e) {
			assertFalse("OAuth token has expired!",
					e.getMessage().contains("token_expired"));
			e.printStackTrace();
		}
		try {
			System.out.println(response.readBodyAsString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
