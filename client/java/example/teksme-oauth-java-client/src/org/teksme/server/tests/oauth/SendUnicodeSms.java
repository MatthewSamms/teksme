package org.teksme.server.tests.oauth;

//================================================ Java(Unicode) code sample ================================================//

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SendUnicodeSms {

	static public String stringToHex(String s) {
		char[] chars = s.toCharArray();
		String next;
		StringBuffer output = new StringBuffer();
		for (int i = 0; i < chars.length; i++) {
			next = Integer.toHexString((int) chars[i]);
			// Unfortunately, toHexString doesn't pad with zeroes, so we have
			// to.
			for (int j = 0; j < (4 - next.length()); j++) {
				output.append("0");
			}
			output.append(next);
		}
		return output.toString();
	}

	static public void main(String[] args) {
		try {
			// Construct data
			String data = "";
			/*
			 * Note the suggested encoding for certain parameters, notably the
			 * username and password.
			 * 
			 * Please remember that 16bit support is a route-specific feature.
			 * Please contact us if you need to confirm the status of a
			 * particular route.
			 * 
			 * Also, mobile handsets only implement partial support for non-
			 * Latin characters in various languages and will generally only
			 * support languages of the area of their distribution. Please do
			 * not expect e.g. a handset sold in South America to display Arabic
			 * text.
			 */
			data += "username=" + URLEncoder.encode("teksmeinc", "ISO-8859-1");
			data += "&password=" + URLEncoder.encode("teksme1@", "ISO-8859-1");
			data += "&message="
					+ stringToHex("Vídeos: .");
			//data += "&dca=16bit";
			data += "&want_report=1";
			data += "&msisdn=12028129412";

			// Send data
			URL url = new URL(
					"http://usa.bulksms.com:5567/eapi/submission/send_sms/2/2.0");
			/*
			 * If your firewall blocks access to port 5567, you can fall back to
			 * port 80: URL url = new
			 * URL("http://bulksms.vsms.net/eapi/submission/send_sms/2/2.0");
			 * (See FAQ for more details.)
			 */
			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);
			OutputStreamWriter wr = new OutputStreamWriter(
					conn.getOutputStream());
			wr.write(data);
			wr.flush();

			// Get the response
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) {
				// Print the response output...
				System.out.println(line);
			}
			wr.close();
			rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
