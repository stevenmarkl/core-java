package com.Day2;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int duplicateCount = 0;
	

		System.out.println("enter" +arr.length+" elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
		 for(int j= i+1; arr[i] != -1 && j<arr.length; j++) 
			  if(arr[i]== arr[j]) {
				  count++;
				  arr[j] = -1;
			  }
			
		
       	if(count > 0) {
		   duplicateCount++;
       	}
		}

		System.out. println("total no of duplicate elements are:" +duplicateCount);
	
		
	}
}




