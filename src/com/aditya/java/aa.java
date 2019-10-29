package com.aditya.java;

abstract class display {
	abstract void m();

	void n() {
		System.out.println("abstract method body");
	}
}

interface fan {
	public void usha();
}

public class aa extends display implements fan {
	public aa() {
		System.out.println("aa class constructor");
	}
	
	public aa(int a) {
		a++;
		System.out.println(a);
	}
	
	

	public void m() {
		System.out.println("abstraction");
	}

	public void usha() {
		System.out.println("usha fans interface");
	}

	public static void main(String[] args) {
		aa a = new aa();
		aa a1 = new aa(87);
		a.m();
		a.usha();
		a.n();

	}
}
