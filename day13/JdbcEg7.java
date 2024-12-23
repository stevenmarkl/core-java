package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEg7 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//step1 = loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//step2 = making connection with database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		
		//step3 = Creating Statement
		String sql = "insert into steven_emp values(?,?,?,?)" ;
		PreparedStatement ps = con.prepareStatement(sql);
		
		//step4 = executing the query
		ps.setInt(1,  501);
		ps.setString(2, "Sundar");
		ps.setInt(3,  5000);
		ps.setInt(4, 20);
		ps.addBatch();		
		
		ps.setInt(1,  502);
		ps.setString(2, "valan");
		ps.setInt(3,  4000);
		ps.setInt(4, 20);
		ps.addBatch();	
		
		ps.executeBatch();
		
		
		ps.close();
		con.close();
		
			
		}
	
	
		}

	


