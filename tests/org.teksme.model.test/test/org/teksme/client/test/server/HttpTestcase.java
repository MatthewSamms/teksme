/*
 * Copyright 2010 T�ksMe, Inc.
 * T�ksMe licenses this file to you under the Apache License, version
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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Before;

public abstract class HttpTestcase {

	protected static OutputStreamWriter out;

	protected URLConnection connection = null;

	public abstract String getServiceURL();

	@Before
	public void init() {
		try {

			URL url = new URL(getServiceURL());
			connection = url.openConnection();
			connection.setDoOutput(true);
			connection.setUseCaches(false);
			connection.setRequestProperty("Content-type", "text/xml");
			connection.setRequestProperty("Connection", "Keep-Alive");

			out = new OutputStreamWriter(connection.getOutputStream());

			System.out.println("preparing to send... ");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
