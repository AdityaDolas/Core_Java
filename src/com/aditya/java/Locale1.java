package com.aditya.java;

import java.util.Locale;

public class Locale1 {
	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getLanguage());
		
	}
	
}
