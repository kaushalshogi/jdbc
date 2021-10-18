package com.jdbc.laptopconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEstablish {

	private static Connection connection = null;

	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptops", "root", "Shogi@461676");
			System.out.println("connection is sucessfully created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		if (connection != null) {
			return connection;
		} else {
			System.out.println("connection is not created");
			return connection;
		}
	}

	public static void getCloseConnection() {
		try {
			if (connection != null) {
				connection.close();
				System.out.println("Connection is closed");
			} else {
				System.out.println("Connection is not closed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
