package com.aditya.java;

@FunctionalInterface
interface Bedroom {
	public void helloPerson(String name);

}

class AnonymouseLambda{
	public static void main(String[] args) {
		
		Bedroom bd = (name) -> System.out.println("Today i understood Nothing");
		bd.helloPerson("Arvinda");
	}
}


class BHKs{
	public BHKs(){
		System.out.println("5 BHK.");
	}
}

class mela extends BHKs implements Bedroom {
	public mela(){
		System.out.println("2 BHK.");
	}
	public void helloPerson(String name) {
		System.out.println("1 BHK.");
	}
}


//no touching 
