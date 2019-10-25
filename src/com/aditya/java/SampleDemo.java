package com.aditya.java;

public class SampleDemo {
	// instance variable // class variable
	int i;
	
	// instance variable // class variable // static variable
	static int s;
	
	// Static Method
	static void sCounter() {
		s = 0; // initialized the variable
		s++;
		System.out.println(s);
	}
	
	
	void counter() {
		// local variable
		// you have to initialize this variable or it will give compile-time error
		int a = 2;

		System.out.println(a);
		System.out.println(a + a);
	}
	
	
	
	public static void main(String[] args) {
		SampleDemo s = new SampleDemo();
		// s.counter();
		s.sCounter();
	}
}
