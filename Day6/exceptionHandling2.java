package com.Day6;

public class exceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("before exception");
		
		 
		 try {
			 int a = 10/0;
			 int b = Integer.parseInt("ABC");
			 
		 } catch (ArithmeticException e) {
			 System.out.println( e.getMessage());  
		 }
		 catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println( e.getMessage());
			 System.out.println("a" );  
		 }
		 catch (NumberFormatException e) {
			 System.out.println( e.getMessage());
			 System.out.println("b" );  
		 }
		 
		 finally {
			 System.out.println("Inside Finally");
		 }
		 
		 System.out.println("After Exception");
		 
	}

}
