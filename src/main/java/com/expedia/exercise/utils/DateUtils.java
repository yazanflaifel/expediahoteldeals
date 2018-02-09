package com.expedia.exercise.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static String getDateInSimpleFormat(Long date) {
		if (date == null) {
			return null;
		}
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(DateUtils.convertToCalendar(date).getTime());
	}

	public static Calendar convertToCalendar(Long dateLong) {
		if (dateLong == null) {
			return null;
		}
		
		Date date = new Date();
		date.setTime(dateLong);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONDAY, -1);
		return calendar;
	}
}
