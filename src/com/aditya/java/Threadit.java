package com.aditya.java;

import java.util.Scanner;

/**
 * @author Aditya
 *
 */
public class Threadit extends Thread {
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] argument) {
		Threadit ti = new Threadit();
		ti.run();
		ti.start();
	}
}

class runit implements Runnable {
	public void run() {
		System.out.println("Thread is running... with runnable interface");
	}

	public static void main(String[] args) {
		runit i = new runit();
		Thread t1 = new Thread(i);
		t1.start();
	}

}

class sleeping extends Thread {
	public void run() {
		System.out.println("Enter: ");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i <= t; i++) {
			try {
				for (int j = 50; j <= 100; j++) {
					Thread.sleep(j);
				}
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		sleeping sl = new sleeping();
		sl.start();
	}
}
