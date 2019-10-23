package com.aditya.java;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTable1 {
	public void display() {
		Hashtable<Integer, String> ht = new Hashtable<>();
		for (;;) {
			System.out.println("Enter:");
			Scanner sc = new Scanner(System.in);
			Integer i = sc.nextInt();
			String s = sc.next();
			ht.put(i, s);
			System.out.println(ht);
		}
	}
	public static void main(String[] args) {
		HashTable1 ht = new HashTable1();
		ht.display();
	}
}
