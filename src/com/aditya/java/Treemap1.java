package com.aditya.java;

import java.util.Scanner;
import java.util.TreeMap;

public class Treemap1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> Ti = new TreeMap<>();
		for (;;) {
			System.out.println("Enter:");
			Scanner sc = new Scanner(System.in);
			Integer i = sc.nextInt();
			String s = sc.next();
			Ti.put(i, s);
			System.out.println(Ti);
		}
	}
}
