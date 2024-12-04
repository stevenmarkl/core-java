package com.Day1;
public class CommandAddition{
	public static void main(String args[])
{
	
	if(args.length==2)  {
	int a=Integer.parseInt(args[0]);
	int b =Integer.parseInt(args[1]);
	int sum = a+b;
	System.out.println("Addition :" + sum);
        }
 	else
	System.out.println("insufficient input");
}
}