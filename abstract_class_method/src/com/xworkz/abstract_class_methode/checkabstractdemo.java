package com.xworkz.abstract_class_methode;

public class checkabstractdemo {
	public static void main(String[] args) {
		auto a=new auto();
		//bus b= new bus();// we cant because it is abstract class 
		//vehicle v= new vehicle();//we cant because  it is abstract class
		System.out.println(a.getnoofwheels());
		System.out.println(a.noofseats());
		
	}

}
