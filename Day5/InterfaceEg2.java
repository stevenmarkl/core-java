package com.Day5;
//Implements multiple intefaces

interface Myinterface1 {
	void myAbstractmethod1();
}

interface Myinterface2 {
	void myAbstractmethod2();
}

class Myclass1 implements Myinterface1, Myinterface2 {
	public void myAbstractmethod1() {
		System.out.println("My abstract Method 1");
	}
	
   @Override
	public void myAbstractmethod2() {
		System.out.println("My abstract Method 2");
	}
}

public class InterfaceEg2 {

	public static void main(String[] args) {
		Myclass1 obj = new Myclass1();
		obj.myAbstractmethod1();
		obj.myAbstractmethod2();
	}

}
