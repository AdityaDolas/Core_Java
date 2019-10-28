package com.aditya.java;

interface access {
	void display();
}

interface fans{
	void usha();
	void orient();
}

class Interface100 implements access, fans {
	public void display() {
		System.out.println("example of interface");
	}
	
	public void usha() {
		System.out.println("usha fans are most populer fan Brand");
	}
	public void orient() {
		System.out.println("Orient brand is considered as one of the most trustable Brand");
	}

	public static void main(String[] args) {
		Interface100 a = new Interface100();
		a.display();
		a.usha();
		a.orient();
	}
}
