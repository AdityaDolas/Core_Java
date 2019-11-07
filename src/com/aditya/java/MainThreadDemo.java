package com.aditya.java;

public class MainThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("The current thread: "+t);
		
		t.setName("MainThred");
		System.out.println("The current thread after name change: "+t);
		
		System.out.println("The current thread is going to sleep for 10 seconds");
		try {
			t.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("After 10 seconds current thread is existing now");
	}
	
}
