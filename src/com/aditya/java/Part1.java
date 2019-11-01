package com.aditya.java;

// What is Inheritance in Java?
// Inheritance in java is a mechanism in which one object acquires the properties and behavior of
// of a parent object. we can do that by using extend or implements keyword.
// Inheritance represents the Is-A relationship.
// we use inheritance in java for method overriding (so that runtime polymorphism can be achieved)


public class Part1 {
	public void display() {
		System.out.println("Part 1 question bank");
	}
}

class Employee{
	float salary = 40000;
}
class programmer extends Employee{
	int bonus = 10000;
	public static void main(String[] args) {
		programmer p = new programmer();
		System.out.println("Programmer salary is: "+p.salary);
		System.out.println("Programmwe bonus is: "+p.bonus);
	}
}
