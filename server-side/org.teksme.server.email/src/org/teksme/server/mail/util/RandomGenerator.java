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