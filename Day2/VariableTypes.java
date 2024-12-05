package com.Day2;

//Types of variables in java
public class VariableTypes {
	int b = 10;//instAnce variable 
	static int c = 20;//static or class variable

	public static void main(String[] args) {
		int a = 30;//local variable
		System.out.println(a);

		VariableTypes obj = new VariableTypes();
		System.out.println(obj.b);

		System.out.println(VariableTypes.c);

	}

}
