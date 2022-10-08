package com.xworkz.controlflowstatement;

public class BreakExamples {
	public static void main(String[] args) {
		for( int i=1;i<=5;i++) {
			System.out.println(i);
			if(i==2) {
				break;
			}
		}
	}

}
