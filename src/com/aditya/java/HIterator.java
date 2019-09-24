package com.aditya.java;

import java.util.HashSet;

class Contacts {
	int a = 1;
}

public class HIterator {
	public static void main(String[] args) {
		Contacts a = new Contacts();
		Contacts b = new Contacts();
		Contacts c = new Contacts();
		HashSet<Contacts> hs = new HashSet<>();
		hs.add(a);
		hs.add(b);
		hs.add(c);
		System.out.println(hs);
	}
}
