package com.aditya.java;

import java.util.Locale;

public class Locale3 {
	public static void main(String_Demo[] args) {
		Locale[] loco = { new Locale("en", "US"), new Locale("it", "IT") };

		for (int i = 0; i < loco.length; i++) {
			String_Demo displayLanguage = loco[i].getDisplayLanguage(loco[i]);
			System.out.println(loco[i].toString() + ":" + displayLanguage);
		}
	}
}
