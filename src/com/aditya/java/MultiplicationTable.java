package com.aditya.java;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String_Demo[] args) {
		int n, c;

		System.out.println("Enter an integer to print it's multiplication table:");

		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		System.out.println("Table of " + n+" :");

		for (c = 1; c <= 10; c++) {
			System.out.println(n + "*" + c + " = " + (n * c));
		}
	}
}
