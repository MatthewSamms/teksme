package org.teksme.server.web.shared;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;

public final class DateTimeUtils {

	public static DateTimeUtils INSTANCE = new DateTimeUtils();

	private DateTimeUtils() {

	}

	/**
	 * get client's time zone
	 * 
	 * @param type
	 * @return
	 */
	public String getTimeZone(int type) {
		Date today = new Date();
		String timezone = null;
		switch (type) {
		case 1: // date timeZoneMinOffset in minutes
			timezone = Integer.toString(today.getTimezoneOffset()); // like
																	// "420"
			break;
		case 2: // time zone RFC822
			timezone = DateTimeFormat.getFormat("Z").format(today); // like
																	// "-0700"
			break;
		case 3: // time zone TextShort
			timezone = DateTimeFormat.getFormat("v").format(today); // like
																	// "GMT-07:00"
			break;
		case 4: // time zone Name

			// THIS WONT COMPILE - WORKS IN DEBUGGER - this will not work on
			// client side
			// TimeZone tz = TimeZone.getDefault();
			// timezone = tz.getID(); //like "America/Vancouver"
			timezone = DateTimeFormat.getFormat("z").format(today); // like
																	// "GMT-07:00";

			break;
		case 5: // timezone TextLong
			timezone = DateTimeFormat.getLongDateTimeFormat().format(today); // like
																				// "March 22, 2008 5:39:22 PM GMT-07:00"
			break;
		}
		return timezone;
	}

	public String getDateTime() {
		Date resultdate = new Date();
		com.google.gwt.i18n.client.DateTimeFormat dtf = com.google.gwt.i18n.client.DateTimeFormat
				.getFormat("EEEE, MMMM d, y | h:mm a");
		return dtf.format(resultdate).toString();
	}

	public String[][] getHoursArray() {
		String hoursArray[][] = { { "--", "--" }, { "0", "00" }, { "1", "01" },
				{ "2", "02" }, { "3", "03" }, { "4", "04" }, { "5", "05" },
				{ "6", "06" }, { "7", "07" }, { "8", "08" }, { "9", "09" },
				{ "10", "10" }, { "11", "11" }, { "12", "12" }, { "13", "13" },
				{ "14", "14" }, { "15", "15" }, { "16", "16" }, { "17", "17" },
				{ "18", "18" }, { "19", "19" }, { "20", "20" }, { "21", "21" },
				{ "22", "22" }, { "23", "23" } };

		return hoursArray;
	}

	public String[][] getMinutesArray() {
		String minutesArray[][] = { { "--", "--" }, { "0", "00" },
				{ "1", "01" }, { "2", "02" }, { "3", "03" }, { "4", "04" },
				{ "5", "05" }, { "6", "06" }, { "7", "07" }, { "8", "08" },
				{ "9", "09" }, { "10", "10" }, { "11", "11" }, { "12", "12" },
				{ "13", "13" }, { "14", "14" }, { "15", "15" }, { "16", "16" },
				{ "17", "17" }, { "18", "18" }, { "19", "19" }, { "20", "20" },
				{ "21", "21" }, { "22", "22" }, { "23", "23" }, { "24", "24" },
				{ "25", "25" }, { "26", "26" }, { "27", "27" }, { "28", "28" },
				{ "29", "29" }, { "30", "30" }, { "31", "31" }, { "32", "32" },
				{ "33", "33" }, { "34", "34" }, { "35", "35" }, { "36", "36" },
				{ "37", "37" }, { "38", "38" }, { "39", "39" }, { "40", "40" },
				{ "41", "41" }, { "42", "42" }, { "43", "43" }, { "44", "44" },
				{ "45", "45" }, { "46", "46" }, { "47", "47" }, { "48", "48" },
				{ "49", "49" }, { "50", "50" }, { "51", "51" }, { "52", "52" },
				{ "53", "53" }, { "54", "54" }, { "55", "55" }, { "56", "56" },
				{ "57", "57" }, { "58", "58" }, { "59", "59" } };

		return minutesArray;

	}
}
