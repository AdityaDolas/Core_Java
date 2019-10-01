package com.aditya.java;

abstract class Bank{
	abstract int getRateOffInterast();
}

class SBI extends Bank{
	int getRateOffInterast() {
		return 7;
	}
}

class PNB extends Bank{
	int getRateOffInterast() {
		return 8;
	}
}

public class TestBank {
	public static void main(String_Demo[] args) {
		Bank b=new SBI();
		System.out.println("Rate Of Interast");
	}
}
