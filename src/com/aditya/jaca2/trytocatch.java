package com.aditya.jaca2;

public class trytocatch {
	public static void main(String[] args) {
		try {
			int a = 29;
			int b = 0;
			int r = a/b;
		} catch (ArithmeticException e) {
			System.out.println("cannot devided by zero.");
		}
	}
}

class prime93{
	public static void main(String[] args) {
		int a=93;
		for(int i=1; i<=93; i++) {
			if(93%i==0){
				System.out.println(i);
			}
		}
	}
}