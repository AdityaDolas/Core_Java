package com.aditya.jaca2;

import java.util.Scanner;

public class LogicalExamples {
	public static void main(String[] args) {
		System.out.println("Java interview examples.");
	}
}

// Java Program for addition of two numbers
class AddTwoNumbers {
	public static void main(String[] args) {

		for (;;) {

			try {
				System.out.println("Enter first integer:");
				Scanner sc = new Scanner(System.in);
				int i = sc.nextInt();

				System.out.println("Enter second integer:");
				int j = sc.nextInt();

				// System.out.println("Enter the operation i.e. +,-,* etc :");
				// char operator = sc.next().charAt(0);

				int result = i + j;
				System.out.println(i + " " + " + " + j + " = " + result);

			} catch (Exception e) {
				System.out.println("Enter integers only.");
			}
		}

	}
}

// Java Program to check even or odd Number
class evenOdd {
	public static void main(String[] args) {
		for (;;) {

			try {

				System.out.println("Enter: ");
				Scanner sc = new Scanner(System.in);
				int i = sc.nextInt();

				if (i % 2 == 0)
					System.out.println(i + " is Even Number.");
				else
					System.out.println(i + " is Odd Number.");
			} catch (Exception e) {
				System.out.println("Enter integers Only.");
			}
		}
	}
}

// Java Program to find the prime numbers
class primeNumber {
	public static void main(String[] args) {
		for (;;) {
			System.out.println("Enter: ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			boolean isPrime = true;
			
			for (int i = 2; i <= a; i++) {
				
				for (int j = i - 1; j >= 2; j--) {
					if (i % j == 0) {
						isPrime = false;
					}
				}
				if (isPrime)
					System.out.println(a + " is prime.");
			}
		}
	}
}
