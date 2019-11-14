package com.aditya.jaca2;

import java.util.ArrayList;
import java.util.Iterator;

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
