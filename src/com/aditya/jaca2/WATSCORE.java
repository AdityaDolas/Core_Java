package com.aditya.jaca2;

import java.util.Scanner;

public class WATSCORE {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t > 0) {

			int problems = sc.nextInt();
			int problemIndex = 0, problemScore = 0;
			int maxScore[] = new int[8];

			for (int i = 0; i < problems; i++) {

				problemIndex = sc.nextInt();
				problemScore = sc.nextInt();

				if (problemIndex <= 8 && problemScore > maxScore[problemIndex - 1])
					maxScore[problemIndex - 1] = problemScore;
			}

			int r = 0;
			for (int ele : maxScore) {
				r += ele;
			}

			System.out.println(r);

			t--;
		}

	}
}
