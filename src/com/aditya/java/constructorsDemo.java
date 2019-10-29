package com.aditya.java;

import java.awt.DisplayMode;

// Constructor is the block of code similar as method.
// Constructor is called when an instance of class is created.
// Creating an instance of an class is same as creating an object.
// When you call a Constructor, memory for an object is allocated.
// It is a special type of method witch is used to initialize the object.
// When an object is created using the new keyword, at least one constructor is called.
// If there is no Constructor available in the class java compiler provides a default constructor by default.
// Constructor name should be same as the class name.
// Constructor must not have any explicit return type.
// Constructor cannot be abstract, final, static and synchronized.
// There are two types of Constructors, Default i.e. no-arg Constructor and Parameterized Constructor.

// Example of Default Constructor
public class constructorsDemo {
	constructorsDemo() {
		System.out.println("Bike is created.");
	}

	// Inner Class
	class sd2 {
		int id;
		String name;

		void displey() {
			System.out.println(id);
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		constructorsDemo cd = new constructorsDemo();
		constructorsDemo.sd2 cs = cd.new sd2();
		cs.displey();

	}
}


// This is an example of abstract method.
abstract class ab {
	abstract void display();
}

	class display1 extends ab{
	void display() {
		System.out.println("This is the abstract method.");
	}
	public static void main(String[] args) {
		display1 d = new display1();
		d.display();
	}
}











