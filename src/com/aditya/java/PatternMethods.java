package com.aditya.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMethods {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Desired Pattern");
		String pattern = input.next();
		System.out.println("Enter the Text:");
		String matcher = input.next();
		Pattern mypattern2 = Pattern.compile(pattern);
		Matcher myMatcher2 = mypattern2.matcher(matcher);
		Boolean myBoolean2 = myMatcher2.matches();
		boolean b = myBoolean2;
		if (b == true) {
			System.out.println("I found the text:" + myMatcher2.group() + "\n" + "Starting at:" + myMatcher2.start()
					+ "\n" + "Ending at Index:" + myMatcher2.end());
			

		}else {
			System.out.println("No match found");
		}

	}
}
