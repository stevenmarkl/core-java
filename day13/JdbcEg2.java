package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEg2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//step1 = loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//step2 = making connection with database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		
		//step3 = Creating Statement
		String sql = "delete steven_emp where eid = ?" ;
		PreparedStatement ps = con.prepareStatement(sql);
		
		//step4 = executing the query
		ps.setInt(1, 252);
		
		
		int n = ps.executeUpdate(); //insert, delete, update
		
		if( n==1 ) {
			System.out.println("deleted");
		}else {
			System.out.println("not deleted");
				}
		
		ps.close();
		con.close();
		
			
		}
	
	
		}

	


