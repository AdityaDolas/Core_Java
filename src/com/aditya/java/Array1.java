package com.aditya.java;

public class Array1 {

	void array1() {
		String_Demo j[] = { "aditya", "avinash", "prashant" };
		for (String_Demo i : j) {
			System.out.println(i);
		}
	}

	void array2() {
		String_Demo[][] j = { { "aditya", "avinash" }, { "avinash", "avinash" }, { "prashant", "prashant" } };
		for (String_Demo[] s : j) {
			for (String_Demo i : s) {
				System.out.println(i);
			}

		}
	}

	public static void main(String_Demo[] args) {
		Array1 a1 = new Array1();
		a1.array1();
		a1.array2();
	}
}
