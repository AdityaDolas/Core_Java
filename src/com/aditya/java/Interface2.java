package com.aditya.java;

interface smartphaes {
	void Oneplus();

	void Samsung();

	void MI();

	void Oppo();
}


// If we implement an interface we should add all the methods from an interface or it will give compile-time error.

public class Interface2 implements smartphaes {
	public void Oneplus() {
		System.out.println("Onepluse is the best budget smartphone.");
	}

	public void Samsung() {
		System.out.println("Samsung smartphones has one of the best displays in the market.");
	}

	public void MI() {
		System.out.println("MI is the best selling smartphone in india.");
	}

	public void Oppo() {
		System.out.println("Oppo also have some of the best smartphones.");
	}
}
