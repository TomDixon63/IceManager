package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

	private final static String DATE_PATTERN = "dd.MM.yyyy";

	public static LocalDate getLocalDateTodayNow() {
		return LocalDate.now();
	}

	public static LocalDate getLocalDateFromString(String s) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
		return LocalDate.parse(s, dateTimeFormatter);
	}

	public static String getLocalDateTodayNowAsString() {
		LocalDate ld = getLocalDateTodayNow();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
		return ld.format(dateTimeFormatter);
	}

}
