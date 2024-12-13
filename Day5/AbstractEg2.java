package com.Day5;

//Abstract class with constructor
abstract class Vehicle1 {
	
	Vehicle1(){
		this(5);
		System.out.println("abstract class default constructor");
	}
	Vehicle1(int a){
		System.out.println(a);
	}
	void noOfEngine() {
		System.out.println("I have 1 engine");
	}

	abstract void noOfWheels();

	abstract void brandName();

}

class Bike1 extends Vehicle1 {
	Bike1(){
		super(2);
	}
	
	
	void noOfWheels() {
		System.out.println("I have 2 wheels");
	}

	void brandName() {
		System.out.println("Honda");
	}
}

public class AbstractEg2 {

	public static void main(String[] args) {
		Vehicle1 vec;

		vec = new Bike1();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();

	}

}
