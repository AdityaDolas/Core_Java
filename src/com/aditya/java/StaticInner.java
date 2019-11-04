package com.aditya.java;

public class StaticInner {
	private String username;
	private String password;
	class validateCredentials{
		public void validate() {
			System.out.println(username);
			System.out.println(password);
		}
	}
	public static void main(String[] args) {
		StaticInner si = new StaticInner();
		StaticInner.validateCredentials vc = si.new validateCredentials();
		vc.validate();
	}
}

class PaymentDetails{
	private static String fieldtovalidate;
}