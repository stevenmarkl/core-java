package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcEg4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//step1 = loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//step2 = making connection with database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		
		//step3 = Creating Statement
		String sql = "select * from steven_emp" ;
		PreparedStatement ps = con.prepareStatement(sql);
		
		//step4 = executing the query
		ResultSet rs = ps.executeQuery(); //select
		ResultSetMetaData rsData = rs.getMetaData();
		System.out.println(rsData.getColumnCount());
		for(int i = 1; i<= rsData.getColumnCount(); i++) {
			System.out.println(rsData.getColumnName(i));
		}
		while(rs.next()) {
			System.out.println(rs.getInt("eid") + " " + rs.getString("ename") + " " + rs.getInt("esalary"));
		}
		
		
		ps.close();
		con.close();
		rs.close();
			
		}
	
	
		}

	


