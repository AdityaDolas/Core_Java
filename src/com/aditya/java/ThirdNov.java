package com.aditya.java;

abstract class a1 {
	abstract void displaya1();
}

public class ThirdNov extends a1 {
	public void displaya1() {
		System.out.println("Abstraction");
	}
	public static void main(String[] args) {
		ThirdNov tn = new ThirdNov();
		tn.displaya1();
	}
}
