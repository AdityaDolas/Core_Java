package com.aditya.java;

/**
 * @author Aditya
 *
 */
public class Threadit extends Thread {
	public void run() {
		System.out.println("Thread is running...");
	}
	public static void main (String[] argument) {
		Threadit ti = new Threadit();
		ti.run();
		ti.start();
	}
}

class runit implements Runnable{
	public void run() {
		System.out.println("Thread is running... with runnable interface");
	}
	public static void main(String[] args) {
		runit i = new runit();
		Thread t1 = new Thread(i);
		t1.start();
	}
	
}
