package com.aditya.java;

public class ArrayIndexOutOfBoundExcep {
	public static void main(String_Demo args[]) {
		try {
			int a[] = new int[5];
			a[6] = 9;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out Of Bounds");
		}
	}
}
