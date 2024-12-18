package com.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEg {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(35);
		list.add(40);
		
		System.out.println(list);
		
		list.add(1, 25);
		System.out.println(list);
		
		System.out.println(list.get(4));
		
		list.remove(0);
		System.out.println(list);
		
		list.set(0,50);
		System.out.println(list);
		
		System.out.println(list.contains(10));
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
		//Way 1
		for(int i = 0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//Way 2
		for(Integer i : list) {
			System.out.println(i);
		}
		
		//Way-3 Iterator method
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator<Integer> it1 = list.iterator();
		while(it1.hasNext()) {
			Integer t = it1.next();
			if(t%2 == 1)
				it1.remove();
		}
			System.out.println(list);
		}
		
		
		
	}


