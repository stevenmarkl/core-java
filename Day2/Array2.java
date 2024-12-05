package com.Day2;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int EvenCount = 0;
		int OddCount = 0;

		System.out.println("enter the array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				EvenCount++;
			else
				OddCount++;
        }
		System.out.println("Even count:" + EvenCount);
		System.out.println("Odd count:" + OddCount);

	}

}
