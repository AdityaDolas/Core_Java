package com.aditya.java;

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
	public static void main(String[] args) {
		constructorsDemo cd = new constructorsDemo();
	}
}
