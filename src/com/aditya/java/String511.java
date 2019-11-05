package com.aditya.java;

import java.lang.reflect.Array;
import java.util.Arrays;

// How to search the last position of a substring inside a substring

public class String511 {
	public static void main(String[] args) {

		String s = "Hello World !";
		int lastIndex = s.lastIndexOf("o");
		int lastIndex1 = s.indexOf("o");

		if (lastIndex == -1)
			System.out.println("d not found");
		else
			System.out.println("index is: " + lastIndex);
			System.out.println("index is ==>: " + lastIndex1);

	}
}

// How to sort an array and search an element inside it.

class mainclass{
	public static void main(String[] args) {
		int array[] = {2, 5, -2};
		String name[]= {"aditya", "rups"};
		Arrays.sort(array);
		Arrays.sort(name);
		
		
		for(int i=0;i<array.length;i++)
		{
			if(i!=0)
			{
				System.out.println(",");
			}
			System.out.println(array[i]);
		}
		
		for(int i=0;i<name.length;i++)
		{
			if(i!=0)
			{
				System.out.println(",");
			}
			System.out.println(name[i]);
		}
		int index=Arrays.binarySearch(array, 5);
		int index1=Arrays.binarySearch(name, "aditya");
		
		System.out.println("Found 5 at"+index);
		System.out.println("Found 5 at"+index1);
		
	}
}