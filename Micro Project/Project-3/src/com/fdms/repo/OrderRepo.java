package com.fdms.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.fdms.model.Customer;
import com.fdms.model.Order;
import com.fdms.util.DBUtil;

public class OrderRepo {

	public boolean doInsertOrder(Order order) {

		boolean flag = false;
		try {

			Connection con = DBUtil.getDBConnection();
			String sql = "insert into Order_steven values(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, order.getOrderid());
			ps.setInt(2, order.getCustomerid());
			ps.setString(3, order.getOrderdate());
			ps.setInt(4, order.getAmount());

			int n = ps.executeUpdate();
			if (n == 1)
				flag = true;

		} catch (SQLException e) {
			System.out.println("Insert Query not Executed");
		}

		return flag;
	}

	public boolean doDeleteorder(int id) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getDBConnection();
			String sql = "delete order_steven where order_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int n = ps.executeUpdate();
			if (n == 1)
				flag = true;

		} catch (SQLException e) {
			System.out.println("delete Query not Executed");
		}

		return flag;
	}

	public boolean doUpdateOrder(Order order) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getDBConnection();
			String sql = "update order_steven set order_date = ?, total_amount =? where customer_id =?  ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, order.getOrderdate());
			ps.setInt(2, order.getAmount());

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;

		} catch (SQLException e) {
			System.out.println("Insert Query not Executed");
		}

		return flag;
	}

//
	public Order doFindOrder(int id) {
		Order order = null;

		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from order_steven where order_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				order = new Order();

				order.setOrderid(rs.getInt("order_id"));
				order.setCustomerid(rs.getInt("customer_id"));
				order.setOrderdate(rs.getString("order_date"));
				order.setAmount(rs.getInt("total_amount"));

			}
		} catch (SQLException e) {
			System.out.println("order not found");
		}

		return order;
	}

//
	public static List<Order> doFindAllOrder() {
		List<Order> list = new LinkedList<>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from order_steven";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Order order = new Order();
				order.setOrderid(rs.getInt("order_id"));
				order.setCustomerid(rs.getInt("customer_id"));
				order.setOrderdate(rs.getString("order_date"));
				order.setAmount(rs.getInt("total_amount"));

				list.add(order);
			}
		} catch (SQLException e) {
			System.out.println("Order not found");
		}

		return list;
	}

}
