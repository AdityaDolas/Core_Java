package com.aditya.java;

interface fan1{
	public void usha();
}

public class aLambda{
	 public static void main(String[] args) {
		 fan1 a = new fan1() {
			 @Override
			public void usha() {
				System.out.println("arvinda");
			}
			 
		};
		a.usha();
		
		fan1 f = new fan1() {
			
			@Override
			public void usha() {
				System.out.println("Adit");
				
			}
		};
		f.usha();
	}
}
