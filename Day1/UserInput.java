package com.Day1;
import java.util.Scanner;

//User input
public class UserInput
{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Employer id:");
int id = sc.nextInt();
System.out.println("Enter your name:");
String name = sc.next();
System.out.println("Enter your salary:");
float salary = sc.nextFloat();

System.out.println("Employee id:" +id);
System.out.println("Name:" +name);
System.out.println("Salary:" + salary);
}
}

	