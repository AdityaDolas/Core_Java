package com.aditya.jaca2;

import java.util.Scanner;

public class trytocatch {
	public static void main(String[] args) {
		try {
			int a = 29;
			int b = 0;
			int r = a / b;
		} catch (ArithmeticException e) {
			System.out.println("cannot devided by zero.");
		}
	}
}

class prime93 {
	public static void main(String[] args) {
		int a = 93;
		for (int i = 1; i <= 93; i++) {
			if (93 % i == 0) {
				System.out.println(i);
			}
		}
	}
}

class firstFiveNumbers {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String primeN = "";
		for (int i = 1; i <= a; i++) {
			int counter = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeN = primeN + i + " ";
			}
		}
		System.out.println("Prime Numbers are:");
		System.out.println(primeN);
	}
}

class javatprime {
	public static void main(String[] args) {
		int ct = 0, n = 0, i = 0, j = 1;
		while (n < 10) {
			j = 1;
			ct = 0;
			while (j <= 1) {
				if (i % j == 0)
					ct++;
				j++;

			}
			if (ct == 2) {
				System.out.println(i);
				n++;
			}
			i++;
		}
	}
}