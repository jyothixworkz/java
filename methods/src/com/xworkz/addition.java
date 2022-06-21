package com.xworkz;

public class addition {
	//method with arguments and without return type
	void add(int a,int b) {
		int sum =a+b;
		System.out.println(sum);
		//System.out.println(a+b);
	}
public static void main(String[] args) {
	addition a=new addition();
	a.add(10, 200);
	a.add(100,10 );
}

}
