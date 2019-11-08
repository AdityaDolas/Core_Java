package com.aditya.java;

import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;

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
		for (int i = 2; i <= t;i=i+2) {
			try {
				// i++ i.e. i=i+2
				for (int j = 0; j <= 1000; j=j+100) {
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

class threadrun{
	public static void main(String[] args) {
	Thread t = Thread.currentThread();
	System.out.println(t);
	t.setName("Aditya");
	System.out.println(t);
	System.out.println("Thread is going to sleep for 10 seconds...");
	System.out.println("Thread will appear after 10 seconds...");
	try {
		t.sleep(10000);
	} catch (InterruptedException e) {
		System.out.println("Main Thread is interrupted");
	}
	System.out.println("Thread exist now.");
	}
}

class countDownTimer extends Thread{
	JTextField tf;
	JLabel l;
	JFrame fr;
	public void run() {
		buildGUI();
	}
	void display() {
		for(int i = 60; i>=0;i--) {
			try {
				Thread.sleep(1000);
				String s = Integer.toString(i);
				tf.setText("        " +s+"seconds to go");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		JOptionPane.showMessageDialog(fr, "Times Up !");
		tf.setText("");
		tf.setEnabled(false);
	}
	public void buildGUI() {
		fr = new JFrame();
		JPanel p = new JPanel();
		l = new JLabel();
		tf = new JTextField(15);
		tf.setEnabled(false);
		Font f = new Font("Verdana", 0, 18);
		tf.setFont(f);
		tf.setBackground(Color.BLACK);
		p.setBackground(Color.blue);
		fr.add(p);
		p.add(tf);
		p.add(l);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(300, 100);
		fr.setResizable(false);
		display();
	}
	public static void main(String[] args) {
		countDownTimer obj = new countDownTimer();
		obj.start();
	}
}


































//------------------------------