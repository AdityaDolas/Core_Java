package com.aditya.java;

import java.util.ArrayList;
import java.util.Scanner;

// Array char to String

public class StringExamples {
	public static void main(String[] args) {
		char[] cs = {'A','D','I','T','Y','A'};
		String b = "";
		for(char c: cs) {
			System.out.println(c);
		}
	}
}

// Array char to String using scanner

class StringExamples1{
	public static void main(String[] args) {
		// Taking input
		System.out.println("Enter: ");
		Scanner sc = new Scanner(System.in);
		String g = sc.next();
		
		// Converting String to array
		char [] cArray = g.toCharArray();
		String b = "";
		
		// iterating the character
		for(char c : cArray) {
			System.out.println(c);
		}
		
	}
}
