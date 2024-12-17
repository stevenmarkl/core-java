package com.day8;

public class StrcompEg {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");

		System.out.println(s1 == s2);// compares memory
		System.out.println(s1.equals(s2));//compares value
		
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s1));
		
       String s3 = "Java";
       String s4 = "Java";
       System.out.println(s3 == s4);
       System.out.println(s3.equals(s4));
	}

}
