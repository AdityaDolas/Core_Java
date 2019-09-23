package com.aditya.java;

import java.util.Scanner;
import java.util.TreeSet;

public class Tree {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<>();
		for (;;) {
			System.out.println("Enter:");
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			t.add(s);
			System.out.println(t);
		}
	}
}
