package com.aditya.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSet_Contacts {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();

		// Asking for input
		for (;;) {
			System.out.println("Enter : ");
			Scanner sc = new Scanner(System.in);
			String s = sc.next();

			// Adding elements using HashSet
			h.add(s);

			// Displaying the HasSet
			System.out.println(h);

			// Iterating over HasSet items
			System.out.println("List:");
			Iterator<String> i = h.iterator();
			while (i.hasNext()) {
				System.out.println(i.next());

			}
		}

	}
}
