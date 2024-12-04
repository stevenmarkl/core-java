package com.Day1;

import java.util.Scanner;

public class FactorialTable {

	public static void main(String[] args) {
		int fact = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			
			fact = fact * i;
			System.out.println(i + "  factorial is " + fact);
		}
	

	}

}
