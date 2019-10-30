package com.aditya.java;

// Instance initializer block is used to initialize the instance data members.
// It runs each time when object of a class is created.
// We use instance initializer block to perform some operations while assigning value to instance data member.
// Example a for loop to fill a complex array or error handling etc.

// Following code is the example of instance initializer block.

public class instanceinit {
	int speed;

	public instanceinit() {
		System.out.println("speed is " + speed);
	}
	
	// instance initializer block.
	{
		speed = 100;
	}
	public static void main(String[] args) {
		instanceinit i1 = new instanceinit();
		instanceinit i2 = new instanceinit();
	}
}

// Following code is to know what is invoked first, instance initializer block.

class bike8{
	int speed;
	public bike8() {
		System.out.println("constructor is invoked...");
	}
	{
		System.out.println("instance initializer bloked invoked...");
	}
	public static void main(String[] args) {
		bike8 b1 = new bike8();
		bike8 b2 = new bike8();
	}
}