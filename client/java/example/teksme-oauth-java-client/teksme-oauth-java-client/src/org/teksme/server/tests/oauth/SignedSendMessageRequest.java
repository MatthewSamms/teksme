package org.teksme.server.tests.oauth;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

import net.oauth.OAuthAccessor;
import net.oauth.OAuthException;
import net.oauth.OAuthMessage;
import net.oauth.client.OAuthClient;
import net.oauth.client.httpclient4.HttpClient4;

public class SignedSendMessageRequest extends OAuthTest {

	static final String consumerKey = "675hvkhmkp5sd5v7yd6cp3uj"; // fill with your public key 
	static final String consumerSecret = "6BU4893qXN";// fill with your secret key
	static final String token = "b60798be27fd97a3eadad66cb8d1434c";
	static final String tokenSecret = "bd4965c86d2a51192c993a733833e87e";
	static final String sendMsgURL = "http://localhost:8080/sendmsg";// fill with the url for the oauth service

	public static void main(String[] args) throws IOException, OAuthException,
			URISyntaxException {
		// access the resource
		Properties paramProps = new Properties();
		paramProps.setProperty("oauth_token", token);

		// send an SMS message
		paramProps.setProperty("from", "+12376487628");
		paramProps.setProperty("to", "+12028129412");
		paramProps.setProperty("channel", "SMS");
		paramProps.setProperty("shout", "Hello from TeksMe!");
		paramProps.setProperty("gateway", "BULKSMS");

		OAuthAccessor accessor = createOAuthAccessor(consumerKey,
				consumerSecret, sendMsgURL, null);
		accessor.tokenSecret = tokenSecret;
		OAuthClient client = new OAuthClient(new HttpClient4());

		OAuthMessage response = client.invoke(accessor, "GET", sendMsgURL,
				getOAuthParams(paramProps));

		try {
			System.out.println(response.readBodyAsString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
