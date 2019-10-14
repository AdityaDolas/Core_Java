package com.aditya.java;

public class Constructor1 {
	
		int v1;
		int v2;
		Constructor1 (){
		v1=1;
		v2=2;
		System.out.println("ic");
		}
		public void display() {
			System.out.println(v1);
			System.out.println(v2);
		}
		
		public static void main(String[] args) {
			Constructor1 c1 = new Constructor1();
			c1.display();
		}
	}
