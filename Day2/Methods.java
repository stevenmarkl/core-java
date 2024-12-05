package com.Day2;

public class Methods {

	void myMethod1() {
		System.out.println("instance method");
	}

	static void myMethod2() {
		System.out.println("static method");
	}

	public static void main(String[] args) {
		// calling instance method using object
		Methods obj = new Methods();
		obj.myMethod1();

		// calling static method
		Methods.myMethod2();

	}

}