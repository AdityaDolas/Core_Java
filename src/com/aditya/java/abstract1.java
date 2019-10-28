package com.aditya.java;


// If we do not give body to the method inside abstract class it will give compilation error.
// To you want to remove the error you have to add abstract keyword to the method.
abstract class dog{
	abstract void run();
}

public class abstract1 extends dog {
	void run() {
		System.out.println("Running safly");
	}
	public static void main(String[] args) {
		dog d = new abstract1();
		d.run();
	}
}
