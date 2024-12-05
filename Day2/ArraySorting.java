package com.Day2;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int arr[] = {1, 5, 6, 4, 3};
		
		Arrays.sort(arr);
		
		System.out.println("ascending order");
		for(int i : arr) {
		System.out.println(i);
		
		}
		System.out.println("decending order");
		for(int i= arr.length - 1 ; i >= 0;  i--) {
			System.out.println(arr[i]);
		}

	}

}
