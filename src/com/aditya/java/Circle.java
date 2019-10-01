package com.aditya.java;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

public class Circle extends Shape{
	void draw() {
		System.out.println("drawing Circle");
		
	}
	public static void main(String_Demo[] args) {
		Shape s=new Circle();
		s.draw();
	}
}
