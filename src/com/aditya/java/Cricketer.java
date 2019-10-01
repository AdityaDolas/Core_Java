package com.aditya.java;

public class Cricketer {
	String_Demo name;
	String_Demo team;
	int age;

	public Cricketer() {
		name = "";
		team = "";
		age = 0;

	}
	
	public Cricketer(String_Demo n, String_Demo t, int a) {
		name=n;
		team=t;
		age=a;
		
	}
	
	public Cricketer(Cricketer ckr) {
		name=ckr.name;
		team=ckr.team;
		age=ckr.age;
		
	}
	
	public String_Demo toString() {
		return "This is "+name+" of "+team;
	}
	
	public static void main(String_Demo[] args) {
		Cricketer c1=new Cricketer();
		Cricketer c2=new Cricketer("Rohit", "India", 32);
		Cricketer c3=new Cricketer(c2);
		System.out.println(c2);
		System.out.println(c3);
		c1.name="Hardik";
		c1.team="India";
		c1.age=24;
		System.out.println(c1);
	}
}
