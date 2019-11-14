package com.aditya.jaca2;

public class ExceptionalHandling {
	public static void main(String[] args) {
		System.out.println("Hello World !");
	}
}

class arithmetic {
	public static void main(String[] args) {
		try {
			int a = 100;
			int b = 0;
			int result = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("cannot be divided by zero.");
		}
	}
}