package com.day11;

interface MyInterface {
	int calc(int a, int b);

}
/*
// Without Lambda Expression
class Addition implements MyInterface {
	public int calc(int a, int b) {
		return a + b;
	}
}

class Subtration implements MyInterface {
	public int calc(int a, int b) {
		return a - b;
	}
}
*/
public class FuntionalInterfaceEg {

	public static void main(String[] args) {
       MyInterface ref = (a,b) -> a+b;
       System.out.println(ref.calc(100, 200));
       System.out.println(ref.calc(10, 300));
       
       ref = (a,b) -> a-b;
       System.out.println(ref.calc(10, 20));
       System.out.println(ref.calc(100, 200));
	}

}
