package com.aditya.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Tree {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		HashSet<Integer> h = new HashSet<>();
		for (;;) {
			System.out.println("Enter:");
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			t.add(s);
			h.add(t+2);
			System.out.println(t);
		}
	}
}
