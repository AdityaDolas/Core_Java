package com.aditya.java;

// In java we use this keyword as a reference variable that refers to the current object.
// this can be used to refer current class instance variable.
// this can be used to invoke current class method.
// this() cab be used to invoke current class constructor.
// this can be used as an argument in the method call.
// this can be used as an argument in the constructor call.
// this can be used to return the current class instance from the method.


public class student{
	int rollno;
	String name;
	float fee;
	student(int rollno, String name, float fee){
		// If we don't use this keyword here the output will be default values.
		this.rollno=rollno;
		this.name= name;
		this.fee= fee;
	}
	void display() {
		System.out.println(name+" "+rollno+" "+fee);
	}
	public static void main(String[] args) {
		student s1 = new student(1, "Amit", 500);
		student s2 = new student(2, "Sumit", 500);
		s1.display();
		s2.display();
	}
}

// In the following example we are going to use this keyword to invoke current class instance

class a{
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		// m(); is same as this.m()
		this.m();
		
	}
	public static void main(String[] args) {
		a a1 = new a();
		a1.n();
	}
}