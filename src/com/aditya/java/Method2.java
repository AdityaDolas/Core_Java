package com.aditya.java;

import java.util.Scanner;

public class Method2 {
	void swap(int num1, int num2) {
		System.out.println("Before"+num1+"&"+num2);
		
		int temp;
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After"+num1+"&"+num2);
	}
	public static void main(String_Demo[] args) {
		int n,m;
		
		System.out.println("Enter the value of m");
		Scanner scanner=new Scanner(System.in);
		
		m=scanner.nextInt();
		System.out.println("Enter the value of m");
		
		n=scanner.nextInt();
		
		Method2 mt=new Method2();
		mt.swap(m, n);
		
	}
}
