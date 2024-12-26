package com.fdms.repo;

import java.util.List;

import com.fdms.model.Customer;

public interface CustomerRepo {
	public boolean doInsertCustomer(Customer customer);
	public boolean doDeleteCustomer(int id);
	public boolean doUpdateCustomer(Customer customer);
	public Customer doFindCustomer(int id);
	public static List<Customer> doFindAll();

}
