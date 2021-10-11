package com.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAOImp implements EmployeeDAO {

	@Override
	public void employeeAllDetails() {

		String url="jdbc:mysql://localhost:3306/employees";
		String userName="root";
		String password="Shogi@461676";

		String employeeAllDetails="select * from employe_details;";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(employeeAllDetails);

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
				try {
					con.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			else {
				System.out.println("Connection is not closed");
			}
		}

	}

	@Override
	public void updateEmployeeDetails() {

		String url="jdbc:mysql://localhost:3306/employees";
		String userName="root";
		String password="Shogi@461676";

		String updateEmployeeDetails="UPDATE employe_details SET city = 'Ujjain' WHERE id = 1;";

		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			stmt.executeUpdate(updateEmployeeDetails);
			System.out.println("Employee Details Updated");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			else {
				System.out.println("Connection is not closed");
			}
		}

	}

	@Override
	public void singleEmployeeDetailsByID() {

		String url="jdbc:mysql://localhost:3306/employees";
		String userName="root";
		String password="Shogi@461676";

		String singleEmployeeDetailsByID="select * from employe_details where id=3;";

		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(singleEmployeeDetailsByID);

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
				try {
					con.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			else {
				System.out.println("Connection is not closed");
			}
		}
	}

	@Override
	public void insertEmployeeDetails() {
		String url="jdbc:mysql://localhost:3306/employees";
		String userName="root";
		String password="Shogi@461676";

		String insertEmployeeDetails="insert employees.employe_details value(7,'Donal','Bhist',5000,'1989-06-19','Uganda','bhist@gmail.com');";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			stmt.executeUpdate(insertEmployeeDetails);
			System.out.println("Employee Details Inserted");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			else {
				System.out.println("Connection is not closed");
			}
		}



	}

	@Override
	public void deleteEmployeeDetails() {

		String url="jdbc:mysql://localhost:3306/employees";
		String userName="root";
		String password="Shogi@461676";

		String deleteEmployeeDetails="delete from employe_details where id=2;";

		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			stmt.executeUpdate(deleteEmployeeDetails);
			System.out.println("one of the Employee Details deleted");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			else {
				System.out.println("Connection is not closed");
			}
		}
	}

	@Override
	public void updateSalaryAndEmail() {

		String url="jdbc:mysql://localhost:3306/employees";
		String userName="root";
		String password="Shogi@461676";

		String updateSalaryAndEmail="UPDATE employe_details SET Salary =10000 , email='shamitashetty123@gmail.com' WHERE id = 5;";

		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			stmt.executeUpdate(updateSalaryAndEmail);
			System.out.println("Employee Salary and Email ID Updated");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			else {
				System.out.println("Connection is not closed");
			}
		}


	}

	@Override
	public void readSalaryByID() {

		String url="jdbc:mysql://localhost:3306/employees";
		String userName="root";
		String password="Shogi@461676";

		String readSalaryByID="select salary from employe_details where id=6;";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(readSalaryByID);

			while(rs.next()) {

				System.out.println("Salary :" +rs.getDouble(1));
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
				try {
					con.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			else {
				System.out.println("Connection is not closed");
			}
		}
	}

	@Override
	public void readEmailByID() {
		String url="jdbc:mysql://localhost:3306/employees";
		String userName="root";
		String password="Shogi@461676";

		String readEmailByID="select email from employe_details where id=5;";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(readEmailByID);

			while(rs.next()) {

				System.out.println("Email Id :" +rs.getString(1));
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
				try {
					con.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			else {
				System.out.println("Connection is not closed");
			}
		}
	}

	@Override
	public void readCityByID() {
		String url="jdbc:mysql://localhost:3306/employees";
		String userName="root";
		String password="Shogi@461676";

		String readCityByID="select city from employe_details where id=1;";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(readCityByID);

			while(rs.next()) {

				System.out.println("City :" +rs.getString(1));
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
				try {
					con.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			else {
				System.out.println("Connection is not closed");
			}
		}
	}

}
