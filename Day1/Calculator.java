package com.Day1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		String msg= "";
		do {
	System.out.println("Enter a choice:");
	System.out.println("1 Addition:");
	System.out.println("2 Subtraction:");
	System.out.println("3 Multiplication:");
	System.out.println("4 Division:");
	
	Scanner sc = new Scanner(System.in);
	int choice=sc.nextInt();
	     
	switch(choice) {
		case 1:
			System.out.println("Addition");
			 System.out.println("First number:");
				int a = sc.nextInt();
				 System.out.println("Second number:");
				int b = sc.nextInt();
				int c=a+b;
				System.out.println("addition is "+c);
               break;
			
		case 2:
			System.out.println("Subtraction");
			 System.out.println("First number:");
				int d = sc.nextInt();
		
				 System.out.println("Second number:");
				int e = sc.nextInt();
				int f=d-e;
				System.out.println("sub is "+f);
				break;
				
		case 3:
			System.out.println("Multiplication");
			 System.out.println("First number:");
				int g = sc.nextInt();
				 System.out.println("Second number:");
				int h = sc.nextInt();
				int i=g*h;
				System.out.println("multiplication is "+i);
                break;
                
		case 4:
			System.out.println("Division");
			 System.out.println("First number:");
				int j = sc.nextInt();
				 System.out.println("Second number:");
				int k = sc.nextInt();
				int l=j/k;
				System.out.println("div is "+l);
				break;
				
		default:
				System.out.println("Invalid ");
			
	}
	
      System.out.println("do you wanna continue [ Yes | No ]");
      msg = sc.next();
		}while (msg.equals("Yes"));
		
	}

}
