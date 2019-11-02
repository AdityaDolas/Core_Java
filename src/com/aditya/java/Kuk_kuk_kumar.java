package com.aditya.java;

import java.util.Scanner;

public class Kuk_kuk_kumar {
	public String kumar(int rent, int bhk, int depo) {
		if (rent > 10000 && bhk > 1 && depo > 100000 && bhk < 10) {
			return "10 flats are available.";
			//System.out.println("asdf");
		} else {
			return "You are one cheap motherfucker.";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rent: ");
		int rent = sc.nextInt();
		System.out.println("Enter Bhk: ");
		int BHK = sc.nextInt();
		System.out.println("Enter Deposit: ");
		int Deposite = sc.nextInt();
		Kuk_kuk_kumar k = new Kuk_kuk_kumar();
		System.out.println(k.kumar(rent, BHK, Deposite));
	}
}
