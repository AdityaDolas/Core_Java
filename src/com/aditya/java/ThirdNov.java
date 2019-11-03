package com.aditya.java;

import org.omg.CORBA.PUBLIC_MEMBER;

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
	// we cannot create the constructor here
	public void displayi1();
}

interface i2{
	int x = 21;
	void getAge();
	public void displayi2();
}

public class ThirdNov extends a1 implements i1, i2 {
	public  ThirdNov() {
		System.out.println("Default Constructor");
	}
	public  ThirdNov(int i) {
		System.out.println("Parameterized Constructor");
	}
	public  ThirdNov(String s) {
		System.out.println("Parameterized Constructor 2");
	}
	
	public void displaya1() {
		System.out.println("Abstraction");
	}
	public void display2() {
		System.out.println("Abstraction3");
	}
	
	@Override
	public void displayi1() {
		System.out.println("Interface 1");
	}
	
	@Override
	public void displayi2() {
		System.out.println("Interface 2");
	}
	
	public static void main(String[] args) {
		ThirdNov tn = new ThirdNov();
		ThirdNov tn1 = new ThirdNov(24);
		ThirdNov tn2 = new ThirdNov("Aditya");
		i2 i = new i2() {
			
			@Override
			public void getAge() {
				System.out.println("Anonymouse Class 1");
				
			}
			
			@Override
			public void displayi2() {
				System.out.println("Anonymouse Class 2");
				
			}
		};
		i.getAge();
		i.displayi2();
		
		
		a2 a = new a2() {
			// What to write here
			// System.out.println("hi");
		};
		tn.displaya1();
		tn.display2();
		tn.displayi1();
		tn.display2();
		
	}
	@Override
	public void getAge() {
		// TODO Auto-generated method stub
		
	}
}
