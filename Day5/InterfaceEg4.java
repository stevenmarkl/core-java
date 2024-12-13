package com.Day5;

interface VehiclePlan{
	void noOfEngine();
	void noOfWheels();
	void brandName();
}

abstract class Vehicle3 implements VehiclePlan {
	public void noOfEngine() { // interface methods are public so call it using "public"
		System.out.println("I have 1 Engine");
	}
}

class Bike3 extends Vehicle3 {
	public void noOfWheels() {
		System.out.println("I have two wheels");
	}

public void brandName() {
	System.out.println("Brand name is Honda");
}
}

public class InterfaceEg4 {

	public static void main(String[] args) {
		VehiclePlan vec = new Bike3();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();
	}

}
