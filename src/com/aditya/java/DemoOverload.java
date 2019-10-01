package com.aditya.java;

class Demo {
	public int add(int x, int y) {
		return x + y;
	}

	public int add(int x, int y, int z) {
		return x + y + z;
	}

	public int add(double a, int y) {
		return (int) a + y;
	}

	public int add(int a, double x) {
		return a + (int) x;

	}
}

public class DemoOverload{
	public static void main(String[] args) {
		Demo d=new Demo();
		
		System.out.println(d.add(2, 3));
		System.out.println(d.add(2, 3, 5));
		System.out.println(d.add(2, 3.4));
		System.out.println(d.add(2.5, 5));
		
	}
}
