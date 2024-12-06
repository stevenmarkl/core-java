package com.Day3;

class Vehicle {
	void NoofEngine() {
		System.out.println("i have one engine");
	}
}
	class TwoWheeler extends Vehicle {
		void NoofWheels() {
			System.out.println("i have two wheels");
		}
	}
		class Bike extends TwoWheeler {
			void BrandName() {
				System.out.println("Brand name is :Honda");
			}
		}

	public class inheritance {

		public static void main(String[] args) {
			Bike splendor = new Bike();
			splendor.NoofEngine();
			splendor.NoofWheels();
			splendor.BrandName();

		}

	}

