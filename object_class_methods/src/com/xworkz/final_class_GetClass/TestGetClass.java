package com.xworkz.final_class_GetClass;

public class TestGetClass {
	public static void main(String[] args) {
		Soap s=new Soap();
		Nandan N=new Nandan();
		System.out.println(s.getClass());
		System.out.println(N.getClass().getSimpleName());
	}
		
	

}
