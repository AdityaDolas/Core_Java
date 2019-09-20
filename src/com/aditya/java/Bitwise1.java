package com.aditya.java;

import java.util.Scanner;

public class Bitwise1 {
	void bit() {
		System.out.println("Enter Value:");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int j = scanner.nextInt();

		int k = i >> j;
		System.out.println("Betwise:" + k);

	}
	public static void main(String[] args) {
		Bitwise1 b=new Bitwise1();
		b.bit();
	}
}
