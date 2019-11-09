package com.aditya.jaca2;

import java.util.Scanner;

public class LogicalExamples {
	public static void main(String[] args) {
		System.out.println("Java interview examples.");
	}
}

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
