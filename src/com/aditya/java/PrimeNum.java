package com.aditya.java;

import java.util.Scanner;

public class  PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre");
		int a=sc.nextInt();
		
		
		int i=0;
		for(i=2;i<=a;i++)
		{
			if(a%i==0)
			/*if(a%i==0) */
				break;
			
		}
		if(a==i)
		{
			System.out.println(a+"Prime num");
		}
		else {
			System.out.println(a+"Not a Prime num");
		}

	}

}
