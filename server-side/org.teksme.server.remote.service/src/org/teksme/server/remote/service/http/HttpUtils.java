package org.teksme.server.remote.service.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletInputStream;

public class HttpUtils {

	public static HttpUtils INSTANCE = HttpUtils.init();

	Logger logger = Logger.getLogger(HttpUtils.class.getName());

	private HttpUtils() {
	}

	private static HttpUtils init() {
		if (INSTANCE == null) {
			INSTANCE = new HttpUtils();
		}
		return INSTANCE;
	}

	public String parsePostData(int len, ServletInputStream in) throws IOException {

		final BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		String inXMLString = null;
		StringBuffer xmlBuff = new StringBuffer();

		while ((inXMLString = reader.readLine()) != null) {
			xmlBuff.append(inXMLString);
		}
		reader.close();

		return xmlBuff.toString();

	}

	String ExpandHttpHeaders(List<HttpHeader> httpHeaderList) {
		StringBuffer buffer = new StringBuffer();
		for (HttpHeader h : httpHeaderList) {
			buffer.append(h.key);
			buffer.append("=");
			buffer.append(h.value);
			buffer.append("&");
		}
		return buffer.toString();
	}

	class HttpHeader {
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
