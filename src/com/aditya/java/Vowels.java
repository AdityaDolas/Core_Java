package com.aditya.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if (s.contains("a")) {
			System.out.println("a");
		}

		if (s.contains("e")) {
			System.out.println("e");
		}

		if (s.contains("i")) {
			System.out.println("i");
		}

		if (s.contains("o")) {
			System.out.println("o");
		}

		if (s.equals("u")) {
			System.out.println("u");
		}

	}
}

// Second Program
class arr {
	public static void main(String[] args) {
		System.out.println("Enter: ");

		ArrayList<String> as = new ArrayList<>();
		as.add("one");
		as.add("Two");
		as.add("Three");
		as.add("Four");
		as.add("Five");
		as.add("Six");
		as.add("Seven");
		as.add("Eight");
		as.add("Nine");
		as.add("Ten");

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			if (s == i) {
				System.out.println(as.get(i - 1));
			}
		}

	}
}

// Third code
class spliteR {
	public static void main(String[] args) {
		String s = "Rupali Niit";
		String[] as = s.split(" ", 5);

		
		for (String a : as)
			System.out.println(a.lastIndexOf(0));
		
	}
}
