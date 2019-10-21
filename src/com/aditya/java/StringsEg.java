package com.aditya.java;

public class StringsEg {

	// ===> How to compare two Strings ?

	// String Compare by compareTo()

	protected void compairTo() {
		String str = "Hello World";
		String str2 = "hello world";
		Object objstr = str;

		System.out.println(str.compareTo(str2));
		System.out.println(str.compareToIgnoreCase(str2));
		System.out.println(str.compareTo(objstr.toString()));

	}

	// String Compare by equals()

	protected void equals1() {
		String s1 = "aditya";
		String s2 = "aditya";
		String s3 = new String("adi tya");

		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
	}

	// String Compare by equalsTo()

	protected void equalsTo() {
		String s1 = "aditya";
		String s2 = "aditya";
		String s3 = new String("aditya");

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
	}

	// ===>How to search the last position of a substring ?

	private void lastIndex() {
		String s1 = "Hello world ,Hello Reader";
		int lastIndexOf = s1.lastIndexOf("Hello");

		if (lastIndexOf == -1) {
			System.out.println("Hello Not Found");
		} else {
			System.out.println("The index is : " + lastIndexOf);
		}
	}

	private void lastIndexof() {
		String s1 = "aditya";
		int index = s1.lastIndexOf("a");

		System.out.println(index);
	}

	// How to remove a particular character from a string ?

	public void stringPosition() {
		String s1 = "this is java";
		System.out.println(removeCharAt(s1, 3));
	}

	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}

	public void subPosition() {
		String s1 = "aditya";
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(0, 3));
		System.out.println(s1.replace("a", ""));

	}

	// How to replace a substring inside a string by another one ?

	public void replaceString() {
		String s1 = "aditya adi";
		System.out.println(s1.replace("a", "w"));
		System.out.println(s1.replaceFirst("adi", "asd"));
		System.out.println(s1.replaceAll("adi", "ida"));
	}

	// How to reverse a String?

	public void reversString() {
		String s1 = "aditya";
		String reverse = new StringBuffer(s1).reverse().toString();
		System.out.println(s1);
		System.out.println(reverse);
	}
	
	public void reversStringUsingChar() {
		String s1 = "aditya";
		char[] c1 = s1.toCharArray();
		
		for(int i = c1.length-1; i>=0; i--) {
			System.out.println(c1[i]);
		}
	}
	
	// How to search a word inside a string ?
	
	public void searchString() {
		String s1 = "aditya";
		int i = s1.indexOf("tya");
		
		if(i==-1) {
			System.out.println("Not Found");
		} else {
			System.out.println(i);
		}
	}
	
	public void contains() {
		String s1 = "aditya";
		System.out.println(s1.contains("i"));
	}

	public static void main(String[] args) {
		StringsEg st = new StringsEg();
		// st.compairTo();
		// st.equals1();
		// st.equalsTo();
		// st.lastIndex();
		// st.lastIndexof();
		// st.stringPosition();
		// st.subPosition();
		// st.replaceString();
		// st.reversString();
		st.contains();
		
	}
}
