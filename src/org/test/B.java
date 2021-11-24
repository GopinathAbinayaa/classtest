package org.test;

public class B {
	public static void main(String[] args) {
		A a = new A();
		int i = a.add("Welcome to java");
		if (i==10) {
			System.out.println("valid");
			
		}else {
			System.out.println("invalid");
		}
	}

}
