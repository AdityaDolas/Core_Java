package com.aditya.java;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyDemo {
	public static void main(String[] args) {
		NumberFormat nft = NumberFormat.getCurrencyInstance(new Locale("de","DE"));
		String formatted = nft.format(10000);
		System.out.println(formatted);
	}
}
