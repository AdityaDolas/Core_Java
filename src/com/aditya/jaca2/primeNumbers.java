package com.aditya.jaca2;

import java.util.Scanner;

public class primeNumbers {
	public static void main(String[] args) {
		for (;;) {
			System.out.println("Enter: ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int flag = 0;

			int m = n / 2;

			if (n == 0 || n == 1) {
				System.out.println(n + " is not a prime number.");
			} else {
				for (int i = 2; i <= m; i++) {
					if (n % i == 0) {
						System.out.println(n + " is not a prime number.");
						flag = 1;
						System.out.println(flag);
						break;
					}
				}
				if (flag == 0) {
					System.out.println(n + " is a prime number.");
				}
			}

		}
	}

}
