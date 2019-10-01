package com.aditya.java;

public class Except1 {
	public static void main(String_Demo[] args) {
		try {
			int a[] = new int[2];
			System.out.println("Access element three : " + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown : " + e);
		}
		System.out.println("Out of block");
	}
}
