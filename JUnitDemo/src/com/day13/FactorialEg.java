package com.day13;

public class FactorialEg {
	
	public int getFactorial(int n) {
     int fact = 1;
     
     
     for(int i=1; i<=n;i++) {
    	 fact = fact * i;
     }
	return fact;
	
	
	}
}
