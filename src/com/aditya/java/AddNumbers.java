package com.aditya.java;

import java.util.Scanner;

public class AddNumbers {
	public static void main(String[] args) {
		System.out.println("Enter Two Numbers:");
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		int j=in.nextInt();
		
		System.out.println(i+"+"+j+" = "+(i+j));
		
		
	}
}
