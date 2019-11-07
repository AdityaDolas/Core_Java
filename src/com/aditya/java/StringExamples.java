package com.aditya.java;

import java.util.ArrayList;
import java.util.Scanner;

// Array char to String

public class StringExamples {
	public static void main(String[] args) {
		char[] cs = { 'A', 'D', 'I', 'T', 'Y', 'A' };
		String b = "";
		for (char c : cs) {
			System.out.println(c);
		}
	}
}

// Array char to String using scanner
class StringExamples1 {
	public static void main(String[] args) {
		// Taking input
		System.out.println("Enter: ");
		Scanner sc = new Scanner(System.in);
		String g = sc.next();

		// Converting String to array
		char[] cArray = g.toCharArray();
		String b = "";

		// iterating the character
		for (char c : cArray) {
			System.out.println(c);
		}

	}
}

// Reverse String
class reverseString {
	public static void main(String[] args) {
		
		String a = "Niit";
		char[] b = a.toCharArray();

		a = "";
		for (int i = b.length - 1; i >= 0; i--) {
			a = a + b[i];
		}
		System.out.println(a);
	}
}

// Reverse String Scanner
class reverseStringScanner {
	public static void main(String[] args) {
		// Taking input
		System.out.println("Enter: ");
		Scanner sc = new Scanner(System.in);
		String g = sc.next();
		
		// Converting String to Character array
		char[] b = g.toCharArray();
		g = "";
		
		// iterating the array
		for (int i = b.length - 1; i >= 0; i--) {
			g = g + b[i];
		}
		System.out.println(g);

	}
}

// Codes Technology = ygolonhceT sedoC
class reverseStringandchar{
	public static void main(String[] args) {
		String a = "aditya dolas";
		System.out.println(a+" = ");
		String[] b = a.split("");
		a="";
		
		for(int i = b.length-1; i>=0 ; i--) {
			a =  a + b[i];
		}
		System.out.println(a);
	}
}

// reverseStringandchar Scanner
class reverseStringandcharScanner{
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String[] b = a.split("");
		a="";
		
		for(int i = b.length-1; i>=0; i--) {
			a = a + b[i];
		}
		System.out.println(a);
	}
}

// Codes Technology = sedoC ygolonhceT 
class String5{
	public static void main(String[] args) {
		System.out.println("Enter: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(s+" = ");
		String[] sa = s.split(" ");
		
		s = "";
		
		for(int i = 0 ;i<sa.length; i++) {
			String[] temp = sa[i].split("");
			for(int j = temp.length-1; j>=0; j--) {
				s=s+temp[j];
			}
			s=s+"";
		}
		
		System.out.println(s);
	}
}








// ------------------------------------------------------------