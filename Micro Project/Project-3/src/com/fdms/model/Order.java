package com.fdms.model;

public class Order {

	private int orderid;
	private int customerid;
	private  String orderdate;
	private  int amount;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderid, int customerid, String orderdate, int amount) {
		super();
		this.orderid = orderid;
		this.customerid = customerid;
		this.orderdate = orderdate;
		this.amount = amount;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", customerid=" + customerid + ", orderdate=" + orderdate + ", amount="
				+ amount + "]";
	} 
	
	
}
