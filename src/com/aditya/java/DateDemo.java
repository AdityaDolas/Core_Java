package com.aditya.java;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo {
	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("de","DE"));
		String Date = df.format(new Date());
		System.out.println(Date);
	}
}
