/*
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
