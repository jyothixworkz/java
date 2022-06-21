package com.xworkz;

public class example {
	//method with arguments and method with return type
	int findsquare(int a ) {
		return a*a;
	}
	public static void main(String[] args) {
		example e= new example();
		 int r=e.findsquare(20);
		 System.out.println(r);
		 System.out.println(e.findsquare(25));
	}

}
