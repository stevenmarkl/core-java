package com.Day2;

class Mobile {
	int Price;
	String Brandname;
	int RAM;

//Constructor
	Mobile(int Price, String Brandname, int RAM) {
		this.Price = Price;
		this.Brandname = Brandname;
		this.RAM = RAM;

	}

	void display() {
		System.out.println("mobile price:" + Price);
		System.out.println("Brand name:" + Brandname);
		System.out.println("mobile RAM:" + RAM);
	}
}

public class ClassAndObject2 {

	public static void main(String[] args) {
		Mobile Redmi = new Mobile(1000, "redmi", 8);
		Redmi.display();
	}

}
