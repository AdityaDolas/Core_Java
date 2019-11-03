package com.aditya.java;

import java.util.ArrayList;
import java.util.Scanner;

public class codechef {
	public static void main(String[] args) {
		ArrayList<String> weapons = new ArrayList<>(10);

		Scanner sc = new Scanner(System.in);
		Long testCases = sc.nextLong();

		while (testCases > 0) {
			Long miniTestCases = sc.nextLong();
			for (int n = 0; n < miniTestCases; n++) {
				weapons.add(sc.next());

			}
			// for(int j=0; j<2; j++) {
			// System.out.println(weapons.get(0).charAt(0));

			if (weapons.get(0).charAt(0) == 1 || weapons.get(1).charAt(1) == 1) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}

		}

		//System.out.println(weapons);

		testCases--;
	}
}
