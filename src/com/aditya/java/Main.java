package com.aditya.java;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int R = sc.nextInt();
	    
	    if(R>0 && R<=50)
	        System.out.println(100);
	    
	    if(R>=51 && R<=100)
	        System.out.println(50);
	    
	    if (R>100)
	        System.out.println(0);
	   
	}
}
