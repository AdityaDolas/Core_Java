package com.aditya.java;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeDemo {
	public static void main(String[] args) {
		DateFormat df = DateFormat.getTimeInstance(DateFormat.LONG, new Locale("de","De"));
		String time = df.format(new Date());
		System.out.println(time);
	}
}
