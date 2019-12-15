package com.aditya.jaca2;

import java.util.Scanner;

// https://www.codechef.com/problems/HS08TEST
class Atm {
	public static void main(String[] args) {
		// Taking two inputs
		Scanner sc = new Scanner(System.in);

		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();

		// Applying first condition
		if (n1 % 5 == 0) {

			// Applying second condition
			if ((n1 + 0.5) < n2) {
				System.out.println(n2 - (n1 + 0.5));

			}

			// If both conditions fail
		} else {

			System.out.println(n2);

		}
	}
}