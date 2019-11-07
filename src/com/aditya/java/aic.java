package com.aditya.java;

interface ifc{
	public void fan1();
}

abstract class afc{
	public void fan2() {
		System.out.println("abstract fan");
	}
}

public class aic extends afc implements ifc {
	public aic() {
		System.out.println("constructor");
	}
	
	@Override
	public void fan1() {
		System.out.println("interface fans");
		
	}
	
	public static void main(String[] args) {
		aic a = new aic();
		a.fan1();
		a.fan2();
	}
}

// -------------------------------------------------

interface icone{
	public void displayic();
}

abstract class acone{
	public abstract void displaayone();
}

class abstractinterfaceDemo{
	
}




































































































// -----------------------------------------------





