package com.aditya.java;

public class NullPointerExcep {
	public static void main(String_Demo[] args) {
		try {
			String_Demo a=null;
			System.out.println(a.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("NullPEXception");
		}
	}
}
