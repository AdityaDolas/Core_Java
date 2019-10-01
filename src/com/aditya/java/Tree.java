package com.aditya.java;

import java.util.Scanner;
import java.util.TreeSet;

public class Tree {
	public static void main(String_Demo[] args) {

		TreeSet<Integer> t = new TreeSet<>();
		TreeSet<Integer> h = new TreeSet<>();
		for (;;) {
			System.out.println("Enter:");
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			t.add(s);
			h.add(s * s);
			System.out.println(t);
			System.out.println(h);
		}
	}
}
