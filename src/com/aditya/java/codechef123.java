package com.aditya.java;

import java.util.ArrayList;
import java.util.Scanner;

/*public class codechef {
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

			if (weapons.get(0).charAt(0) == 1 || weapons.get(1).charAt(0) == 1) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}

		}

		// System.out.println(weapons);

		testCases--;
	}
}
*/
public class codechef123 {
	public static void main(String[] args) {
		ArrayList<String> weapons = new ArrayList<>();

		// First input
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				String xor = "";
				for (int j = 0; j < 10; j++) {
					if (weapons.get(i).charAt(j) == weapons.get(i + 1).charAt(j)) {
						xor += '0';

					} else {
						xor += '1';
					}
				}
				weapons.set(i+1, xor);
			}
			int result =0 ;
			for (int i=0;i<10;i++) {
				if (weapons.get(n-1).charAt(i)=='1') {
					result++;
				}
			}
			
		}
	}
}