package com.aditya.java;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String_Demo[] args) {
		System.out.println("Enter Integer:");
		Scanner in=new Scanner(System.in);
		float temp=in.nextInt();
		
		temp=((temp - 32)*5)/9;
		System.out.println("temperature in Celsius = " + temp);
	}
}
