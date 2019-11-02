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

				/* divide by all the numbers less than i */
				for (int j = i - 1; j >= 2; j--) {

					if (i % j == 0) {
						isPrime = false;
					}
				}
				if (isPrime)
					System.out.println(i + " is a prime number");
				/*
				 * else System.out.println(i + " is not a prime number");
				 */

			}
		}

	}

}
