package com.fdms.service;

import com.fdms.model.Customer;
import com.fdms.repo.CustomerRepoImpl;

public class CustomerService {

	static CustomerRepoImpl customerRepo = new CustomerRepoImpl();


	public static String insertCustomerValidation(Customer customer) {
		String result;
		if (customer == null) {
			return  "customer Object is Null";
		} else if (customer.getCustomer_id() == 0 || customer.getName()== null) { 
			result = "Invalid Customer data";
		}
		else {
			boolean flag = customerRepo.doInsertCustomer(customer);
			if (flag) {
				result = "Customer Object Saved";

			} else {
				result = "Customer Object Not Saved";
			}
		}
		return result;
	}
	
	public static String deleteCustomerValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = customerRepo.doDeleteCustomer(id);
			if (flag) {
				result = "customer Object Deleted";

			} else {
				result = "order Object not Found";
			}
		}
		return result;
	}
	

	public String updateCustomerValidation(Customer customer) {
	String result;
	if (customer == null) {
		result = "Customer Object is Null";
	} else if (customer.getCustomer_id() == 0 || customer.getName() ==  null) {
		result = "Invalid Customer data";
	} else {
		boolean flag = customerRepo.doUpdateCustomer(customer);
		if (flag) {
			result = "Customer Object Saved";

		} else {
			result = "Customer Object Now Saved";
		}
	}
	return result;
}

	public static String findCustomerValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			Customer customer = customerRepo.doFindCustomer(id);
			if (customer != null) {
				result = customer.toString();

			} else {
				result = "Customer Object not Found";
			}
		}
		return result;
	}
	
	public String findAllCustomerValidation() {
		return customerRepo.doFindAll().toString();
	}
	
	
	
}
