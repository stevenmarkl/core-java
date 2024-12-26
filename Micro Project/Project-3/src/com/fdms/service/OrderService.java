package com.fdms.service;

import com.fdms.model.Customer;
import com.fdms.model.Order;
import com.fdms.repo.CustomerRepoImpl;
import com.fdms.repo.OrderRepo;

public class OrderService {

	
	static OrderRepo orderRepo = new OrderRepo();


	public static String insertOrderValidation(Order order) {
		String result;
		if (order== null) {
			return  "order Object is Null";
		} else if (order.getCustomerid() == 0 || order.getOrderid()== 0 || order.getOrderdate()==null|| order.getAmount()==0) { 
			result = "Invalid Customer data";
		}
		else {
			boolean flag = orderRepo.doInsertOrder(order);
			if (flag) {
				result = "Customer Object Saved";

			} else {
				result = "Customer Object Not Saved";
			}
		}
		return result;
	}
	
	public static String deleteOrderValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = orderRepo.doDeleteorder(id);
			if (flag) {
				result = "customer Object Deleted";

			} else {
				result = "order Object not Found";
			}
		}
		return result;
	}
//	
//
	public String updateOrderValidation(Order order) {
	String result;
	if (order == null) {
		result = "Order Object is Null";
	} else if (  order.getOrderid()== 0 || order.getOrderdate()==null|| order.getAmount()==0)  {
		result = "Invalid Order data";
	} else {
		boolean flag = orderRepo.doUpdateOrder(order);
		if (flag) {
			result = "order Object Saved";

		} else {
			result = "order Object Now Saved";
		}
	}
	return result;
}
//
	public static String findOrderValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid order Id";
		} else {
			Order order = orderRepo.doFindOrder(id);
			if (order != null) {
				result = order.toString();

			} else {
				result = "Order Object not Found";
			}
		}
		return result;
	}
//	
	public static String findAllOrderValidation() {
		return orderRepo.doFindAllOrder().toString();
	}
//	
	
	
}
