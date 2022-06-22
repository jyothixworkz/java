package com.xworkz;

public class privatemodifier {
	private void m1() {
		System.out.println(" private modifier is only accessable within the class ");
	}
public static void main(String[] args) {
	privatemodifier p=new privatemodifier();
	p.m1();//for private modifier  we can only access within the class 
}
}
