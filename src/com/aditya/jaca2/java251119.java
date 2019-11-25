package com.aditya.jaca2;

import com.aditya.java.StaticInner;

public class java251119 {
	public static void main(String[] args) {
		System.out.println("Java 25/11/19 practice");
	}
}

class areaOfCircle1 {
	public static void main(String[] args) {
		double rad;
		final double PI = 3.14159;
		rad = 100;
		double area = PI * rad * rad;
		System.out.println("Area of circle is = " + area);
	}
}

class compInterest {
	public static void main(String[] args) {
		double a, p, r, n, ci;
		p = 49;
		r = 8;
		n = 33;
		a = p * Math.pow((1 + (r / 100.0)), n);
		ci = a - p;
		System.out.println("Amount = " + a);
		System.out.println("Compound Interest = " + ci);
	}
}

class boolTest {
	public static void main(String[] args) {
		boolean b;
		b = false;
		System.out.println("b is false.");
		b = true;
		System.out.println("b is true.");

		if (b) {
			System.out.println("This is executed.");
		}
	}
}

class constant1{
	static final int nom= 12;
	static final double Pi = (double) 22/7;
	
	public static void main(String[] args) {
	System.out.println("Number of months:"+nom);
	System.out.println("Pi:"+Pi);
		
	}
}