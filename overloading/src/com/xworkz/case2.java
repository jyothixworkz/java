package com.xworkz;

public class case2 {
	public void m(Object o) {
		System.out.println("object version");
	}
	public void m(String s) {
		System.out.println("string version");
	}
public static void main(String[] args) {
	case2 C=new case2();
	C.m(new Object());
	C.m("manoj");
	C.m(null);// null is valid for both object and string if there is a parent and child argument is there then child get a chance 
	//if it is not matched then only it goes to paent
}
}

