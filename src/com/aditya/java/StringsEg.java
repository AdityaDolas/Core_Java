package com.aditya.java;

public class StringsEg {

	// How to compare two Strings

	protected void compairTo() {
		String str = "Hello World";
		String str2 = "hello world";
		Object objstr = str;

		System.out.println(str.compareTo(str2));
		System.out.println(str.compareToIgnoreCase(str2));
		System.out.println(str.compareTo(objstr.toString()));

	}

	// String Compare by equals()

	protected void equalsTo() {
		String s1 = "aditya";
		String s2 = "aditya";
		String s3 = new String("adi tya");

		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
	}

	public static void main(String[] args) {
		StringsEg st1 = new StringsEg();
		// st1.compairTo();
		// st1.equalsTo();

	}
}
