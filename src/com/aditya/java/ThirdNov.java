package com.aditya.java;

import org.omg.CORBA.PUBLIC_MEMBER;

abstract class a1 {
	abstract void displaya1();
}

abstract class a2 {
	public a2() {
		System.out.println("Abstract class constructor");
	}

	public void display2() {
		// why this is not printing
		System.out.println("kdjfhgfshfshjksdhfisuhfsiufhseiu");
	}
}

interface i1 {
	// we cannot create the constructor here
	public void displayi1();
}

interface i2 {
	int x = 21;

	void getAge();

	public void displayi2();
}

public class ThirdNov extends a1 implements i1, i2 {
	public ThirdNov() {
		System.out.println("Default Constructor");
	}

	public ThirdNov(int i) {
		System.out.println("Parameterized Constructor");
	}

	public ThirdNov(String s) {
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
			@Override
			public
			void display2(){
				System.out.println("display2");
			}
		};
		
		a.display2();
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

class outer1{
	public void method() {
		System.out.println("outer class");
	}
	class inner1{
		public void inner() {
			System.out.println("inner class");
		}
	}
	public static void main(String[] args) {
		outer1 o = new outer1();
		o.method();
	}
}

class outer2{
	public void method1() {
		System.out.println("Outer Class 1");
	}
	public void inner12(){
		class inner31{
			public void innerinner() {
				System.out.println("Inner Class 123");
			}
		}
	}
	public static void main(String[] args) {
		outer2 o2 = new outer2();
		o2.inner12();
		
		a2 a = new a2() {
			@Override
			public
			void display2(){
				System.out.println("display2");
			}
		};

	}
}

