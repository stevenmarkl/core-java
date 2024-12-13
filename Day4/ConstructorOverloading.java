package com.Day4;

 class ConstructorOverloading {
	
	ConstructorOverloading(int a) {

		System.out.println("square of the num " + a*a);
	}
	
	ConstructorOverloading(String a) {
		
		System.out.println("the string is:" +a);
		
	}
	
	ConstructorOverloading(int a, int b) {
		System.out.println("sum of the nums:" +(a + b));
		
		
	}
	
 }


