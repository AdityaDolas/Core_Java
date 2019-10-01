package com.aditya.java;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String_Demo[] args) {
		// Initialized the data types
		int marksObtained, passingMarks;
		char Grade = 0;

		passingMarks = 40;

		Scanner inpute = new Scanner(System.in);

		System.out.println("Enter Marks:");

		marksObtained = inpute.nextInt();

		if (marksObtained >= passingMarks) {
			if (marksObtained > 90) 
				System.out.println(Grade + "A");
			else if (marksObtained > 75) 
				Grade = 'B';
			 else if (marksObtained > 60) 
				Grade = 'C';
			 else 
				Grade = 'D';
				System.out.println("You passed the exam and your grade is " + Grade);
			
		} else {
			Grade = 'F';
			System.out.println("You Failed the exam and your grade is " + Grade);

		}
	}
}
