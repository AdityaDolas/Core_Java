package com.aditya.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMethods {
	public static void main(String_Demo[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the desired pattern : ");
		String_Demo pattern = in.next();
		System.out.println("Enter the text : ");
		String_Demo matcher = in.nextLine();
		Pattern myPattern2 = Pattern.compile(pattern);
		Matcher myMatcher2 = myPattern2.matcher(matcher);
		Boolean myBoolean2 = myMatcher2.matches();

		boolean b = myBoolean2;
		if (b == true) {
			System.out.println("I found the text:" + myMatcher2.group() + "\n" + "Starting at:" + myMatcher2.start()
					+ "\n" + "Ending at index:" + myMatcher2.end());

		} else if (b == false) {
			System.out.println("No match found.");
		}
	}
}
