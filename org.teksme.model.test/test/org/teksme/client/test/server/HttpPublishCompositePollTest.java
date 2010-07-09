package org.teksme.client.test.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

import org.junit.Test;

public class HttpPublishCompositePollTest extends HttpTestcase {

	public static final String SERVICE_URL = "http://localhost:8080/org.teksme.server.web.api/createpoll";

	private static final String MODEL_FILE = "output/teks.xml";

	@Test
	public void testConvertionXMLFileToString() {
		System.out.println(convertXMLFileToString(MODEL_FILE));
	}

	@Test
	public void publishCompositePoll() {

		try {
			out.write(convertXMLFileToString(MODEL_FILE));

			out.flush();
			connection.connect();
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

	public String getServiceURL() {
		return SERVICE_URL;
	}
}
