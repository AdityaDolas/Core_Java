package com.aditya.jaca2;

import java.io.Console;
import java.util.Scanner;

import javax.print.attribute.standard.MediaName;

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

class constant1 {
	static final int nom = 12;
	static final double Pi = (double) 22 / 7;

	public static void main(String[] args) {
		System.out.println("Number of months:" + nom);
		System.out.println("Pi:" + Pi);

	}
}

class finalVar {
	final static double pi = 3.14159;

	public static void main(String[] args) {
		double r = 10.0, a;
		a = pi * r * r;
		System.out.println("Area of circle: " + a);
	}
}

class varDeclareAtEnd {
	public static void main(String[] args) {
		msg = "Hello Java Developer.";
		System.out.println("Message: " + msg);
	}

	static String msg;
}

class swapWithThirdNo {
	public static void main(String[] args) {
		int a = 10, b = 20, t;
		System.out.println("Before swapping:");
		System.out.println("a=" + a + " " + "b=" + b);
		t = a;
		a = b;
		b = t;
		System.out.println("After swapping:");
		System.out.println("a=" + a + " " + "b=" + b);
	}
}

class swappingWithoutThirdVariable {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("a=" + a + " " + "b=" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a=" + a + " " + "b=" + b);

	}
}

class console1 {
	public static void main(String[] args) {
		Console cn = System.console();
		int n;

		System.out.println("Enter a Number:");
		n = Integer.parseInt(cn.readLine());

		System.out.println("The given number:");
	}
}

class evenOdd19 {
	public static void main(String[] args) {
		System.out.println("Enter: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if (i % 2 == 0)
			System.out.println(i + " is even.");
		else
			System.out.println(i + " is odd");
	}
}
