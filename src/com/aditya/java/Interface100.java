package com.aditya.java;

interface access {
	void display();
}

class Interface100 implements access {
	public void display() {
		System.out.println("example of interface");
	}

	public static void main(String[] args) {
		Interface100 a = new Interface100();
		a.display();
	}
}
