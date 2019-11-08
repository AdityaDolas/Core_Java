package com.aditya.java;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		for (;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter: ");
			int z = sc.nextInt();

			for (int i = 2; i <= z; i++) {
				boolean isPrime = true;
				for (int j = i - 1; j >= 2; j--) {

					if (i % j == 0) {
						isPrime = false;
					}
				}
				if (isPrime)
					System.out.println(i + " is a prime number");
			}
		}

	}

}

class evenOdd {
	public static void main(String[] args) {
		for (;;) {
			System.out.println("Enter:");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			if (i % 2 == 0) {
				System.out.println(i + " is a Even number.");
			} else {
				System.out.println(i + " is a odd number");
			}
		}

	}
}

class primeOrNot {
	public static void main(String[] args) {
		for (;;) {
			System.out.println("Enter: ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int i = 0;
			for (i = 2; i <= a; i++) {
				if (a % i == 0)
					break;

			}
			if (a == i) {
				System.out.println(a + " is a prime number.");
			} else {
				System.out.println(a + " is not a prime number.");
			}

		}

	}
}

// ----------------------------