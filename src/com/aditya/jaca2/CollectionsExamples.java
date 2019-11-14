package com.aditya.jaca2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsExamples {
	public static void main(String[] args) {
		System.out.println("this file contains all the examples of collections.");
	}
}

class arrayList{
	public static void main(String[] args) {
		ArrayList<String> as = new ArrayList<>();
		as.add("aditya");
		as.add("sumit");
		as.add("arvind");
		
		Iterator itr = as.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

class linkedList{
	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<>();
		ls.add("ayan");
		ls.add("saurabh");
		ls.add("avinash");

		Iterator itr = ls.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}