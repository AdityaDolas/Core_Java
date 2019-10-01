package com.aditya.java;

public class String2 {

	public static void main(String_Demo[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
	}

}