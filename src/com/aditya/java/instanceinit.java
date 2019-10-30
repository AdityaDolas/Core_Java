package com.aditya.java;

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
