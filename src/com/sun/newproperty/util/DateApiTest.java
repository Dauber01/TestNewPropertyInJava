package com.sun.newproperty.util;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * 用来测试新的时间类型java.time
 * @author Lucifer
 *
 */
public class DateApiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test5();
	}
	
	public static void test() {
		Clock clock = Clock.systemDefaultZone();
		clock.millis();
		Instant instant = clock.instant();
		Date date = Date.from(instant);
		System.out.println(date);
	}

	public static void test1() {
		//System.out.println(ZoneId.getAvailableZoneIds());
		ZoneId zone1 = ZoneId.of("Europe/Berlin");
		ZoneId zone2 = ZoneId.of("Brazil/East");
		//System.out.println(zone1.getRules());
		//System.out.println(zone2.getRules());
		LocalTime now1 = LocalTime.now(zone1);
		LocalTime now2 = LocalTime.now(zone2);
		System.out.println(now1.isBefore(now2));
		long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
		System.out.println(hoursBetween);
		long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);
		System.out.println(minutesBetween);
	}

	public static void test2() {
		LocalTime localTime = LocalTime.of(22, 11, 10);
		System.out.println(localTime);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN);
		LocalTime leetTime = LocalTime.parse("13:12",dateTimeFormatter);
		System.out.println(leetTime);
	}

	public static void test3() {
//		LocalDate localDate = LocalDate.now();
//		LocalDate tomorrow = localDate.plus(1, ChronoUnit.DAYS);
//		LocalDate yesterday = tomorrow.minusDays(2);
//		LocalDate asCreate = LocalDate.of(2015, Month.JULY, 3);
//		DayOfWeek dayOfWeek = asCreate.getDayOfWeek();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
		LocalDate maxf = LocalDate.parse("24.12.2015",dateTimeFormatter);
		System.out.println(maxf);
	}

	public static void test4() {
		LocalDateTime sylvester = LocalDateTime.of(2012, Month.DECEMBER, 12, 12, 21, 21);
		DayOfWeek dayOfWeek = sylvester.getDayOfWeek();
		System.out.println(dayOfWeek);
		Month month = sylvester.getMonth();
		System.out.println(month);
		long minuteOfDay = sylvester.getLong(ChronoField.MINUTE_OF_DAY);
		System.out.println(minuteOfDay);
		Instant instant = sylvester.atZone(ZoneId.systemDefault()).toInstant();
		Date date = Date.from(instant);
		System.out.println(date);
	} 

	public static void test5() {
		/*DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd,yyyy-HH:mm");
		LocalDateTime parsed = LocalDateTime.parse("Nov 03, 2014 - 07:13",dateTimeFormatter);
		String string = dateTimeFormatter.format(parsed);
		System.out.println(string);*/
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy - HH:mm");
			LocalDateTime parsed = LocalDateTime.parse("Nov 03, 2014 - 07:13", dateTimeFormatter);
			String string = dateTimeFormatter.format(parsed);
			System.out.println(string); 
	}
}
