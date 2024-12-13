package com.Day5;

// Interface extends

interface Myinterface3 {
	void myAbstractmethod1();
}

interface Myinterface4 extends Myinterface3 {
	void myAbstractmethod2();
}

class Myclass2 implements Myinterface4 {
	public void myAbstractmethod1() {
		System.out.println("My abstract Method 3");
	}
	
 @Override
	public void myAbstractmethod2() {
		System.out.println("My abstract Method 4");
	}
}

public class InterfaceEg3 {

	public static void main(String[] args) {
		Myinterface4 obj = new Myclass2();
		obj.myAbstractmethod1();
		obj.myAbstractmethod2();
	}

}

