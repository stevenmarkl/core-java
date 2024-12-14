package com.Day6;

public class ExceptionHandling {
	int a = 10;
	
	public static void main(String[] args) {
		
		System.out.println("before exception");
		
		//int a = 10/0; //Arithmretic exep
		//int arr[] = {10,20,30}; 
		//System.out.println(arr[3]); //Arrayindex outofbound exep
		//int arr[] = new int[-5];  //Negative arrraysize exep
		//int a = Integer.parseInt("ABC");  // NumberFormatExep
		
		ExceptionHandling obj = null; // null pointer excep
		System.out.println(obj.a);
		
		System.out.println("After exception");
	}

}
