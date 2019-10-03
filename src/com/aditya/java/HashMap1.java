package com.aditya.java;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		for(;;) {
			System.out.println("Enter:");
			Scanner sc = new Scanner(System.in);
			Integer i=sc.nextInt();
			String s =sc.next();
			hm.put(i, s);
			System.out.println(hm);
		}
	}
}
