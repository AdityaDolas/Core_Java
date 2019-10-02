package com.aditya.java;

import java.util.HashSet;
import java.util.Scanner;

public class HashHashish {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		for(;;) {
			System.out.println("Enter:");
			Scanner sc=new Scanner(System.in);
			int s=sc.nextInt();
			hs.add(s*2);
			System.out.println(hs);
		}
	}
}
