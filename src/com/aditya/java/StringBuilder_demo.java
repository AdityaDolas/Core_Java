package com.aditya.java;

public class StringBuilder_demo {
	void sbMethod() {
		StringBuilder sb=new StringBuilder("fruits ");
		sb.append("are good for health.");
		System.out.println(sb);
		System.out.println(sb.delete(6, 10));
		sb.insert(6, " are ");
		System.out.println(sb.toString());
		System.out.println(sb.reverse());
		
	}
	public static void main(String[] args) {
		StringBuilder_demo sb=new StringBuilder_demo();
		sb.sbMethod();
	}
}
