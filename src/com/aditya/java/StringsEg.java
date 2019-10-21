package com.aditya.java;

import java.util.Locale;

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

		for (int i = c1.length - 1; i >= 0; i--) {
			System.out.println(c1[i]);
		}
	}

	// How to search a word inside a string ?

	public void searchString() {
		String s1 = "aditya";
		int i = s1.indexOf("tya");

		if (i == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println(i);
		}
	}

	public void contains() {
		String s1 = "aditya";
		System.out.println(s1.contains("i"));
	}

	// How to split a string into a number of substrings ?

	public void nOfSubString() {
		String s1 = "jan-feb-march";
		String[] temp;
		String delimeter = "-";
		temp = s1.split(delimeter);

		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
			System.out.println("");
			s1 = "jan.feb.march";
			delimeter = "\\.";
			temp = s1.split(delimeter);
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
			System.out.println("");
			temp = s1.split(delimeter, 2);

			for (int j = 0; j < temp.length; j++) {
				System.out.println(temp[j]);
			}
		}
	}

	public void splitString() {
		String s1 = "aditya";
		String[] words = s1.split("");

		for (String w : words) {
			System.out.println(w);
		}
	}

	// How to convert a string totally into upper case?

	public void upperCase() {
		String s1 = "String abc touppercase ";
		String stringUppercase = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(stringUppercase);
	}

	// How to match regions in strings ?

	public void rigion() {
		String sf = "aditya";
		String ss = "prashant";
		boolean match = sf.regionMatches(2, ss, 3, 9);
		System.out.println(match);
	}

	// How to compare performance of string creation ?

	public void stringComparePerformancr() {
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 50000; i++) {
			String s1 = "hello";
			String s2 = "hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println(
				"Time taken for creation" + " of String literals : " + (endTime - startTime) + " milli seconds");
		long startTime1 = System.currentTimeMillis();

		for (int i = 0; i < 50000; i++) {
			String s3 = new String("hello");
			String s4 = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println(
				"Time taken for creation" + " of String objects : " + (endTime1 - startTime1) + " milli seconds");
	}
	
	// How to optimize string creation?
	
	public void stringOptimazedMethod() {
		{
		      String variables[] = new String[50000];	  
		      for( int i = 0; i < 50000; i++) {
		         variables[i] = "s"+i;
		      }
		      long startTime0 = System.currentTimeMillis();
		      
		      for(int i = 0; i < 50000; i++) {
		         variables[i] = "hello";
		      }
		      long endTime0 = System.currentTimeMillis();
		      System.out.println("Creation time" 
		         + " of String literals : "+ (endTime0 - startTime0) 
		         + " ms" );
		      long startTime1 = System.currentTimeMillis();
		      
		      for(int i = 0; i < 50000; i++) {
		         variables[i] = new String("hello");
		      }
		      long endTime1 = System.currentTimeMillis();
		      System.out.println("Creation time of" 
		         + " String objects with 'new' key word : " 
		         + (endTime1 - startTime1)
		         + " ms");
		      long startTime2 = System.currentTimeMillis();
		      
		      for(int i = 0; i < 50000; i++) {
		         variables[i] = new String("hello");
		         variables[i] = variables[i].intern();		  
		      }
		      long endTime2 = System.currentTimeMillis();
		      System.out.println("Creation time of" 
		         + " String objects with intern(): " 
		         + (endTime2 - startTime2)
		         + " ms");
		   }
	}
	
	// How to format strings ?
	
	public void formateStrings() {
		double e = Math.E;
		System.out.format("%f%n", e);
		System.out.format(Locale.GERMANY, "-10.4f%n%n", e);
		
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
		// st.contains();
		// st.nOfSubString();
		// st.splitString();
		// st.upperCase();
		// st.rigion();
		// st.stringComparePerformancr();
		// st.stringOptimazedMethod();
		st.formateStrings();

	}
}
