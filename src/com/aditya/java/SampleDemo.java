package com.aditya.java;

import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class SampleDemo {
	// instance variable // class variable
	int i;

	// instance variable // class variable // static variable
	static int s;
	int n, m;

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

	void swappingValues() {

		System.out.println("Enter value of n1 and n2 : ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Before Swapping value of n1 : " + n1 + " and n2 :" + n2 + " : ");
		int temp;

		temp = n1;
		n1 = n2;
		n2 = n1;

		System.out.println("After Swapping value of n1 : " + n1 + " and n2: " + n2 + " : ");

	}

	// Method Overloading
	
	void add(int a) {
		a++;
		System.out.println(a);
	}

	void add(float m) {
		m++;
		System.out.println(m);
	}

	void add(int p, int q, int r) {
		int t = p + q + r;
		System.out.println(t);
	}
	
	// Final Variable
	
	final int pi = 3;
	
	void displayFinal() {
		// pi++; // This will give compile-time error because Final Variable cannot be modified
		System.out.println(pi);
	}
	
	// Constructors :-
		// Constructors has same name as class name
		// Constructors has no return type
		// Constructors invokes automatically with object creation
		// With Object creation all instance variable will assign with default values
	
	int a;
	
	// Default Constructor
	public SampleDemo() { 
		System.out.println("Default Constructor");
	}
	
	// Parameterized Constructor
	public SampleDemo(int i) {
		System.out.println("Parameterized Constructor");
	}
	
	
	// public static void main (String[] args) is known as Copy Constructor
	public static void main(String[] args) {
		// Calling Default Constructor
		SampleDemo s = new SampleDemo();
		new SampleDemo();
		// Calling Default Constructor
		SampleDemo s1 = new SampleDemo(5);
		new SampleDemo(5);
		// s.counter();
		// s.sCounter();
		// s.swappingValues();
		// s.add(4);
		// s.add(6);
		// s.add(3, 5, 7);
		// s.displayFinal();
	}
}
