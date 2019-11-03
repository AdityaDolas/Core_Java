package com.aditya.java;

interface fanInterface{
	public void usha();
}

abstract class fanAbstract{
	abstract void orient();
}
public class aic2 extends fanAbstract implements fanInterface {
	public aic2() {
		System.out.println("constructor");
	}
	public void usha() {

		System.out.println("usha fans");
	}
	public void orient() {
		System.out.println("orient fans");
	}
	public static void main(String[] args) {
		aic2 a = new aic2();
		a.orient();
		a.usha();
	}
}
