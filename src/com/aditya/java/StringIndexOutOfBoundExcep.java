package com.aditya.java;

public class StringIndexOutOfBoundExcep {
	public static void main(String[] args) {
		try {
			String a="This is like chipping";
			char c=a.charAt(200);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBound...");
		}
	}
}
