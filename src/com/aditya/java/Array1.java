package com.aditya.java;

public class Array1 {

	void array1() {
		String j[] = { "aditya", "avinash", "prashant" };
		for (String i : j) {
			System.out.println(i);
		}
	}

	void array2() {
		String[][] j = { { "aditya", "avinash" }, { "avinash", "avinash" }, { "prashant", "prashant" } };
		for (String[] s : j) {
			for (String i : s) {
				System.out.println(i);
			}

		}
	}

	public static void main(String[] args) {
		Array1 a1 = new Array1();
		a1.array1();
		a1.array2();
	}
}
