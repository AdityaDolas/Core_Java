package com.aditya.jaca2;

import java.io.Console;
import java.util.Scanner;

import javax.print.attribute.standard.MediaName;

import com.aditya.java.StaticInner;
import com.aditya.java.student11;

public class java251119 {
	public static void main(String[] args) {
		System.out.println("Java 25/11/19 practice");
	}
}

class areaOfCircle1 {
	public static void main(String[] args) {
		double rad;
		final double PI = 3.14159;
		rad = 100;
		double area = PI * rad * rad;
		System.out.println("Area of circle is = " + area);
	}
}

class compInterest {
	public static void main(String[] args) {
		double a, p, r, n, ci;
		p = 49;
		r = 8;
		n = 33;
		a = p * Math.pow((1 + (r / 100.0)), n);
		ci = a - p;
		System.out.println("Amount = " + a);
		System.out.println("Compound Interest = " + ci);
	}
}

class boolTest {
	public static void main(String[] args) {
		boolean b;
		b = false;
		System.out.println("b is false.");
		b = true;
		System.out.println("b is true.");

		if (b) {
			System.out.println("This is executed.");
		}
	}
}

class constant1 {
	static final int nom = 12;
	static final double Pi = (double) 22 / 7;

	public static void main(String[] args) {
		System.out.println("Number of months:" + nom);
		System.out.println("Pi:" + Pi);

	}
}

class finalVar {
	final static double pi = 3.14159;

	public static void main(String[] args) {
		double r = 10.0, a;
		a = pi * r * r;
		System.out.println("Area of circle: " + a);
	}
}

class varDeclareAtEnd {
	public static void main(String[] args) {
		msg = "Hello Java Developer.";
		System.out.println("Message: " + msg);
	}

	static String msg;
}

class swapWithThirdNo {
	public static void main(String[] args) {
		int a = 10, b = 20, t;
		System.out.println("Before swapping:");
		System.out.println("a=" + a + " " + "b=" + b);
		t = a;
		a = b;
		b = t;
		System.out.println("After swapping:");
		System.out.println("a=" + a + " " + "b=" + b);
	}
}

class swappingWithoutThirdVariable {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("a=" + a + " " + "b=" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a=" + a + " " + "b=" + b);

	}
}

class console1 {
	public static void main(String[] args) {
		Console cn = System.console();
		int n;

		System.out.println("Enter a Number:");
		n = Integer.parseInt(cn.readLine());

		System.out.println("The given number:");
	}
}

class evenOdd19 {
	public static void main(String[] args) {
		System.out.println("Enter: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if (i % 2 == 0)
			System.out.println(i + " is even.");
		else
			System.out.println(i + " is odd");
	}
}

class commision {
	public static void main(String[] args) {
		System.out.println("Enter: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		double comm = 0;

		if (i > 0 && i < 10000) {
			comm = 0;
			System.out.println("Commission::" + comm);
		} else if (i > 10000 && i < 20000) {
			comm = i * 0.05;
			System.out.println("Commission::" + comm);
		} else if (i > 20000 && i < 30000) {
			comm = i * 0.1;
			System.out.println("Commission::" + comm);
		} else {
			System.out.println("Enter an integer.");
		}
	}
}

class day {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Wrong day number.");
		}
	}
}

class eo {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if (i % 2 == 0)
			System.out.println(i + " is even.");
		else
			System.out.println(i + " is odd.");
	}
}

class eoSum {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int sumOfEven = 0, sumOfOdd = 0;
		int i;
		for (i = 0; i <= a; i++) {
			if (i % 2 == 0) {
				sumOfEven = sumOfEven + i;
			} else {
				sumOfOdd = sumOfOdd + i;
			}
		}
		System.out.println("Sum Of Even Number:" + sumOfEven);
		System.out.println("Sum Of Odd Number:" + sumOfOdd);

	}
}

class factorial {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j;
		int f = 1;
		for (j = i; j >= 1; j--) {
			f = f * j;
		}
		System.out.println("the factorial of " + i + " is " + f + ".");
	}
}

class fibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i, a = 0, b = 1, c = 0;
		System.out.print(a + " " + b);

		for (i = 1; i <= (n - 2); i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}
}

class LucasTest {
	public static void main(String[] args) {
		int n, i, a = 1, b = 1, c = 1, d;
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		System.out.print(a + " " + b + " " + c);
		for (i = 1; i <= (n - 3); i++) {
			d = a + b + c;
			System.out.print(" " + d);
			a = b;
			b = c;
			c = d;
		}

	}
}

class leftPattern {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class rightPattern {
	public static void main(String[] args) {
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}

class armstrongNumber{
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,x=n,sum=0;
		while(n!=0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==x) {
			System.out.println("Number "+x+" is Armstrong.");
		}
		else {
			System.out.println("Number "+x+" is not Armstrong.");
		}
	}
}

class evenOdd21219{
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		if(i%2==0) {
			System.out.println(i+" is a even number.");
		} else {
			System.out.println(i+" is odd number.");
		}
	}
}

class numberOfDigits{
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int n=0;
		
		while(i!=0) {
			i=i/10;
			n++;
		}
		System.out.println("Number of digits are:"+n);
	}
}

class bbSort{
	public static void main(String[] args) {
		String s="Aditya";
		System.out.println(s);
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb);
	}
}