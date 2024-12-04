package com.Day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {

			fact = fact * i;
		}
		System.out.println("factorial is " + fact);

	}

}
