package org.teksme.server.tests.oauth;

import java.util.Properties;

import net.oauth.OAuth;
import net.oauth.OAuthAccessor;
import net.oauth.OAuthMessage;
import net.oauth.ParameterStyle;
import net.oauth.client.OAuthClient;
import net.oauth.client.httpclient4.HttpClient4;

public class SendSignedMessageRequest extends OAuthTest {

	// fill with your public key
	static final String consumerKey = "675hvkhmkp5sd5v7yd6cp3uj";
	// fill with your secret key
	static final String consumerSecret = "6BU4893qXN";
	static final String token = "a0bd094767305301f394f61c1feedf33";
	static final String tokenSecret = "5f0106023bd0cf64314e43b7a2b17df9";
	// static final String sendMsgURL = "http://97.107.129.138:8089/sendmsg";
	// fill with the URL for the OAuth service
	static final String sendMsgURL = "http://localhost:8080/sendmsg";
	// fill with the URL for the OAuth service
	static final String attPhone = "+12029579543";
	static final String sandraPeru = "51968468642";
	static final String claroCordoba = "+5493512291366";

	public static void main(String[] args) throws Exception {
		// access the resource
		Properties paramProps = new Properties();
		paramProps.setProperty("oauth_token", token);

		// send an SMS message
		paramProps.setProperty("from", "teksme");
		paramProps.setProperty("to", attPhone);
		paramProps.setProperty("channel", "SMS");
//		paramProps.setProperty("shout",
//				"V’deos: La destrucci—n causada por el tornado.");
		paramProps.setProperty("shout",
		"Hello from TeksMe! welcome!");
		paramProps.setProperty("routing", "BULKSMS");

		OAuthAccessor accessor = createOAuthAccessor(consumerKey,
				consumerSecret, sendMsgURL, null);
		accessor.tokenSecret = tokenSecret;

		testInvokeMessage(accessor, paramProps);
	}

	public static void testAccessMessageViaPost(OAuthAccessor accessor,
			Properties paramProps) throws Exception {

		OAuthClient client = new OAuthClient(new HttpClient4());

		String contentType = "text/plain; charset=" + OAuth.ENCODING;
		final byte[] utf8 = paramProps.toString().getBytes("UTF-8");

		MessageWithBody request = new MessageWithBody(OAuthMessage.POST,
				sendMsgURL, getOAuthParams(paramProps), contentType, utf8);
		request.getHeaders().add(
				new OAuth.Parameter("Content-Type", contentType));

		OAuthMessage response = client.access(request,
				ParameterStyle.QUERY_STRING);

		System.out.println(response.readBodyAsString());

	}

	public static void testInvokeMessage(OAuthAccessor accessor,
			Properties paramProps) throws Exception {

		OAuthClient client = new OAuthClient(new HttpClient4());

		OAuthMessage response = client.invoke(accessor, OAuthMessage.GET,
				sendMsgURL, getOAuthParams(paramProps));

		System.out.println(response.readBodyAsString());

	}
}
