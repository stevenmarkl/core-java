package com.fdms.model;

public class Customer {
   private int customer_id;
   private String name;

   public Customer() {
	super();
	// TODO Auto-generated constructor stub
	
	
}

public Customer(int customer_id, String name) {
	super();
	this.customer_id = customer_id;
	this.name = name;
	
}

public int getCustomer_id() {
	return customer_id;
}

public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
	
	
}

@Override
public String toString() {
	return "Customer [customer_id=" + customer_id + ", name=" + name + "]";
}
}
