package com.Day5;

// Multiple inheritance
interface One {
	int a = 10; // Public static final
}

interface Two {
	int b = 20; // Public static final
}

interface Three extends One, Two {
	void sum();
}

class Normal implements Three {
	public void sum() {
		System.out.println( "The sum of the given numbers is:");
		System.out.println( a + b);
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Normal obj = new Normal();
		obj.sum();

	}

}
