package com.day8;

public class StringEg1 {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = new String("Java");

		char ch[] = { 'H', 'I' };
		String s3 = new String(ch);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
