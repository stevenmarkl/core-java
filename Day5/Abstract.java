package com.Day5;

abstract class Myabstractclass {
	abstract void myAbstractmethod();

	abstract void myAbstractmethod1();

	void normalMethod() {
		System.out.println("my method/ concrete method");
	}

}

class MyNormalclass extends Myabstractclass {
	
	void myAbstractmethod() {
		System.out.println("My abs meth 1");
	}

	void myAbstractmethod1() {
		System.out.println("My abs meth 2");
	}

}

public class Abstract {

	public static void main(String[] args) {
		Myabstractclass obj = new MyNormalclass();
		obj.myAbstractmethod();
		obj. myAbstractmethod1();
		obj.normalMethod();
	}

}
