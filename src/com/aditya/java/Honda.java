package com.aditya.java;

abstract class Bike {
	abstract void run();
}

class Honda extends Bike{
	void run() {
		System.out.println("Running");
			
	}
	public static void main(String_Demo[] args) {
		Bike obj=new Honda();
		obj.run();
	}
}
