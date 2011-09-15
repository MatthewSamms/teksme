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

import java.util.List;

public interface Screening {

	public static final String DIAGNOSTIC_SOURCE = "org.teksme.server.common.validator";

	/**
	 * The bit mask value <code>0x0</code> for a {@link #getSeverity severity}
	 * indicating everything is okay.
	 */
	int OK = 0x0;

	/**
	 * The bit mask value <code>0x1</code> for a {@link #getSeverity severity}
	 * indicating there is an informational message.
	 */
	int INFO = 0x1;

	/**
	 * The bit mask value <code>0x2</code> for a {@link #getSeverity severity}
	 * indicating there is warning message.
	 */
	int WARNING = 0x2;

	/**
	 * The bit mask value <code>0x1</code> for a {@link #getSeverity severity}
	 * indicating there is an error message.
	 */
	int ERROR = 0x4;

	/**
	 * The bit mask value <code>0x1</code> for a {@link #getSeverity severity}
	 * indicating that the diagnosis was canceled.
	 */
	int CANCEL = 0x8;

	/**
	 * Returns an indicator of the severity of the problem.
	 */
	int getSeverity();

	/**
	 * Returns a message describing the situation.
	 */
	String getMessage();

	/**
	 * Returns the unique identifier of the source.
	 */
	String getSource();

	/**
	 * Returns the URL with the Error and Warning Dictionary.
	 */
	String getMoreInfoURL();

	/**
	 * Returns {@link #getSource source-specific} identity code.
	 */
	int getStatusCode();

	/**
	 * Returns {@link #getSource source-specific} identity code.
	 */
	int getCode();

	/**
	 * Returns the relevant low-level exception, or <code>null</code> if none.
	 */
	Throwable getException();

	/**
	 * Returns the arbitrary associated list of data. The first element is
	 * typically the object that is the primary source of the problem; the
	 * second element is typically some object describing the problematic
	 * feature or aspect of the primary source, and the remaining elements are
	 * additional objects associated with or describing the problem.
	 */
	List<?> getDataList();

	Object[] getData();

	/**
	 * Returns the list of child {@link Screening diagnostics}.
	 */
	List<Screening> getChildren();

	/**
	 * A diagnostic indicating that everything is okay.
	 */
	Screening OK_INSTANCE = new BasicScreening(OK, "org.teksme.server.common.validator", 0,
			"The requested action has been successfully completed", null);

	/**
	 * A diagnostic indicating that the diagnosis was canceled.
	 */
	Screening CANCEL_INSTANCE = new BasicScreening(CANCEL, "org.teksme.server.common.validator", 0,
			"The requested action has been canceled!", null);

}
