package com.aditya.java;

// Super keyword is used to refer the immediate parent class object or variable.
// Super keyword can be used to invoke immediate parent class method.
// super() can be used to invoke immediate parent class constructor.

// Following example shows that super is used to refer immediate parent class instance variable.

class animal {
	String color = "White";

}

public class superKeyword extends animal {
	String color = "Black";

	void printColor() {
		System.out.println(color);
		System.out.println(color);
		System.out.println(super.color);
	}
}

class testSuper{
	public static void main(String[] args) {
		superKeyword s = new superKeyword();
		s.printColor();
	}
}
