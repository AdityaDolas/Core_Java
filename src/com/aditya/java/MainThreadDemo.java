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

// How to run Thread by extending Thread
class Multi extends Thread{
	public void run() {
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		Multi m = new Multi();
		m.start();
	}
}

// How to run Thread by implementing Runnable interface
class Multi3 implements Runnable{
	public void run() {
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args) {
		Multi3 m1 = new Multi3();
		Thread ti = new Thread(m1);
		ti.start();
	}
}

// sleep()
class TestSleepMethod1 extends Thread{
	public void run() {
		for(int i = 1; i<51 ; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		TestSleepMethod1 ts = new TestSleepMethod1();
		ts.start();
	}
}

class TestThreadClass extends Thread{
	public void run() {
		System.out.println("running...");
	}
	public static void main(String[] args) {
		TestThreadClass  tc = new TestThreadClass();
		tc.start();
		tc.start();
		
	}
}

class TestJoinMethod1 extends Thread {
	public void run() {
		for(int i =1; i<5;i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		TestJoinMethod1 t1 = new TestJoinMethod1();
		TestJoinMethod1 t2 = new TestJoinMethod1();
		TestJoinMethod1 t3 = new TestJoinMethod1();
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();

	}
}







































































//----------------------------------------