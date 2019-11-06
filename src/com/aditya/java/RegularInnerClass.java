package com.aditya.java;

public class RegularInnerClass {
	String username;
	String password;

	public class innerc {
		public void innerm() {
			System.out.println("inner class");
			System.out.println(username);
			System.out.println(password);

		}
	}

	public static void main(String[] args) {
		RegularInnerClass r = new RegularInnerClass();
		RegularInnerClass.innerc i = r.new innerc();
		i.innerm();
	}
}

class staticInnerClass {
	private static void outer() {
		System.out.println("inside outer method");
	}

	static class innersc {
		private static void innerc2() {
			System.out.println("inner static class 1");
		}

		public static void innerc3() {
			System.out.println("inner static class 2");
		}
	}

	public static void main(String[] args) {
		System.out.println("statement inside main method");
		outer();
		// innerc2();
	}
}