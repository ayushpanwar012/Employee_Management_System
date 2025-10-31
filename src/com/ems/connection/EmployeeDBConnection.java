package com.ems.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeDBConnection {
	
	public static Connection getConnection() {
		Connection connection =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
