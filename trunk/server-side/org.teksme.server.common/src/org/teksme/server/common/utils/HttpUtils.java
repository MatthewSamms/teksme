/**
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

public class HttpUtils {

	Logger logger = Logger.getLogger(HttpUtils.class.getName());

	public HttpUtils() {
	}

	public String parsePostData(HttpServletRequest request, ServletInputStream in, String postParam) throws IOException {
		StringBuffer xmlBuff = new StringBuffer();
		String xml = request.getParameter(postParam);
		if (xml != null) {
			final BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String inXMLString = null;
			while ((inXMLString = reader.readLine()) != null) {
				xmlBuff.append(inXMLString);
			}
			reader.close();
		}
		return xmlBuff.toString();
	}

	public String ExpandHttpHeaders(List<HttpHeader> httpHeaderList) {
		StringBuffer buffer = new StringBuffer();
		for (HttpHeader h : httpHeaderList) {
			buffer.append(h.key);
			buffer.append("=");
			buffer.append(h.value);
			buffer.append("&");
		}
		return buffer.toString();
	}

	public static class HttpHeader {
		public String key;

		public String value;

		public boolean unicode;

		public HttpHeader() {
			this.key = "";
			this.value = "";
			this.unicode = false;
		}

		public HttpHeader(String myKey, String myValue, boolean myUnicode) {
			this.key = myKey;
			this.value = myValue;
			this.unicode = myUnicode;
		}
	}

}
