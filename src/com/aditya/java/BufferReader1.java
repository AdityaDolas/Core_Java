package com.aditya.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReader1 {
	public static void main(String args[]) throws Exception {

		/*
		 * Scanner s = new Scanner(System.in); int i = s.nextInt(); String st =s.next();
		 * System.out.println(i * 2); System.out.println(st);
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		String b=br.readLine();
		System.out.println(a*2);
		System.out.println(b);
	}

}
