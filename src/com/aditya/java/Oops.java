package com.aditya.java;

public class Oops {
	
	// Private method hello
	private void hello() {
		String s = "Hello, World !";
		System.out.println(s);
	}
	
	public void display() {
		// Can't use the following, because variable s is declared in private method
		// System.out.println(s);
	}
	
	// final keyword is applicable to method variable and classes.
	// final keyword cannot be used with an interface in Java.
	// final keyword used with data members means value cannot be replaced or modify.
	// Example :-
	
	public void finalExample() {
		final int i = 45;
		// following line will give compile time error.
		// i = 45;
	}
	
	// Class that is declared as final cannot be used for the purpose of Inheritance.
	// Method declared as final cannot be Overridden.
	
	
	public static void main(String[] args) {
		Oops o = new Oops();
		o.hello();
		o.display();
	}
}
