package com.aditya.java;

enum Mango {
	Charie(10), Fairchild(20), haden(80);
	private int price;

	Mango(int p) {
		price = p;
	}int getPrice(){return price;}}
class Enum1{
	public static void main(String_Demo[] args) {
		Mango p=Mango.Charie;
		System.out.println(p.getPrice());
	}
}
