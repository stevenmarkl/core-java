package com.day8;

//equals() vs ==
public class StringCompare {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");

		System.out.println(s1 == s2);// compares memory
		System.out.println(s1.equals(s2));//compares value

		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
