package com.Day6;

public class ObjectAssignment {
	int a=10;

	public static void main(String[] args) {
		ObjectAssignment obj1 = new ObjectAssignment();
		ObjectAssignment obj2 = obj1;
	
		obj1.a = 20;
		
		System.out.println(obj2.a);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		

	}

	

}
