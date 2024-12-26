package com.fdms.view;

import java.util.Scanner;

import com.fdms.model.Customer;



public class CustomerView {

	static Scanner sc = new Scanner(System.in);
	static int customer_id;
	static String name;


public static Customer insertCustomerView() {
	System.out.println("Enter customer id and name ");
	customer_id = sc.nextInt();
	name = sc.next();
	
	
	return new Customer(customer_id, name);
}

public static int deleteCustomerView() {
	System.out.println("Enter Customer id");
	return sc.nextInt();

}

public static Customer updateCustomerView() {
	System.out.println("Enter Customer customerid and name ");
	
	customer_id = sc.nextInt();
	name = sc.next();
	
	Customer Customer = new Customer();
	Customer.setCustomer_id(customer_id);
	return new Customer(customer_id, name);
}

public static int findCustomerView() {
	System.out.println("Enter Customer no");
	return sc.nextInt();

}
}
