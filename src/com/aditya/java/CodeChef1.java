package com.aditya.java;

import java.util.Scanner;
import java.util.TreeSet;

public class CodeChef1 {
	public static void main(String[] args) {
		int i,n=0;
		TreeSet<Integer> ts=new TreeSet<>();
		System.out.println("Enter:");
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		int a=sc.nextInt();
		
		for (int j = 0; j < a; j++) {
			int w=sc.nextInt();
			ts.add(w);
		}
		
		System.out.println(ts);
		System.out.println("Lowest===>"+ts.first());
		System.out.println("Highest===>"+ts.last());
		
		/*for (int m : ts) {
		        System.out.println(m);
		}*/
		
		
	}
}
