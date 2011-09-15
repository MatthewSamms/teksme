package org.teksme.server.tests.oauth;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

import net.oauth.OAuthAccessor;
import net.oauth.OAuthException;
import net.oauth.OAuthMessage;
import net.oauth.client.OAuthClient;
import net.oauth.client.httpclient4.HttpClient4;

import org.junit.Test;

public class SendMessagePostTest extends OAuthTest {

	static final String sendMsgURL = "http://localhost:8080/sendmsg";

	@Test
	public void requestTokenTest() throws IOException, OAuthException,
			URISyntaxException {

		String consumerKey = props.getProperty("consumerKey");
		String consumerSecret = props.getProperty("consumerSecret");

		OAuthAccessor accessor = createOAuthAccessor(consumerKey,
				consumerSecret, null);

		OAuthClient client = new OAuthClient(new HttpClient4());
		client.getRequestToken(accessor);

		setToken(accessor.requestToken);
		setTokenSecret(accessor.tokenSecret);

		assertNotNull("Request token cannot be null!", getToken());
		assertNotNull("Token secret cannot be null!", getTokenSecret());

		props.setProperty("requestToken", getToken());
		props.setProperty("tokenSecret", getTokenSecret());

		updateProperties("Last action: added requestToken");

	}

	@Test
	public void sendSignedRequestViaPostTest() {

		String token = props.getProperty("requestToken");
		assertNotNull("Request token cannot be null!", token);

		// access the resource
		Properties paramProps = new Properties();
		paramProps.setProperty("oauth_token", token);

		String XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> "
				+ "<teks:Teks xmlns:teks=\"http://teksme.org/meta/1.0.0/teks\">"
				+ "        <outboundMessage>"
				+ "          <from>+12023567865</from>"
				+ "          <to>+12028129412</to> " + "			<channels>"
				+ "                  <channel>SMS</channel>"
				+ "          </channels>"
				+ "          <shout this=\"Hello from TeksMe Cloud!\" />"
				+ "          <routing>BULKSMS</routing>"
				+ "  </outboundMessage>" + "</teks:Teks>";

		// send an SMS message
		paramProps.setProperty("data", XML);

		String consumerKey = props.getProperty("consumerKey");
		String consumerSecret = props.getProperty("consumerSecret");
		String callbackUrl = null;

		OAuthMessage response = null;
		try {
			response = sendRequest(paramProps, sendMsgURL, OAuthMessage.POST,
					consumerKey, consumerSecret, callbackUrl);
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

}
