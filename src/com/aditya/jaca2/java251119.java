package com.aditya.jaca2;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

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

class armstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r, x = n, sum = 0;
		while (n != 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}
		if (sum == x) {
			System.out.println("Number " + x + " is Armstrong.");
		} else {
			System.out.println("Number " + x + " is not Armstrong.");
		}
	}
}

class evenOdd21219 {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if (i % 2 == 0) {
			System.out.println(i + " is a even number.");
		} else {
			System.out.println(i + " is odd number.");
		}
	}
}

class numberOfDigits {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int n = 0;

		while (i != 0) {
			i = i / 10;
			n++;
		}
		System.out.println("Number of digits are:" + n);
	}
}

class bbSort {
	public static void main(String[] args) {
		String s = "Aditya";
		System.out.println(s);
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb);
	}
}

class charsort {
	public static void main(String[] args) {
		String s = "Aditya";
		System.out.println(s);
		char[] c = s.toCharArray();
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
	}
}

class splitit {
	public static void main(String[] args) {
		String s = "Aditya@Dolas@b";
		// System.out.println(s);
		String[] sa = s.split("@");
		// for (String a : sa) {
		// System.out.println(a);
		for (int i = sa.length - 1; i >= 0; i--) {
			System.out.print(" " + sa[i]);

		}

	}
}

class arraySort {
	public static void main(String[] args) {
		int[] a = { 1, 5, 2, 6 };
		System.out.println("Unsorted arrays:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < (a.length - 1 - i); j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		System.out.println("\nSorted Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\nReverse Array:");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}

class bbSortArray {
	public static void main(String[] args) {
		int[] a = { 5, 7, 6, 4, 2, 3, 1 };
		System.out.println("Unsorted Array:");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < (a.length - 1 - i); j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}

		System.out.println("\nSorted Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\nReverse:");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}

class eoeo {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println(a + " is even.");
		} else {
			System.out.println(a + " is odd");
		}
	}
}

class armastrongNumberr {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int x = a;
		while (a != 0) {
			int r = a % 10;
			System.out.println("r===>" + r);
			sum = sum + (r * r * r);
			a = a / 10;
		}
		if (sum == x) {
			System.out.println("is armstrong");
		} else {
			System.out.println("not armstrong");
		}
	}
}

class findTheArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp, num, rem, counter = 0;
		for (int i = 0; i <= a; i++) {
			temp = i;
			num = 0;
			while (temp != 0) {
				rem = temp % 10;
				num = num + (rem * rem * rem);
				temp = temp / 10;
			}
			if (i == num) {
				if (counter == 0) {
					System.out.println("arm numbers are:");
				}
				System.out.println(i + " ");
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("no arm number.");
		}

	}
}

class sortsort {
	public static void main(String[] args) {
		int[] a = { 4, 6, 1, 3, 7, 8, 9 };
		System.out.println("\nUnsorted Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int t;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < (a.length - 1 - i); j++) {
				if (a[j] > a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		System.out.println("\nSorted Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

class palipali {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), temp = 0, r, z = a;

		while (a > 0) {
			r = a % 10;
			temp = temp * 10 + r;
			a = a / 10;
		}
		if (temp == z) {
			System.out.println("pali");
		} else {
			System.out.println("not pali");
		}
	}
}

class eeoo {
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("is even");
		} else {
			System.out.println("is odd");
		}
	}
}

class primePrime {
	public static void main(String[] args) {
		for (;;) {
			System.out.println("Enter:");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			boolean flag = true;
			for (int i = 2; i <= a / 2; i++) {
				if (a % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(a + " is prime.");
			} else {
				System.out.println(a + " is not prime.");
			}
		}
	}
}

class armIsStrong{
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int t=0,x=a;

		while(a!=0) {
			int r=a%10;
			t=t+(r*r*r);
			a=a/10;
		}
		if(t==x) {
			System.out.println(x+" is armstrong number.");
		} else {
			System.out.println(x+" is not an armstrong number.");
		}
	}
}

class reverseStringUsingChar{
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		char[] ca=s.toCharArray();
		for(int i=ca.length-1;i>=0;i--) {
			System.out.print(ca[i]+" ");
		}
	}
}

class reverseString{
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String[] sa=s.split(" ");
		for(String x:sa) {
			System.out.print(x+", ");
		}
		System.out.println();
		for(int i=sa.length-1; i>=0; i--) {
			System.out.print(sa[i]+" ");
		}
	}
}

class digitCount{
	public static void main(String[] args) {
		System.out.println("Enter:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c=0;
		while(a!=0) {
			a=a/10;
			c++;
		}
		System.out.println(c);
	}
}

class sortTheArray{
	public static void main(String[] args) {
		System.out.println("Enter length of an array:");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		
		int[] myArray=new int[length];
		System.out.println("Enter elments:");
		for(int i=0; i<length; i++) {
			myArray[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(myArray));
		
		for(int i=0; i<length-1;i++) {
			for(int j=0; j<(length-1-i);j++) {
				if(myArray[j]>myArray[j+1]) {
					int t=myArray[j];
					myArray[j]=myArray[j+1];
					myArray[j+1]=t;
				}
			}
		}
		System.out.println(Arrays.toString(myArray));
		
	}
}