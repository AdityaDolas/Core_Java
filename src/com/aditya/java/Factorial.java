package com.aditya.java;

import java.util.Scanner;
import java.util.TreeSet;

public class Factorial {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>();

		for (;;) {
			System.out.println("Enter Number : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int f = 1;

			for (int i = 1; i <= num; i++) {
				f = f * i;
			}
			System.out.println(f);
			t.add(f);
			System.out.println(t);
		}
	}
}
