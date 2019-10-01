package com.aditya.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
	public static void main(String_Demo[] args) {
		LinkedList<String_Demo> al = new LinkedList<>();
		for (;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter:");
			String_Demo s = sc.next();
			al.add(s);
			Iterator<String_Demo> itr = al.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}

}
