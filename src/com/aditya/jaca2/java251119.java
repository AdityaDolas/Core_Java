package com.aditya.jaca2;

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

class compInterest{
	public static void main(String[] args) {
		double a, p, r, n,ci;
		p = 49;
		r = 8;
		n = 33;
		a = p* Math.pow((1+(r/100.0)), n);
		ci = a-p;
		System.out.println("Amount = "+a);
		System.out.println("Compound Interest = "+ci);
	}
}

