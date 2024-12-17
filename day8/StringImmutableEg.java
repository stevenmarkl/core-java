package com.day8;

public class StringImmutableEg {

	public static void main(String[] args) {
		String s1 = new String("Java");
		s1 = s1.concat("World");
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Steven");
		sb.append("Mark");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1.capacity());
		}

}
