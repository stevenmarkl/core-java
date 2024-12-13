package com.Day4;

class Vehicle {
	void noOfEngine() {
		System.out.println("I have one Engine");
	}



	void noOfWheels() {
		System.out.println("not define");
	}
}

	class TwoWheeler extends Vehicle {
		void noOfWheels() {
			System.out.println("I Have two Wheels");
		}

	}

	public class MethodOverriding {

		public static void main(String[] args) {
			Vehicle obj = new TwoWheeler();
			obj.noOfEngine();
			obj.noOfWheels();
			
		}	
	}
	
