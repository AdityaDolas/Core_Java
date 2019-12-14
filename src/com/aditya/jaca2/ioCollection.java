package com.aditya.jaca2;
//Java program to illustrate 

import java.io.FileOutputStream;

//Java.util.HashMap 

import java.util.HashMap;
import java.util.Map;

public class ioCollection {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		print(map);
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		System.out.println("Size of map is:- " + map.size());

		print(map);
		if (map.containsKey("vishal")) {
			Integer a = map.get("vishal");
			System.out.println("value for key" + " \"vishal\" is:- " + a);
		}

		map.clear();
		print(map);
	}

	public static void print(Map<String, Integer> map) {
		if (map.isEmpty()) {
			System.out.println("map is empty");
		}

		else {
			System.out.println(map);
		}
	}
}

// Write byte
class ioio {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("E:\\Programming\\adi.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

// Write String
class ioOut {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("E:\\Programming\\adi.txt");
			String s = "Hi Aditya.";

			// Converting String into byte array
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();

			System.out.println("Success...");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
