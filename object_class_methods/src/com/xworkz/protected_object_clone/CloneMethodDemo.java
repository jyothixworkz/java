package com.xworkz.protected_object_clone;

public class CloneMethodDemo {

	public static void main(String[] args) {
Soap santoor =new Soap("santoor", 10.00, "orange");
Soap copyofsantoor=null;
 try {
	 copyofsantoor=santoor.copy();
 }catch (CloneNotSupportedException e) {
	 e.printStackTrace();
 }
 System.out.println(santoor==copyofsantoor);
 System.out.println(copyofsantoor);
 System.out.println(santoor);
	}

	
}
