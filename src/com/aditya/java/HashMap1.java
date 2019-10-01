package com.aditya.java;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String_Demo[] args) {
		
		// Hashmap
		HashMap<Integer, String_Demo> hm=new HashMap<>();
		System.out.println(hm);
		
		hm.put(100, "avinash");
		
		System.out.println("after invoking");
		for (Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			
			
		}
		
	}
}
