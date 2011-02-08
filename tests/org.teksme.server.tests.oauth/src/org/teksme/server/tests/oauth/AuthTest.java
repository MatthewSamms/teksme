/**
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.teksme.server.tests.oauth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;
import org.teksme.server.identity.util.BASE64Encoder;
import org.teksme.server.identity.util.UrlBuilder;

public class AuthTest {

	@Test
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
}
