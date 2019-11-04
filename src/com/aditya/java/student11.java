package com.aditya.java;

// In java we use this keyword as a reference variable that refers to the current object.
// this can be used to refer current class instance variable.
// this can be used to invoke current class method.
// this() cab be used to invoke current class constructor.
// this can be used as an argument in the method call.
// this can be used as an argument in the constructor call.
// this can be used to return the current class instance from the method.


public class student11{
	int rollno;
	String name;
	float fee;
	student11(int rollno, String name, float fee){
		// If we don't use this keyword here the output will be default values.
		this.rollno=rollno;
		this.name= name;
		this.fee= fee;
	}
	void display11() {
		System.out.println(name+" "+rollno+" "+fee);
	}
	public static void main(String[] args) {
		student11 s1 = new student11(1, "Amit", 500);
		student11 s2 = new student11(2, "Sumit", 500);
		s1.display11();
		s2.display11();
	}
}

// In the following example we use this keyword to invoke current class instance.

class a11{
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		// m(); is same as this.m()
		this.m();
		
	}
	public static void main(String[] args) {
		a11 a1 = new a11();
		a1.n();
	}
}

// In the following example we use this keyword to invoke current class constructor.

class b11{
	b11(){
		System.out.println("hello b");
	}
	b11(int x){
		this();
		System.out.println(x);
	}
	public static void main(String[] args) {
		b11 b1 = new b11(10);
		
	}
}












