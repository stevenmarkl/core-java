package com.day9;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEg {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>(3,2);//3-initial capacity  2-will be increamented by 2 when the capacity filled
		
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(10);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(20);
		vec.add(30);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(40);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		

	}

}
