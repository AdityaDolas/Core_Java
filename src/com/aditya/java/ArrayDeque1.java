package com.aditya.java;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDeque1 {
	public static void main(String[] args) {
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		for(;;) {
			System.out.println("Enter:");
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			ad.add(i);
			System.out.println(ad);
		}
	}
}
