package com.Day4;

public class MethodOverloading {
	void myMethod(int a) {

		System.out.println("square of the num " + a*a);
	}
	
	void myMethod(String a) {
		
		System.out.println("the string is:" +a);
		
	}
	
	void myMethod(int a, int b) {
		System.out.println("sum of the nums:" +(a + b));
		
		
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.myMethod(5);
		obj.myMethod("mark");
		obj.myMethod(6,7);
		

	}

}
