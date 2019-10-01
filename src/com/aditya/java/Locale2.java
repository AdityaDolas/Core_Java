package com.aditya.java;

import java.util.Locale;

public class Locale2 {
	public static void main(String_Demo[] args) {
		Locale enLocale=new Locale("en", "US");
		Locale frLocale=new Locale("fr", "FR");
		Locale esLocale=new Locale("es", "ES");
		System.out.println("English : " +enLocale.getDisplayCountry());
		System.out.println("French : "+frLocale.getDisplayLanguage());
	}
}
