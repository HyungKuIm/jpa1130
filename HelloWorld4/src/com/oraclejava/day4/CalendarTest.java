package com.oraclejava.day4;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		
		
		System.out.println(year + "-" + month + "-" + day);
		
		int hourOfDay = cal.get(Calendar.HOUR); // 1~12
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int am_pm = cal.get(Calendar.AM_PM);
		
		System.out.println(hourOfDay + ":" + minute + ":" + second 
				+ "(" + (am_pm == 0 ? "오전" : "오후") + ")");
	}

}
