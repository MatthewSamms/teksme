package org.teksme.model.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		//Pattern patt = Pattern.compile("(?i)\\[(.*ERROR)\\].*(?!.?The required feature).+'(.*?)'.(must be set)\\z"); // could be stored in a
		Pattern patt = Pattern.compile(".*'(.*?)'"); // could be stored in a
		//String theString = "[ERROR] The required feature 'from' of 'org.teksme.model.teks.impl.OutboundMessageImpl@2a0ab444{/Users/fabianocruz/Documents/27-TeksMe/Source/TeksMe/org.teksme.model.test/resources/data/teks_outmsg.xml#fbb6cb52-e6b3-49ae-994e-6f96fa7872d7}' must be set";
		String theString = "feature 'from' of 'to' ";
		
		
		// static final field.
//		Matcher matcher = patt.matcher(theString);
//		boolean matches = matcher.matches();
//		String updateString = matcher.group(1);
				
		//System.out.println(matches);
		System.out.println(theString.split("'")[1]);
		
//		for (int i = 0; i < matcher.groupCount() + 1; i++) {
//			System.out.println(i + " " + matcher.group(i));
//		}

	}
}
