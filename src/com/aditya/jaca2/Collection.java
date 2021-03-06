package com.aditya.jaca2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

import com.aditya.jaca2.it.ci.ic;

public class Collection {
	public static void main(String[] args) {
		System.out.println("this file contains all the examples of collections.");
	}
}

class arrayList {
	public static void main(String[] args) {
		ArrayList<String> as = new ArrayList<>();
		as.add("aditya");
		as.add("sumit");
		as.add("arvind");

		Iterator itr = as.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

class linkedList {
	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<>();
		ls.add("ayan");
		ls.add("saurabh");
		ls.add("avinash");

		Iterator itr = ls.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

class vector {
	public static void main(String[] args) {
		Vector<String> vs = new Vector<>();
		vs.add("aditya");
		vs.add("rupali");
		vs.add("rakhi");

		Iterator<String> itr = vs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

class stack {
	public static void main(String[] args) {
		Stack<Integer> ss = new Stack<>();
		ss.add(1);
		ss.add(2);
		ss.add(3);

		Iterator<Integer> itr = ss.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}

interface it {
	class ci {
		interface iit {
			public void ii();
		}

		class ic implements ci.iit {
			public void ii() {
				System.out.println("inner interface");
			}
		}

	}

}

class queueue {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);

		Iterator itr = q.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
