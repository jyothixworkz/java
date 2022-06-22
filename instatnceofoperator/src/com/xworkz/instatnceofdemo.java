package com.xworkz;

public class instatnceofdemo {
	public static void main(String[] args) {
		Thread t =new Thread();
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Object );
	System.out.println(t instanceof Runnable);
	}


}
// to use instatnceof operator compulsory there should be some relationship between arguments type 