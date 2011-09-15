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
package org.teksme.server.common.validator;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A basic implementation of a screening that that also acts as a chain.
 */
public class BasicScreening implements Screening, ScreeningChain {

	/**
	 * The severity.
	 * 
	 * @see #getSeverity
	 */
	protected int severity;

	/**
	 * The message.
	 * 
	 * @see #getMessage
	 */
	protected String message;

	/**
	 * The error message URL.
	 * 
	 * @see #getMoreInfoURL
	 */
	protected String moreInfo;

	/**
	 * The message.
	 * 
	 * @see #getMessage
	 */
	protected List<Screening> children;

	/**
	 * The data.
	 * 
	 * @see #getData
	 */
	protected List<?> dataList;

	protected Object[] data;

	/**
	 * The source.
	 * 
	 * @see #getSource
	 */
	protected String source;

	/**
	 * The statusCode.
	 * 
	 * @see #getStatusCode
	 */
	protected int statusCode;

	/**
	 * The code.
	 * 
	 * @see #getCode
	 */
	protected int code;

	/**
	 * Default Constructor (no initialization for local parameters)
	 */
	public BasicScreening() {
		super();
	}

	public BasicScreening(String source, int code, String message, Object[] data) {
		this.source = source;
		this.code = code;
		this.message = message;
		this.dataList = dataAsList(data);
		this.data = data;
	}

	public BasicScreening(String source, int statusCode, int code, String message, String moreInfo, Object[] data) {
		this(source, code, message, data);
		this.statusCode = statusCode;
		this.moreInfo = moreInfo;
	}

	public BasicScreening(int severity, String source, int code, String message, Object[] data) {
		this(source, code, message, data);
		this.severity = severity;
	}

	public void add(Screening diagnostic) {
		if (children == null) {
			children = new ArrayList<Screening>();
		}

		children.add(diagnostic);
		int childSeverity = diagnostic.getSeverity();
		if (childSeverity > getSeverity()) {
			severity = childSeverity;
		}

	}

	public void addAll(Screening diagnostic) {
		for (Screening child : diagnostic.getChildren()) {
			add(child);
		}
	}

	public void merge(Screening diagnostic) {
		if (diagnostic.getChildren().isEmpty()) {
			add(diagnostic);
		} else {
			addAll(diagnostic);
		}
	}

	public int getSeverity() {
		return severity;
	}

	protected void setSeverity(int severity) {
		this.severity = severity;
	}

	public String getSource() {
		return source;
	}

	protected void setSource(String source) {
		this.source = source;
	}

	public int getStatusCode() {
		return statusCode;
	}

	protected void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public int getCode() {
		return code;
	}

	protected void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		Object[] data = getData();
		String msgFormatted = message;
		if (data != null) {
			msgFormatted = MessageFormat.format(message, data);
		}
		return msgFormatted;
	}

	public String getMoreInfoURL() {
		return moreInfo;
	}

	/**
	 * Returns the first throwable object available in the {@link #data} list,
	 * which is set when this diagnostic is instantiated.
	 */
	public Throwable getException() {
		List<?> dataList = getDataList();
		if (dataList != null) {
			for (Object datum : dataList) {
				if (datum instanceof Throwable) {
					return (Throwable) datum;
				}
			}
		}
		return null;
	}

	public List<Screening> getChildren() {
		if (children == null) {
			return Collections.emptyList();
		} else {
			return Collections.unmodifiableList(children);
		}
	}

	public List<?> getDataList() {
		return dataList;
	}

	protected List<?> dataAsList(Object[] data) {
		if (data == null) {
			return Collections.EMPTY_LIST;
		} else {
			Object[] copy = new Object[data.length];
			System.arraycopy(data, 0, copy, 0, data.length);
			return Arrays.asList(copy);
		}
	}

	public Object[] getData() {
		return data;
	}

}
