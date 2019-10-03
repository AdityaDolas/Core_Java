package com.aditya.java;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Deque1 {
	public static void main(String[] args) {
		Deque<Integer> d = new LinkedList<Integer>();
		for (;;) {
			System.out.println("Enter:");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			d.add(i);
			System.out.println(d);
		}

	}
}
