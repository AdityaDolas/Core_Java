package com.aditya.java;

public class tables {
	public static void main(String[] args) {
		for (int i = 2; i <= 10;) {
			for (int k = 1; k <= 10; k++) {
				System.out.println(i+"*" + k + " = " + (i * k));
				System.out.print("\n");
			}
			i++;
		}
		 
	}
}
