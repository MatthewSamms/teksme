package org.teksme.client.test.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

import org.junit.Test;
import org.teksme.client.test.TestUtils;

public class SendOutboundMsgTest extends HttpTestcase {

	public static final String SERVICE_URL = "http://localhost:8080/sendmsg";

	private static final String MODEL_FILE = "output/teks_outmsg.xml";

	@Test
	public void outboundMsgTest() {

		try {

			final String xmlInput = TestUtils.getInstance()
					.convertXMLFileToString(MODEL_FILE);

			out.write(xmlInput);

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

	@Override
	public String getServiceURL() {
		return SERVICE_URL;
	}

	
}
