package org.teksme.client.test.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;
import org.teksme.client.test.TestUtils;
import org.teksme.server.identity.util.BASE64Encoder;
import org.teksme.server.identity.util.UrlBuilder;

public class SendOutboundMsgTest extends HttpTestcase {

	public static final String SERVICE_URL = "http://localhost:8080/sendmsg";

	// public static final String SERVICE_URL =
	// "http://97.107.129.138:8080/sendmsg";

	private static final String MODEL_FILE = "output/teks_outmsg.xml";

	@Test
	public void outboundMsgTest() {

		try {

			String fmt = "EEE, dd MMM yyyy HH:mm:ss ";
			SimpleDateFormat df = new SimpleDateFormat(fmt, Locale.US);
			df.setTimeZone(TimeZone.getTimeZone("GMT"));

			String date = df.format(new Date()) + "GMT";

			final String xmlInput = TestUtils.getInstance()
					.convertXMLFileToString(MODEL_FILE);

			out.write(xmlInput);
			out.flush();

			connection.connect();

			// connection.setRequestProperty("authorized", oauth_token);
			connection.setRequestProperty("Date", date);

			out.close();

			BufferedReader in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));

			String decodedString;
			while ((decodedString = in.readLine()) != null) {
				System.out.println(decodedString);
			}

			in.close();

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void testAuthAccessToken() {
		HttpURLConnection httpConn = null;
		try {

			BASE64Encoder encoder = new BASE64Encoder();
			String email = "fabianoc@acm.org";
			String password = "teksme";

			String fmt = "EEE, dd MMM yyyy HH:mm:ss ";
			SimpleDateFormat df = new SimpleDateFormat(fmt, Locale.US);
			df.setTimeZone(TimeZone.getTimeZone("GMT"));

			String date = df.format(new Date()) + "GMT";

			String encodedCredential = encoder.encode((email + ":" + password)
					.getBytes());

			UrlBuilder builderUrl = new UrlBuilder("http://localhost:8080/auth");
			builderUrl.addParameter("oauth_consumer_key", "noCallbackConsumer");

			URL urlLogin = builderUrl.toUrl();

			httpConn = (HttpURLConnection) urlLogin.openConnection();
			httpConn.setRequestMethod("POST");
			httpConn.addRequestProperty("Authorization", "BASIC "
					+ encodedCredential);
			httpConn.setRequestProperty("Date", date);

			BufferedReader rd = new BufferedReader(new InputStreamReader(
					httpConn.getInputStream()));
			String line = rd.readLine();
			System.out.println("Return after login authentication: " + line);

		} catch (IOException e) {
			AssertionError ae;
			if (e.getMessage().contains("401")) {
				ae = new AssertionError("HTTP Error 401 - Unauthorized");
			} else {
				ae = new AssertionError("Auth falhou");
				ae.initCause(e);
			}
			throw ae;
		} finally {
			if (httpConn != null)
				httpConn.disconnect();
		}

	}

	@Override
	public String getServiceURL() {
		return SERVICE_URL;
	}

}
