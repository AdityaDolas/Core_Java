package com.aditya.java;


// If we do not give body to the method inside abstract class it will give compilation error.
// To you want to remove the error you have to add abstract keyword to the method.
abstract class dog123{
	abstract void run();
}

public class abstract1 extends dog123 {
	void run() {
		System.out.println("Running safly");
	}
	public static void main(String[] args) {
		dog123 d = new abstract1();
		d.run();
	}
}
