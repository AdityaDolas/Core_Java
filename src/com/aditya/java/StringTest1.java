package com.aditya.java;

public class StringTest1 {
	public static void main(String_Demo[] args) {
		// Declare String without using new operator
		String_Demo s = "GeeksforGeeks";

		// Prints the String.
		System.out.println("String s = " + s);

		// Declare String using new operator
		String_Demo s1 = new String_Demo("GeeksforGeeks");

		String_Demo s2 = new String_Demo("GeeksforGeekss");

		String_Demo s3 = new String_Demo("GeeksforGeeksss");

		String_Demo s4 = new String_Demo("GeeksforGeekssss");

		String_Demo s5 = new String_Demo("GeeksforGeekssssss");

		String_Demo s6 = new String_Demo("GeeksforGeeksssssss");

		// Prints the String.
		System.out.println("String s1 = " + s1);
		System.out.println("String s2 = " + s2);
		System.out.println("String s3 = " + s3);
		System.out.println("String s4 = " + s4);
		System.out.println("String s5 = " + s5);
		System.out.println("String s6 = " + s6);
	}
}
