package com.xworkz.public_String_toString;

public class window {

	String type;
	double height;
	double width ;
	window(String type,double height,double width){
		this.type =type;
		this.height=height;
		this.width=width;
	}
	@Override
	public String toString() {
		return "window [type=" + type + ", height=" + height + ", width=" + width + "]";
	}
	
}
