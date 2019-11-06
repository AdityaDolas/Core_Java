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

class methodLocalInnerClass {
	void outermlic() {
		final int x = 98;
		System.out.println("inside outer method");

		class innermlic {
			void innerMethod() {
				System.out.println("x = " + x);
			}
		}
		innermlic i = new innermlic();
		i.innerMethod();
	}

	public static void main(String[] args) {
		methodLocalInnerClass m = new methodLocalInnerClass();
		m.outermlic();
	}
}

class DemoAnonymouseClass {
	void show() {
		System.out.println("show method of super class");
	}
}

class Flavor1Demo {
	static DemoAnonymouseClass d = new DemoAnonymouseClass() {
		void show() {
			super.show();
			System.out.println("I am in a Anonymous Class");
		}
	};
	public static void main(String[] args) {
		d.show();
	}
}
