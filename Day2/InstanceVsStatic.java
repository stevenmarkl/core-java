package com.Day2;

public class InstanceVsStatic {
	static int a = 10;
	int b = 20;

	public static void main(String[] args) {
		InstanceVsStatic obj1 = new InstanceVsStatic();
		InstanceVsStatic obj2 = new InstanceVsStatic();

		// instance
		System.out.println(obj1.b);
		System.out.println(obj2.b);

		obj1.b = 30;

		System.out.println(obj1.b);
		System.out.println(obj2.b);

		// static
		System.out.println(obj1.a);
		System.out.println(obj2.a);

		obj1.a = 20;

		System.out.println(obj1.a);
		System.out.println(obj2.a);

	}

}
