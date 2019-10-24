package com.aditya.java;

public class Oops {
	private void hello() {
		String s = "Hello, World !";
		System.out.println(s);
	}
	
	public void display() {
		// Can't use the following, because variable s is declared in private method
		// System.out.println(s);
	}
	public static void main(String[] args) {
		Oops o = new Oops();
		o.hello();
		o.display();
	}
}
