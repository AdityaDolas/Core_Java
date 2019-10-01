package com.aditya.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSet_Contacts {
	public static void main(String_Demo[] args) {
		HashSet<String_Demo> h = new HashSet<>();

		// Asking for input
		for (;;) {
			System.out.println("Enter : ");
			Scanner sc = new Scanner(System.in);
			String_Demo s = sc.next();

			// Adding elements using HashSet
			h.add(s);

			// Displaying the HasSet
			System.out.println(h);

			// Iterating over HasSet items
			System.out.println("List:");
			Iterator<String_Demo> i = h.iterator();
			while (i.hasNext()) {
				System.out.println(i.next());

			}
		}

	}
}
