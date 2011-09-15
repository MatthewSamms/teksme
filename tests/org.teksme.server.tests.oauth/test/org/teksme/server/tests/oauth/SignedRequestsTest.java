package org.teksme.server.tests.oauth;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;

import net.oauth.OAuthException;
import net.oauth.OAuthMessage;
import net.oauth.http.HttpMessage;

import org.junit.Test;

public class SignedRequestsTest extends OAuthTest {

	static final String sendMsgURL = "http://localhost:8080/sendmsg";
	// static final String sendMsgURL = "http://localhost:8080/sendmsg";
	static final String claroPhone = "+51987611593";
	// static final String movistarPhone = "+51199987784";
	static final String movistarPhone = "+5493512291366";
	static final String attPhone = "+12028129412";
	static final String personalCordoba = "+543515606549";

	@Test
	public void sendSignedRequestTest() {
		// access the resource
		Properties paramProps = new Properties();
		paramProps
				.setProperty("oauth_token", props.getProperty("requestToken"));

		// send an SMS message
		paramProps.setProperty("from", "+12028129412");
		paramProps.setProperty("to", personalCordoba);
		paramProps.setProperty("channel", "SMS");
		paramProps.setProperty("shout",
				"Hello from TeksMe via Clickatell. [Personal/Cordoba]");
		paramProps.setProperty("routing", "CLICKATELL");

		String consumerKey = props.getProperty("consumerKey");
		String consumerSecret = props.getProperty("consumerSecret");
		String callbackUrl = null;

		OAuthMessage response = null;
		try {
			response = sendRequest(paramProps, sendMsgURL, OAuthMessage.GET,
					consumerKey, consumerSecret, callbackUrl);

			System.out.println(response.getDump().get(HttpMessage.REQUEST));
			System.out.println(response.getDump().get(HttpMessage.RESPONSE));
			
//			String id = client.getClass().getName();
//			assertNull(id, response.getHeader(HttpMessage.CONTENT_ENCODING));
//			assertNull(id, response.getHeader(HttpMessage.CONTENT_LENGTH));

		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (OAuthException e) {
			assertFalse("OAuth token has expired!",
					e.getMessage().contains("token_expired"));
			// assertFalse("Required parameter(s) was not specified.", e
			// .getMessage().contains("HTTP/1.1 409 Conflict"));
			e.printStackTrace();
		}
		try {
			printHeaderAsString(response.getHeaders());
			//assertEquals(id, expected, response.readBodyAsString());
			System.out.println(response.readBodyAsString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void printHeaderAsString(List<Entry<String, String>> headers) {
		for (Entry<String, String> entry : headers) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
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
