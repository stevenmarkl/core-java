package com.Day6;

public class Throw {

	public static void main(String[] args) {
		try {
			throw new ArithmeticException(" cannot divide by zero");
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
