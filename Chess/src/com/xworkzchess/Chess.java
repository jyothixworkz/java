package com.xworkzchess;

public class Chess {
	int noOfBox;
	String nameOfTheBoard;
	
	public Chess() {
		
		System.out.println("chess object is created");
		
	}
	public Chess(int noOfBox, String nameOfTheBoard) {
		this.noOfBox=noOfBox;
		this.nameOfTheBoard=nameOfTheBoard;
		System.out.println("Chess bean is created");
	}
	@Override
	public String toString() {
		return "Chess [noOfBox=" + noOfBox + ", nameOfTheBoard=" + nameOfTheBoard + "]";
	}
	
	

}
