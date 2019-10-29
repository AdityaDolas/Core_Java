package com.aditya.java;

public class sf {
	static int a = 10;
	final int b = 10;
	int c = 20;

	public class sfm {
		void increment() {
			a++;
			// Following line will give an error because final variable cannot be changed.
			// b++;
			c++;
			System.out.println(a);
			// System.out.println(b);
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		sf s = new sf();
		sf.sfm sf = s.new sfm();
		sf.increment();
	}
}
