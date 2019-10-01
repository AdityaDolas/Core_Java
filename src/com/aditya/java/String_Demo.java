package com.aditya.java;

public class String_Demo {
	void string1() {
		String s1=new String("Hi");
		String s2=new String("Hello");
		System.out.println(s1);
		System.out.println(s2);
	
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		
	}
	public static void main(String[] args) {
		String_Demo sd=new String_Demo();
		sd.string1();
	}
}
