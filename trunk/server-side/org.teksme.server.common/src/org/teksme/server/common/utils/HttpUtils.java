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

	public String parsePostData(HttpServletRequest request, ServletInputStream in) throws IOException {
		StringBuffer xmlBuff = new StringBuffer();

		final BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String inXMLString = null;
		while ((inXMLString = reader.readLine()) != null) {
			xmlBuff.append(inXMLString);
		}
		reader.close();

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
