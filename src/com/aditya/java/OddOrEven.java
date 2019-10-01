package com.aditya.java;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String_Demo[] args) {
		System.out.println("Enter an Integer:");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();

		if (i % 2 == 0) {
			System.out.println(i+" is Even.");
		} else {
			System.out.println(i+" is Odd");
		}
	}
}
