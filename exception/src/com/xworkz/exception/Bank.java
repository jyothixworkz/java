package com.xworkz.exception;

public class Bank {
	public static void main(String[] args) {
		 int pin=Integer.parseInt(args[0]);
		 if(pin!=2020) {
			 throw new PinNotValid(" idiot");
		 }
		 else {
			 System.out.println("collect the money ");
		 }
	}

}
