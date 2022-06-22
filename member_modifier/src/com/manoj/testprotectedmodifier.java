package com.manoj;
import com.xworkz.protectmodifier;
public class testprotectedmodifier extends protectmodifier {
public static void main(String[] args) {
	protectmodifier p=new protectmodifier();
	 //child c= new child();
	//protectmodifier p1=new child();
	//p.m1 we cant call because out side the package we can call protected modifier only with child referal
	testprotectedmodifier t=new testprotectedmodifier();
	t.m1();// only we can access the protected modifier outside the package by only with child referal
}
}
