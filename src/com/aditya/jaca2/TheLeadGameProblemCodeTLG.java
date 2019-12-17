package com.aditya.jaca2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class TheLeadGameProblemCodeTLG {
	public static void main(String[] args) {
		ArrayList<Integer> lSumArray = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int lSum = 0, wSum = 0;
		while (t > 0) {
			int w = sc.nextInt();
			int l = sc.nextInt();

			if (w > l) {
				wSum = w - l;
				lSumArray.add(wSum);
			} else if (w < l) {
				lSum = l - w;
				lSumArray.add(lSum);
			}

			if ((w - l) > (l - w)) {
				System.out.println("1");
				System.out.println(lSum);
			} else if ((w - l) < (l - w)) {
				System.out.println("2");
				System.out.println(wSum);
			}
			t--;
		}
		System.out.println(lSumArray.toString());

	}
}
