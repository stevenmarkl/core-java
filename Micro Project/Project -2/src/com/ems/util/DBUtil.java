package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() {
		Connection con = null;
		try {
			// step1 = loading driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// step2 = making connection with database
			con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training",
					"Celcom123");
		} catch (ClassNotFoundException e) {
			System.out.println("Could not load the driver");
		} catch (SQLException e) {
			System.out.println("Could not connect with thw database");
		}
		return con;
	}

}
