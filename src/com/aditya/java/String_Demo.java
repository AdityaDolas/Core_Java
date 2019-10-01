package com.aditya.java;

public class String_Demo {
	void string1() {
		String s1=new String("Hi");
		String s2=new String("Hello");
		String s3=new String("Welcome to Java");
		System.out.println(s1);
		System.out.println(s2);
	
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s2.equals(s1));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.startsWith("H"));
		System.out.println(s2.indexOf("o"));
		System.out.println(s1.lastIndexOf("i"));
		System.out.println(s3.substring(8));
		System.out.println(s2.concat(s3));
		System.out.println(s3.replace('o', 't'));
		System.out.println(s3.toUpperCase());
		
	}
	public static void main(String[] args) {
		String_Demo sd=new String_Demo();
		sd.string1();
	}
}
