package com.aditya.java;

class Outer {
	// Simple nested inner class
	class Inner {
		public void show() {
			System.out.println("In a nested class method");
			System.out.println("Outer");
		}
	}

	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.show();
	}
}