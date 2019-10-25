package com.aditya.java;

public class SampleDemo {
	// instance variable // class variable
	int i;

	void counter() {
		// local variable
		// you have to initialize this variable or it will give compile-time error
		int a = 2;

		System.out.println(a);
		System.out.println(a + a);
	}

	public static void main(String[] args) {
		SampleDemo s = new SampleDemo();
		s.counter();
	}
}
