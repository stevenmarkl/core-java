package com.Day5;

abstract class Vehicle {
	void noOfEngine() {
		System.out.println("I have 1 engine");
	}

	abstract void noOfWheels();

	abstract void brandName();

}

class Bike extends Vehicle {
	void noOfWheels() {
		System.out.println("I have 2 wheels");
	}

	void brandName() {
		System.out.println("Honda");
	}
}

class Car extends Vehicle {
	void noOfWheels() {
		System.out.println("I have 4 wheels");
	}

	void brandName() {
		System.out.println("BMW");
	}
}

public class AbstractEg1 {

	public static void main(String[] args) {
		Vehicle vec;
		
		vec = new Bike();
		vec. noOfEngine();
		vec.noOfWheels();
		vec.brandName();
		
		
		vec = new Car();
		vec. noOfEngine();
		vec.noOfWheels();
		vec.brandName();
		
		

		
	}

}
