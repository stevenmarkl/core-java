package com.Day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptypeeg {
	
	void myMethod() throws FileNotFoundException {
	  FileReader fr = new FileReader("mark");
	}
	
	
	void mymethod1() {
		try {
			myMethod();
		}
		catch (FileNotFoundException e) {
			
		}
	}

	public static void main(String[] args) {
		
		//unchecked exception
		int a = 10/0;
		
		//Checked exception
		//FileReader fr  = new FileReader("mark");

		//throw new Exception();
		
		//throw new ArithmeticException();
	}

}
