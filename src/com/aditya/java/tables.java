package com.aditya.java;

public class tables {
	public static void main(String[] args) {
		for (int i = 1; i <= 10;) {
			for (int k = 1; k <= 10; k++) {
				System.out.print(k+"*" + i + "=" + (i * k)+"\t");
			} 
			System.out.println();
			i++;
		}
	}
}
