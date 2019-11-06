package com.aditya.java;

abstract class ac{
	ac(){
		System.out.println("Default abstract constructor");
	}
	public abstract void acm();
}

interface ic{
	public void icm();
}

interface aci{
	public void acim();
}

public class abstractionConstructor extends ac implements ic, aci{
	public abstractionConstructor() {
		System.out.println("Default Constructor");
	}
	
	@Override
	public void icm() {
		System.out.println("interface");
	}
	
	@Override
	public void acm() {
		System.out.println("abstract");
	}
	
	aci a = new aci() {
		
		@Override
		public void acim() {
			System.out.println("anonymous class");
			
		}
	};
	
	

	public static void main(String[] args) {
		abstractionConstructor ac = new abstractionConstructor();
		ac.icm();
		ac.acm();
	}

	@Override
	public void acim() {
		System.out.println("anonymouse class 2");
		
	}
	
}
