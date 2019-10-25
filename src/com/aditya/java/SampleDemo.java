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
		System.out.println("Before Swapping value of n1 : "+ n1 + " and n2 :"+ n2+" : ");
		int temp;
		
		temp = n1;
		n1 = n2;
		n2 = n1;
		
		
		System.out.println("After Swapping value of n1 : "+ n1 + " and n2: "+ n2+" : ");
		
	}

	public static void main(String[] args) {
		SampleDemo s = new SampleDemo();
		// s.counter();
		// s.sCounter();
		s.swappingValues();
	}
}
