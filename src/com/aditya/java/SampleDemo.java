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
		// pi++; // This will give compile-time error because Final Variable cannot be
		// modified
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

	public void StringDemo() {
		String String1 = "Aditya Dolas ";
		String String2 = "aditya dolas";

		System.out.println("String1: " + String1);
		System.out.println("String2: " + String2);

		// length()
		System.out.println("String1 length: " + String1.length());

		// charAt(index)
		System.out.println("String1 character at index 3: " + String1.charAt(3));

		// getChars()
		char[] sa = new char[3];
		String1.getChars(2, 4, sa, 0);
		System.out.println("Value Coppied : " + sa);

		// equals()
		boolean reasult = String1.equals(String2);
		System.out.println("String1 equals String2: " + reasult);

		// compareTo()
		System.out.println("String1 compareTo String2: " + String1.compareTo(String2));

		// startsWith()
		System.out.println("String1 Starts with A: " + String1.startsWith("A"));

		// endsWith()
		System.out.println("String1 Ends with s: " + String1.endsWith("s"));

		// indexOf()
		System.out.println("String1 index Of s: " + String1.indexOf('s'));

		// lastIndexof()
		System.out.println("String1 last Index Of a: " + String1.lastIndexOf('s'));

		// subString()
		System.out.println("String1 substring after index of 5: " + String1.substring(5));

		// concat()
		System.out.println("String1 concat String2: " + String1.concat(String2));

		// replace()
		System.out.println("String1 replaced character a to z: " + String1.replace('a', 'z'));

		// toUpperCase()
		System.out.println("String1 toUpperCase: " + String1.toUpperCase());

		// toLowerCase()
		System.out.println("String1 toLowerCase : " + String1.toLowerCase());

		// trim()
		System.out.println("String1 trim: " + String1.trim());

		// toChatArray
		System.out.print("Value Returned: ");
		char[] ch = String1.toCharArray();
		System.out.println("String1 toCharArray: " + ch);

		// valueOf()
		int a = 50;
		double d = 56.45;
		System.out.println("Value of int a: " + a);
		System.out.println("Value of double d: " + d);
		char[] arr = { 'a', 'd' };
		System.out.println("a: " + String.valueOf(a));
		System.out.println("d: " + String.valueOf(d));

		// equalsIgnoreCase()
		System.out.println("String1 equalsIgnoreCase String2: " + String1.equalsIgnoreCase(String2));
	}

	
	// StringBuilder and StringBuffer
		// This classes are mutable classes as they do not create any new String Object
		// when manipulated
		// Manipulations like appending, concatenating and deleting with string literals.
	
	public void stringBuildAndBuff() {

		// append()
		StringBuilder sb = new StringBuilder("Aditya ");
		System.out.println("StringBuilder: " +sb);
		sb.append("Dolas");
		System.out.println("append dolas: "+sb);
		
		// insert()
		sb.insert(7, "B ");
		System.out.println("insert B at index 7: "+sb);
		
		// reverse()
		sb.reverse();
		System.out.println(sb);
		
		// delete()
		sb.delete(2, 4);
		System.out.println("delete index 2 and 4: "+sb);
		

	}

	// public static void main (String[] args) is known as Copy Constructor
	public static void main(String[] args) {
		// Calling Default Constructor
		SampleDemo s = new SampleDemo();
		// new SampleDemo();
		// Calling Default Constructor
		// SampleDemo s1 = new SampleDemo(5);
		// new SampleDemo(5);
		// s.counter();
		// s.sCounter();
		// s.swappingValues();
		// s.add(4);
		// s.add(6);
		// s.add(3, 5, 7);
		// s.displayFinal();
		// s.StringDemo();
		s.stringBuildAndBuff();
	}
}
