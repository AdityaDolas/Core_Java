package com.aditya.java;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkingLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ls=new LinkedList<>();
		for(;;) {
			System.out.println("Enter:");
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			ls.add(s);
			System.out.println(ls);
		}
	}
}
