package com.day8;

public class StringEg2 {

	public static void main(String[] args) {
		String s1 = "Java";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.concat("world"));
		System.out.println(s1.equals("java"));
		System.out.println(s1.equalsIgnoreCase("java"));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf(0));
		System.out.println(s1.indexOf('b'));
		System.out.println(s1.startsWith("Ja"));
		System.out.println(s1.endsWith("ba"));
		System.out.println(s1.replace('a', 'z'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s2 ="Java World";
		System.out.println(s2.substring(3,7));
		System.out.println(s2.substring(3));

	}

}
