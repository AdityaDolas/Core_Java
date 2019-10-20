package com.aditya.java;

public class JC1 {
	public void nature() {
		System.out.println("hard working");
		}
	public int total(int basic, int ba, int hra) {
		int sum = basic + ba + hra;
		return sum;
	}
	public static void main(String[] args) {
		JC1 j = new JC1();
		j.nature();
		int salary = j.total(244,244,222);
		System.out.println(salary);
	}
}
