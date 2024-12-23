package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEg6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//step1 = loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//step2 = making connection with database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		
		//step3 = Creating Statement
		String sql = "insert into steven_emp values(?,?,?,?)" ;
		PreparedStatement ps = con.prepareStatement(sql);
		
		//step4 = executing the query
		Object employee[][] = new Object[][] {
			{601, "aaa", 2000, 20},
			{602, "bbb", 3000, 20},
			{603, "ccc", 4000, 20},
			{604, "ddd", 5000, 20},
		};
		
		for(int i = 0; i<employee.length; i++) {
			ps.setInt(1, (Integer)employee[i][0]);
			ps.setString(2, (String)employee[i][1]);
			ps.setInt(3, (Integer)employee[i][2]);
			ps.setInt(4, (Integer)employee[i][3]);
			
			ps.addBatch();
		}
		
		ps.executeBatch();

		
		
		ps.close();
		con.close();
		
			
		}
	
	
		}

	


