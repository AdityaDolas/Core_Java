package com.aditya.java;

import java.util.Scanner;

public class IfElse2 {
	public static void main(String[] args) {
		// Initialized the data type
		int marksObtained, passingMarks;
		
		// Declared the variable
		passingMarks = 40;
		
		// Scanner Class For Input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Marks:");
		marksObtained = input.nextInt();
		
		// IFElse
		if (marksObtained >= passingMarks) {
			System.out.println("You Passed the Exam");
		} else {
			System.out.println("You Failed");
		}
	}
}