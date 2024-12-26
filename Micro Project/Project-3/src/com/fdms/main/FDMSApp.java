package com.fdms.main;

import java.util.Scanner;

import com.fdms.model.Customer;
import com.fdms.model.Order;
import com.fdms.service.CustomerService;
import com.fdms.service.OrderService;
import com.fdms.view.CustomerView;
import com.fdms.view.OrderView;




public class FDMSApp {
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		System.out.println("1. Insert Customer");
		System.out.println("2. Delete Customer");
		System.out.println("3. Update Customer");
		System.out.println("4. Find Customer");
		System.out.println("5. Find All Customer");
		System.out.println("6. Insert Order");
		System.out.println("7. Delete  Order");
		System.out.println("8. Update  Order");
		System.out.println("9. Find  Order");
		System.out.println("10. Find All  Order");
		System.out.println("11. Exit");

		System.out.println("Enter your choice :");
		int choice = sc.nextInt();
		return choice;

	}


	public static void main(String[] args) {
	OrderService orderService = new OrderService();
	CustomerService customerService = new CustomerService();	

		String result = "";
		String msg = "";
		Customer customer;
		Order order;
		int id = 0;
		
		Scanner sc = new Scanner(System.in);

		do {
			int choice = menu();

			switch (choice) {
			case 1:
				customer = CustomerView.insertCustomerView();
				result = CustomerService.insertCustomerValidation(customer);
				System.out.println(result);
				break;
		case 2:
				id = CustomerView.deleteCustomerView();
				result = CustomerService.deleteCustomerValidation(id);
				System.out.println(result);
				break;

     		case 3:
				customer = CustomerView.updateCustomerView();
				result = customerService.updateCustomerValidation(customer);
				System.out.println(result);
				break;

			case 4:
				id = CustomerView.findCustomerView();
				result = CustomerService.findCustomerValidation(id);
				System.out.println(result);
				break;

			case 5:
				result = customerService.findAllCustomerValidation();
				System.out.println(result);
				break;

			case 6:
				order = OrderView.insertOrderView();
				result = OrderService.insertOrderValidation(order);
				System.out.println(result);
				break;
			case 7:
				id = OrderView.deleteOrderView();
				result = orderService.deleteOrderValidation(id);
				System.out.println(result);
				break;
			case 8:
				order = OrderView.updateOrderView();
				result = orderService.updateOrderValidation(order);
				System.out.println(result);
				break;
			case 9:
				id = OrderView.findOrderView();
				result = orderService.findOrderValidation(id);
				System.out.println(result);
				break;
			case 10:
				result = OrderService.findAllOrderValidation();
				System.out.println(result);
				break;

			case 11:
				System.out.println("Invalid choice");
				break;
			}

			System.out.println("Do you want to continue [Yes | No] :");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}








