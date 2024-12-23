package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEg1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//step1 = loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//step2 = making connection with database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		
		//step3 = Creating Statement
		String sql = "insert into steven_emp values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//step4 = executing the query
		ps.setInt(1, 252);
		ps.setString(2, "partha");
		ps.setInt(3, 50);
		ps.setInt(4, 20);
		
		int n = ps.executeUpdate(); //insert, delete, update
		
		if( n==1 ) {
			System.out.println("inserted");
		}else {
			System.out.println("not inserted");
				}
		
		ps.close();
		con.close();
		
			
		}
	
	
		}

	


