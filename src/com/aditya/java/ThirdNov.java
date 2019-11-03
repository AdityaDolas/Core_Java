package com.aditya.java;

abstract class a1 {
	abstract void displaya1();
}

abstract class a2{
	public a2() {
		System.out.println("Abstract class constructor");
	}
	
	
	public void display2(){
		// why this is not printing
		System.out.println("Abstraction2");
	}
}

interface i1{
	public void displayi1();
}

public class ThirdNov extends a1 implements i1 {
	public void displaya1() {
		System.out.println("Abstraction");
	}
	public void display2() {
		System.out.println("Abstraction3");
	}
	
	public static void main(String[] args) {
		ThirdNov tn = new ThirdNov();
		a2 a = new a2() {
			// What to write here
			// System.out.println("hi");
		};
		tn.displaya1();
		tn.display2();
	}
}
