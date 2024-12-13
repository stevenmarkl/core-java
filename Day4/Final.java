package com.Day4;

final class Car {
	final  String model;

	 public Car(String model) {
		this.model = model;
	}

	public  void start() {
		System.out.println("The " + model + " car is starting.");
	}
}



public class Final {
	public static void main(String[] args) {
		Car myCar = new Car("BMW");
		myCar.start();
		System.out.println("Car model: " + myCar.model);
	}
}
