package com.fdms.view;

import java.util.Scanner;

import com.fdms.model.Order;

public class OrderView {

	static Scanner sc = new Scanner(System.in);

	static int customer_id;
	static int order_id;
	static String orderdate;
	static int total_amount;

	public static Order insertOrderView() {
		System.out.println("Enter customer id, order id, order date,amount: ");
		customer_id = sc.nextInt();
		order_id = sc.nextInt();
		orderdate = sc.next();
		total_amount = sc.nextInt();

		return new Order(order_id, customer_id, orderdate, total_amount);
	}

	public static int deleteOrderView() {

		System.out.println("Enter Order id");
		return sc.nextInt();

	}

	public static Order updateOrderView() {
		System.out.println("Enter order id,customer id, order date,amount to modifiy the orderdate , total amount ");
		customer_id = sc.nextInt();
		order_id = sc.nextInt();
		orderdate = sc.next();
		total_amount = sc.nextInt();

		return new Order(order_id, customer_id, orderdate, total_amount);

	}


public static int findOrderView() {
	
	System.out.println("Enter Order_no");
	return sc.nextInt();

}
}
