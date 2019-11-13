package com.aditya.jaca2;

public class trytocatch {
	public static void main(String[] args) {
		try {
			int a = 29;
			int b = 0;
			int r = a/b;
		} catch (ArithmeticException e) {
			System.out.println("cannot devided by zero.");
		}
	}
}
