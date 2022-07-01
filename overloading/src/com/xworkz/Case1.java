package com.xworkz;

public class Case1 {
	public void m(int I) {
		System.out.println("int argument type");
	}
public void m(float F) {
	System.out.println("float argument type");
}
public static void main(String[] args) {
	Case1 case1=new Case1();
	case1.m(20);
	case1.m(10.5f);
	case1.m('a');// automatic promotion  to int
	case1.m(10l);// automatic promotion to float
	
	
}
}
