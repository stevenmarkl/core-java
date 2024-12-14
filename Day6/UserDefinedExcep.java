package com.Day6; 

class AgeException extends Exception {
	@Override
	public String toString() {
		
		return " you cant vote bro";
	}
	
}

public class UserDefinedExcep {

	public static void main(String[] args) {
	    int age = 17;
	    
	    if(age >= 18)  {
	    	System.out.println("come and vote");
	    }else {
	    	try {
	    		throw new AgeException();
	    	}
	    	catch(AgeException e) {
	    		System.out.println(e); 
	    	}
	    }
	    
	}

}
