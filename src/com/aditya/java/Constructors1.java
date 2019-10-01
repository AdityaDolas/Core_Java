package com.aditya.java;

public class Constructors1 {
	public Constructors1() {
		System.out.println("Default Constructor");
		
	}
	
	public Constructors1(int m) {
		System.out.println("Parameterized Constructor");
		
	}
	
	public static void main(String_Demo[] args) {
		Constructors1 c1=new Constructors1();
		Constructors1 c2=new Constructors1(8);
	}
}
