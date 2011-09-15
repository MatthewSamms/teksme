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

public class Parameter {

	private String name;
	private String value;

	public Parameter(String name, String value) {
		super();
		if (name == null)
			throw new IllegalArgumentException("name must not be null");
		if (value == null)
			throw new IllegalArgumentException("value must not be null");
		this.name = name;
		this.value = value;
	}

	public void printOn(StringBuffer buffer) {
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
