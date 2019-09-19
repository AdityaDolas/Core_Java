package com.aditya.java;

public class StringSampleDemo {
	public static void main(String[] args) {
		String str = "PADMAJA";
		String st1 = "0123456789";
		System.out.println(str.charAt(2));
		System.out.println(str.equalsIgnoreCase("PADMAJA"));
		System.out.println(str.length());
		System.out.println(str.replace('p', 'P'));
		System.out.println(st1.substring(4));
		System.out.println(st1.substring(4, 7));
		System.out.println(str.toLowerCase());
	}
}
