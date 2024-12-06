package com.Day3;

class A {
	A() {
		System.out.println("Hi A");
	}
}

	class B extends A {
		B() {
			this(5);
			System.out.println("Hi B");
		}

		B(int a) {
			System.out.println("Hi");
		}
	}

public class ConstInvocation {
	
	

	public static void main(String[] args) {
		B obj =  new B();
	}
	}
