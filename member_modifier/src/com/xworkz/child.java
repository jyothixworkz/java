package com.xworkz;

public class child  extends protectmodifier{
	public static void main(String[] args) {
		child c=new child();
		protectmodifier p=new protectmodifier();
		protectmodifier p1=new child();
		c.m1();
		p.m1();
		p1.m1();// with in the same package we can access protected modifier by child referal and parent referal and also we can hold the child by parent referal and access through it
	}

}
