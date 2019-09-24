package com.aditya.java;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i;
		int f = 1;

		for (i = 1; i <=num; i++) {
			f = f * i;

		}
		System.out.println(f);

	}
}