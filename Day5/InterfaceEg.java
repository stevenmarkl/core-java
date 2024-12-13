package com.Day5;

interface Myinterface {
	void myAbstractmethod1();
	void myAbstractmethod2();
}
	
class Myclass implements Myinterface {
	public void myAbstractmethod1() {
		System.out.println("My abstract Method");
	}
	public void myAbstractmethod2() {
		System.out.println("My abstract Method 2");
}
}
public class InterfaceEg {

	public static void main(String[] args) {
		 Myinterface obj = new Myclass();
		 obj.myAbstractmethod1();
		 obj.myAbstractmethod2();
	}

}
