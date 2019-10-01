package com.aditya.java;

public class ForLoopStars {
	public static void main(String_Demo[] args) {
		int row, numberOfStars;
		
		for(;;) {
		for (row = 1; row <= 100; row++) {
			for (numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
				System.out.print("*");
			}

			// Go To Next Line
			System.out.println();
		}
		for (row = 0; row <= 100 ; row++) {
			for (numberOfStars = 100 ; numberOfStars >=  row; numberOfStars--) {
				System.out.print("*");
			}

			// Go To Next Line
			System.out.println();
		}
		
		}

	}
}
