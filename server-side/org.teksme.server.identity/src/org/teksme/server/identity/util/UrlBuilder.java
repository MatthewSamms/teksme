/*
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.identity.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UrlBuilder {
	private static class UrlParameter extends Object {
		private String name;
		private String value;

		UrlParameter(String name, String value) {
			super();
			if (name == null)
				throw new IllegalArgumentException("name must not be null");
			if (value == null)
				throw new IllegalArgumentException("value must not be null");
			this.name = name;
			this.value = value;
		}

		void printOn(StringBuffer buffer) {
			buffer.append(this.name);
			buffer.append('=');
			buffer.append(this.value);
		}

		public String toString() {
			StringBuffer buffer = new StringBuffer(50);
			printOn(buffer);
			String value = buffer.toString();
			return value;
		}
	}

	private String spec;
	private List<UrlParameter> parameters;

	public UrlBuilder(String spec) {
		super();
		if (spec == null)
			throw new IllegalArgumentException("URL spec must not be null");
		this.spec = spec;
		parameters = new ArrayList<UrlParameter>(5);
	}

	public void addParameter(String name, boolean value) {
		String valueString = String.valueOf(value);
		addParameter(name, valueString);
	}

	public void addParameter(String name, int value) {
		String valueString = String.valueOf(value);
		addParameter(name, valueString);
	}

	public void addParameter(String name, String value) {
		UrlParameter parameter = new UrlParameter(name, value);
		addParameter(parameter);
	}

	private void addParameter(UrlParameter parameter) {
		synchronized (parameters) {
			parameters.add(parameter);
		}
	}

	private void printOn(StringBuffer buffer) {
		buffer.append(spec);
		printParametersOn(buffer);
	}

	private void printParametersOn(StringBuffer buffer) {
		synchronized (parameters) {
			boolean empty = parameters.isEmpty();
			if (empty == true)
				return;
			buffer.append('?');
			Iterator<UrlParameter> iterator = parameters.iterator();
			while (iterator.hasNext() == true) {
				UrlParameter parameter = iterator.next();
				parameter.printOn(buffer);
				boolean last = iterator.hasNext() == false;
				if (last == false) {
					buffer.append('&');
				}
			}
		}
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer(150);
		printOn(buffer);
		String value = buffer.toString();
		return value;
	}

	public URL toUrl() throws MalformedURLException {
		String value = toString();
		System.out.println(value);
		URL url = new URL(value);
		return url;
	}

	public void appendPath(String path) {
		// Append to the spec, taking care of the slashes properly
//		if (!spec.endsWith("/"))
//			spec += '/';
		spec += path;
	}

	public String getPath() throws MalformedURLException {
		// remove protocol, host & port, return a path with leading / and
		// without trailing /
		String answer = toUrl().getFile();
		if (!answer.startsWith("/"))
			answer = "/" + answer;
		if (answer.endsWith("/"))
			answer = answer.substring(0, answer.length() - 1);
		if (answer.length() == 0)
			return "/";
		return answer;
	}
}
