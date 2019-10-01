package com.aditya.java;

public class String2 {

	public static void main(String_Demo[] args) {
		String_Demo s1 = "java";
		String_Demo s2 = "java";
		String_Demo s3 = new String_Demo("java");

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
	}

}