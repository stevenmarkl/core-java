package com.day11;

import java.util.StringJoiner;

public class StringJoinerEg {

	public static void main(String[] args) {
	
		StringJoiner joiner = new StringJoiner(",");
		joiner.add("one");
		joiner.add("two");
		joiner.add("three");
		String result = joiner.toString();
		System.out.println(result);
		
		
		StringJoiner joiner1 = new StringJoiner(",","[","]" );
		joiner1.add("four");
		joiner1.add("five");
		joiner1.add("five");
		String result1 = joiner1.toString();
		System.out.println(result1);
		

	}

}
