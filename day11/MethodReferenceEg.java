package com.day11;

interface MyReference{
	void showMessage();
}

public class MethodReferenceEg {
	
	void MyClass1() {
		System.out.println("Eg for Instance method");
	}
	
	static void MyClass2() {
	System.out.println("Eg for Instance method");
	}
	
	 MethodReferenceEg(){
		 System.out.println("Constructor");
	 }
	

	public static void main(String[] args) {
		MethodReferenceEg obj = new MethodReferenceEg();
		MyReference reference = obj::MyClass1;
		reference.showMessage();
		
		reference = MethodReferenceEg::MyClass2;
		reference.showMessage();
		
		reference = MethodReferenceEg::new;
		reference.showMessage();
	

	}

}
