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

class Employee {
	float salary = 40000;
}

class programmer extends Employee {
	int bonus = 10000;

	public static void main(String[] args) {
		programmer p = new programmer();
		System.out.println("Programmer salary is: " + p.salary);
		System.out.println("Programmwe bonus is: " + p.bonus);
	}
}

// Types of inheritance are Single, Multilevel, Hierarchical, Hybride are
// supported Multiple is not supported.

// Single level Inheritance

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}

// Multilevel Inheritance

class Animal1 {
	void eat1() {
		System.out.println("eating....");
	}
}

class Dog1 extends Animal1 {
	void bark1() {
		System.out.println("barking....");
	}
}

class BabyDog extends Dog1 {
	void weep1() {
		System.out.println("weeping....");
	}
}

class Test5 {
	public static void main(String[] args) {
		BabyDog d = new BabyDog();
		d.eat1();
		d.bark1();
		d.weep1();

	}

}

// Hierarchical Inheritance

class Animal2 {
	void eat() {
		System.out.println("eat..");
	}
}

class dog2 extends Animal2 {
	void bark() {
		System.out.println("bark..");
	}
}

class cat extends Animal2 {
	void meow() {
		System.out.println("meowing..");
	}
}

class TestHierarchicalInheritance {
	public static void main(String[] args) {
		cat c = new cat();
		c.meow();
		c.eat();
		// c.bark(); will give compile time error
	}

}

// Why Multiple Inheritance is not supported in java ?

// To reduce the complexity and simplify the language.
// Class C cannot extend class A and B at the same time.

class A {
	void msg() {
		System.out.println("Hello");
	}
}

class B {
	void msg() {
		System.out.println("Welcome");
	}

	// class C extends A,B{//suppose if it were

	public static void main(String args[]) {
		// C obj = new C();
		// obj.msg();// Now which msg() method would be invoked?
	}
}

// Inheritance is an object oriented concept which creates a parent-child
// relationship. It is one of the ways to reuse the code written for parent
// class but it also forms the basis of Polymorphism.

// Encapsulation is an object oriented concept which is used to hide the
// internal details of a class, for example, HashMap encapsulate how it store
// elements and calculate hash values.

// hat Is Abstract Class? A class which has the abstract keyword in its
// declaration is called abstract class. Abstract classes should have at least
// one abstract method. , i.e., methods without a body. It can have multiple
// concrete methods. Abstract classes allow you to create blueprints for
// concrete classes. But the inheriting class should implement the abstract
// method. Abstract classes cannot be instantiated.
