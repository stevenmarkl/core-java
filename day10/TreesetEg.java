package com.day10;


import java.util.Iterator;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetEg {

	public static void main(String[] args) {
		SortedSet<Object> set =new TreeSet<>();
		
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(90);
		set.add(30);
		System.out.println(set);
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.contains(10));
		
		for(Object i : set) {
		System.out.println(i);
	}
		System.out.println("Iterator ");
		Iterator<Object> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}



