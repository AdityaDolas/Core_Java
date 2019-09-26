package com.aditya.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<>();
		for (;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter:");
			String s = sc.next();
			al.add(s);
			Iterator<String> itr = al.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}

}
