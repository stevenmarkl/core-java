package com.fdms.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.fdms.model.Customer;
import com.fdms.util.DBUtil;



public class CustomerRepoImpl {

	public boolean doInsertCustomer(Customer customer) {
		
		boolean flag = false;
			try {
		
			Connection con = DBUtil.getDBConnection();
			String sql ="insert into customer_steven values(?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			
			
			ps.setInt(1, customer.getCustomer_id());
			ps.setString(2, customer.getName());
			
			int n = ps.executeUpdate();
			if(n== 1)
				flag = true;
			
		}catch(SQLException e) {
			System.out.println("Insert Query not Executed");
		}
			
			
		return flag;
		}
	
	public boolean doDeleteCustomer(int id) {
		boolean flag =false;
		try {
	
		Connection con = DBUtil.getDBConnection();
		String sql ="delete customer_steven where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		int n = ps.executeUpdate();
		if(n== 1)
			flag = true;
		
	}catch(SQLException e) {
		System.out.println("delete Query not Executed");
	}
		
		
	return flag;}

	public boolean doUpdateCustomer(Customer customer) {
		boolean flag = false;
		try {
	
		Connection con = DBUtil.getDBConnection();
		String sql ="update customer_steven set name = ? where customer_id =?  ";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ps.setString(1, customer.getName());
		ps.setInt(2, customer.getCustomer_id());
		
		int n = ps.executeUpdate();
		
		if(n== 1)
			flag = true;
		
	}catch(SQLException e) {
		System.out.println("Insert Query not Executed");
	}
		
		
	return flag;
	}
	
	public Customer doFindCustomer(int id) {
		Customer customer = null;
		try {
			Connection con = DBUtil.getDBConnection();
		String sql ="select * from customer_steven where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			customer = new Customer();
			customer.setCustomer_id(id);
			customer.setName(rs.getString("name"));
			
		}
		}catch(SQLException e) {
		System.out.println("customer not found");
	}
		
		return customer;
	}
	
	public static List<Customer> doFindAll() {
		List<Customer>list= new LinkedList<>();		
		try {
			Connection con = DBUtil.getDBConnection();
		String sql = "select * from customer_steven";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Customer Customer = new Customer();
			
			Customer.setCustomer_id(rs.getInt("Customer_id"));
			Customer.setName(rs.getString("name"));
			
			
			list.add(Customer);
		}
		}catch(SQLException e) {
		System.out.println("Customer not found");
	}
		
		return list;
	}


	
}
