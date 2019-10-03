package com.aditya.java;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		for (;;) {
			System.out.println("Enter:");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			ts.add(i);
			System.out.println(ts);
			Iterator<Integer> it = ts.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
}
