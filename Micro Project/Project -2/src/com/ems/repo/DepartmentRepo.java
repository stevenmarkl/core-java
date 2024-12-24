package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.ems.model.Department;
import com.ems.util.DBUtil;

public class DepartmentRepo {

	public boolean doInsertDepartment(Department department) {
		
	boolean flag = false;
		try {
	
		Connection con = DBUtil.getDBConnection();
		String sql ="insert into steven_dept values(?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		
		ps.setInt(1, department.getDid());
		ps.setString(2, department.getDname());
		
		int n = ps.executeUpdate();
		if(n== 1)
			flag = true;
		
	}catch(SQLException e) {
		System.out.println("Insert Query not Executed");
	}
		
		
	return flag;
	}

	
	
	public boolean doDeleteDepartment(int id) {
		boolean flag =false;
		try {
	
		Connection con = DBUtil.getDBConnection();
		String sql ="delete steven_dept where did = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		int n = ps.executeUpdate();
		if(n== 1)
			flag = true;
		
	}catch(SQLException e) {
		System.out.println("delete Query not Executed");
	}
		
		
	return flag;}

	
	public boolean doUpdateDepartment(Department department) {
		boolean flag = false;
		try {
	
		Connection con = DBUtil.getDBConnection();
		String sql ="update steven_dept set dname = ? where did =?  ";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ps.setString(1, department.getDname());
		ps.setInt(2, department.getDid());
		
		int n = ps.executeUpdate();
		
		if(n== 1)
			flag = true;
		
	}catch(SQLException e) {
		System.out.println("Insert Query not Executed");
	}
		
		
	return flag;
	
}
	
	
		
	public Department doFindDepartment(int id) {
		Department department = null;
		try {
			Connection con = DBUtil.getDBConnection();
		String sql ="select * from steven_dept where did = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			department = new Department();
			department.setDid(rs.getInt("did"));
			department.setDname(rs.getString("dname"));
			
		}
		}catch(SQLException e) {
		System.out.println("department not found");
	}
		
		return department;
	}
	

	public List<Department> doFindAll() {
		List<Department>list= new LinkedList<>();		
		try {
			Connection con = DBUtil.getDBConnection();
		String sql = "select * from steven_dept";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Department department = new Department();
			
			department.setDname(rs.getString("dname"));
			
			
			list.add(department);
		}
		}catch(SQLException e) {
		System.out.println("department not found");
	}
		
		return list;
	}


	}
