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
package org.teksme.server.mail.util;

import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class RandomGenerator {

	private static Log logger = LogFactory.getLog(RandomGenerator.class);

	final static int[] sizeTable = { 0, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999,
			999999999, Integer.MAX_VALUE };

	private static Random random = new Random();

	public static int generate(int digit) {
		int highest = sizeTable[digit] + 1;
		int lowest = sizeTable[digit - 1] + 1;

		int generated = random.nextInt(highest);

		logger.info("Entry {}" + generated);

		if (generated < lowest)
			generated = generate(digit);

		return generated;
	}
}