package com.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetEg {

	public static void main(String[] args) {
		Set<Integer> set =new LinkedHashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.contains(10));
		
		for(Integer i : set) {
		System.out.println(i);
	}
		System.out.println("Iterator ");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}

