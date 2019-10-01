package com.aditya.java;

interface Drawable{
	void draw();
}

class Rectangle2 implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle2 implements Drawable{
	public void draw() {
		System.out.println("drawing circle");
	}
}

public class Interface1 {
	public static void main(String_Demo[] args) {
		Drawable d=new Circle2();
		d.draw();
	}
}
