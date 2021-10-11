package com.jdbc.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo {

	public static void main(String[] args) throws SQLException {

		String url="jdbc:mysql://localhost:3306/employees";
		String userName="root";
		String password="Shogi@461676";
		
		String userDetails="select * from employe_details;";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection(url,userName,password);
	    System.out.println("Connection established :"+url);
	    
	    Statement stmt=con.createStatement();
	    ResultSet rs=stmt.executeQuery(userDetails);
	    
	    while(rs.next()) {
	    System.out.println("ID :" +rs.getInt(1));
	    System.out.println("First Name :" +rs.getString(2));
	    System.out.println("Last Name :" +rs.getString(3));
	    System.out.println("Salary :" +rs.getDouble(4));
	    System.out.println("DOB :" +rs.getString(5));
	    System.out.println("City :" +rs.getString(6));
	    System.out.println("Email :" +rs.getString(7));
		}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				con.close();
              System.out.println("Connection closed");				
			}
			else {
				System.out.println("Connection is not closed");
			}
		}
	}

}

