package com.SQLServer2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerCOnnection {

	public static void main(String[] args) throws ClassNotFoundException{
		try {
			String connectionUrl = "jdbc:sqlserver://WIN2019;Databases=ComputerStorageSolutions;integratedSecurity=true;encrypt=false";
		Connection conn = DriverManager.getConnection(connectionUrl);
		System.out.println("The connection has been successfully established. Wonderfully very good job!");
		
		}
		catch(SQLException e) {
			System.out.println("Very Very good.... Connection Failed! ");
			e.printStackTrace();
		}

	}
}
