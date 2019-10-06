package com.aditya.java;

import java.util.Scanner;
import java.util.TreeSet;

public class HH {
	public static void main(String[] args) {
		TreeSet<Integer> hs = new TreeSet<>();
		for(;;) {
			System.out.println("Enter:");
			Scanner sc=new Scanner(System.in);
			int i = sc.nextInt();
			hs.add(i*2);
			System.out.println(hs);
			
		}
	}
}
