package org.teksme.server.tests.oauth;

import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

import net.oauth.OAuthException;
import net.oauth.OAuthMessage;

import org.junit.Test;

public class SignedRequestsTest extends OAuthTest {

	static final String sendMsgURL = "http://localhost:8080/sendmsg";

	@Test
	public void sendSignedRequestTest() {
		// access the resource
		Properties paramProps = new Properties();
		paramProps
				.setProperty("oauth_token", props.getProperty("requestToken"));

		// send an SMS message
		paramProps.setProperty("from", "+12376487628");
		paramProps.setProperty("to", "+12028129412, +12025501337");
		paramProps.setProperty("channel", "SMS");
		paramProps.setProperty("shout", "Hello from TeksMe!");
		paramProps.setProperty("gateway", "BULKSMS");

		String consumerKey = props.getProperty("consumerKey");
		String consumerSecret = props.getProperty("consumerSecret");
		String callbackUrl = null;

		OAuthMessage response = null;
		try {
			response = sendRequest(paramProps, sendMsgURL, "GET", consumerKey,
					consumerSecret, callbackUrl);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (OAuthException e) {
			assertFalse("OAuth token has expired!",
					e.getMessage().contains("token_expired"));
			assertFalse("Required parameter(s) was not specified.", e
					.getMessage().contains("HTTP/1.1 409 Conflict"));
			e.printStackTrace();
		}
		try {
			System.out.println(response.readBodyAsString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(expected = OAuthException.class)
	public void sendSignedRequestWithExpiredTokenTest() throws IOException,
			URISyntaxException, OAuthException {
		// access the resource
		Properties paramProps = new Properties();
		paramProps.setProperty("oauth_token", "271687671647162876318276");

		String consumerKey = props.getProperty("consumerKey");
		String consumerSecret = props.getProperty("consumerSecret");
		String callbackUrl = null;

		OAuthMessage response = null;
		response = sendRequest(paramProps, sendMsgURL, "GET", consumerKey,
				consumerSecret, callbackUrl);

		System.out.println(response.readBodyAsString());

	}
}
