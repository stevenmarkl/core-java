package com.Day4;

class Vehicl {
	void noOfVehicle() {
		System.out.println("dont have engines for now");

	}

	void noOfWheels() {
		System.out.println("no wheels");
	}
}

class TwoWheel extends Vehicl {
	void noOfWheels() {
		System.out.println("2 wheels");
	}
    void noOfVehicle() {
    	System.out.println("1 vehicle");
    }
	
}

public class dmd {

	public static void main(String[] args) {
		Vehicl o = new TwoWheel();// dmd 
		o.noOfWheels();
		o.noOfVehicle();

	}

}
