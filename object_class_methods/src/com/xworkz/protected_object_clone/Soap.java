package com.xworkz.protected_object_clone;

public class Soap implements Cloneable{
	String brand;
	double price;
	String color;
	public Soap(String brand, double price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public Soap copy() throws CloneNotSupportedException {
		 Object obj=super.clone();
		 Soap soap=(Soap)obj;
		 return soap;
		 
	}
	@Override
	public String toString() {
		return "Soap [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

}

