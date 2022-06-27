package com.xworkz.explicittypecasting;

public class ExplicitExample2 {
public static void main(String[] args) {
	short S=125;
	byte B =(byte)S;
	System.out.println(B);//+125
	short s=150;
	byte b= (byte)s;
	System.out.println(b);//-106
	int I=106;
	char C=(char)I;
	System.out.println(C);
}
}
