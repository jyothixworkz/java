package com.xworkz.exception;

public class Test {
	public static void main(String[] args) {
		int age= Integer.parseInt(args[0]);
		if(age<18) {
			throw new TooYoungException("you r too young");
		}
		else if(age>60) {
			throw new TooOldException("you r too old");
		}
		else {
			System.out.println("u r welcome");
		}
	}

}
