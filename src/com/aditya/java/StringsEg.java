package com.aditya.java;

//How to compare two Strings
public class StringsEg {
	public static void main(String[] args) {
		String str = "Hello World";
		String str2 = "hello world";
		Object objstr = str;
		
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareToIgnoreCase(str2));
		System.out.println(str.compareTo(objstr.toString()));
	}
}
