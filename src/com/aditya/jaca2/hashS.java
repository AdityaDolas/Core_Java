package com.aditya.jaca2;

import java.util.HashSet;
import java.util.Scanner;

public class hashS {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		for (;;) {
			System.out.println("Enter:");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			hs.add(i);
			System.out.println(hs);
		}
	}
}
