package com.aditya.java;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int n;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter:");

		while ((n = input.nextInt()) != 0) {
			System.out.println("You entered " + n);
			System.out.println("Input an integer");

		}
		System.out.println("Out of Loop");
	}
}
