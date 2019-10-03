package com.aditya.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> ai = new ArrayList<>();
		for(;;) {
			System.out.println("Enter:");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			ai.add(i);
			System.out.println(ai);
		}
	}
}
