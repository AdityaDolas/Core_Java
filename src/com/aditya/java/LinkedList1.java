package com.aditya.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();
		for(;;) {
			System.out.println("Enter:");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			li.add(i);
			System.out.println(li);
			Iterator<Integer> it = li.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
}
