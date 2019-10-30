package com.aditya.java;

// Super keyword is used to refer the immediate parent class object or variable.
// Super keyword can be used to invoke immediate parent class method.
// super() can be used to invoke immediate parent class constructor.

// Following example shows that super is used to refer immediate parent class instance variable:-

class animal {
	String color = "White";

}

public class superKeyword extends animal {
	String color = "Black";

	void printColor() {
		System.out.println(color);
		System.out.println(color);
		System.out.println(super.color);
	}
}

class testSuper {
	public static void main(String[] args) {
		superKeyword s = new superKeyword();
		s.printColor();
	}
}

// Following example shows that super can be used to invoke parent class
// method:-

class animal1 {
	void eat() {
		System.out.println("eating...");
	}
}

class dog1 extends animal1 {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		eat();
		super.eat();
		bark();
	}
}

class Test2 {
	public static void main(String[] args) {
		dog1 d = new dog1();
		d.work();
	}
}

// Following example shows that super is used to invoke parent class constructor.

class animal3{
	public animal3() {
		System.out.println("animal is created...");
	}
}

class dog3 extends animal3{
	dog3(){
		super();
		System.out.println("dog is created...");
	}
}

class Test3{
	public static void main(String[] args) {
		dog3 d3 = new dog3();
		
	}
}

// super() is added in each class constructor automatically by the compiler if there is no super or this.

// Following example shows that super() is provided by the compiler implicitly.

class animal4{
	public animal4() {
		// animal4() created automatically
		// super()  created automatically
		System.out.println("amimal4 is created...");
	}
}

class dog4 extends animal4{
	public dog4() {
		System.out.println("dog4 is created...");
	}
}

class Test4{
	public static void main(String[] args) {
		dog4 d4 = new dog4();
		
	}
}



















