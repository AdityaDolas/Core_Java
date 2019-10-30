package com.aditya.java;

// Super keyword is used to refer the immediate parent class object or variable.
// Super keyword can be used to invoke immediate parent class method.
// super() can be used to invoke immediate parent class constructor.

// Following example shows that super is used to refer immediate parent class instance variable:-

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

class testSuper {
	public static void main(String[] args) {
		superKeyword s = new superKeyword();
		s.printColor();
	}
}

// Following example shows that super can be used to invoke parent class
// method:-

class animal1 {
	void eat() {
		System.out.println("eating...");
	}
}

class dog1 extends animal1 {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		eat();
		super.eat();
		bark();
	}
}

class Test2 {
	public static void main(String[] args) {
		dog1 d = new dog1();
		d.work();
	}
}
