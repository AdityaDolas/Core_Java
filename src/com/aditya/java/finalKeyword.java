package com.aditya.java;

// The final keyword in java is used for restriction.
// Final keyword can be a variable, method or class.
// If you make any variable final , you cannot change the value of that variable.
// Final keyword stops value to be changed.
// Final keyword stops method overriding.
// Final keyword stops inheritance.


// Following is the example of final variable. 

public class finalKeyword {
	final int speedlimit = 90;	
	void run() {
		// speedlimit = 400;
		System.out.println("reinitializing the fianl keyword will give an compile time error.");
	}
	public static void main(String[] args) {
		finalKeyword k = new finalKeyword();
		k.run();
	}
}
