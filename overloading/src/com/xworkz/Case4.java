package com.xworkz;

public class Case4 {
	public void m(int I) {
		System.out.println("general method");
	}
	public void m(int... i) {
		System.out.println("var args method");
	}
 public static void main(String[] args) {
	 Case4 C=new Case4();
	 C.m();
	 C.m(20,30);
	 C.m(10);// when ever  both method matched old concept will win. var args method is new method (1.5 version)
}
}
