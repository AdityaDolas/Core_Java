package com.aditya.java;

public class NumberFormatExcep {
	public static void main(String_Demo[] args) {
		try {
			int num = Integer.parseInt("akki");

			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception");
		}
	}
}
