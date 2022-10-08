package com.xworkz.controlflowstatement;

public class NestedIfExamples {
	public static void main(String[] args) {
		
		int y=20;
		if(y==202) {
			System.out.println("enter into nested");
			if(y>=25) {
			System.out.println("inner if is very much true ");
			}
			else if(y<=16) {
				System.out.println("inner else if is very much true ");
			}
			else {
				System.out.println(" inner conditions are very much false");
			}
		}
			else {
				System.out.println(" we r not entering inner block");
			
		}
	}

}
