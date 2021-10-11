package com.jdbc.LaptopJdbcDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaptopJdbcDAOImp implements LaptopJdbcDAO {

	@Override
	public void saveLaptopRecord() {
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="Shogi@461676";

		String saveLaptopDetails="insert laptops.laptopdetails value(6,'acer','blue',60000);";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			stmt.executeUpdate(saveLaptopDetails);
			System.out.println("laptop record Inserted");
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
	public void updateBrand() {
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="Shogi@461676";

		String updatelaptopBrand="update laptops.laptopdetails set brand = 'asus' where id =1;";

		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			stmt.executeUpdate(updatelaptopBrand);
			System.out.println("laptop brand is update");
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
	public void updateBrandAndPrice() {

		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="Shogi@461676";

		String updatelaptopBrandAndPrice="update laptops.laptopdetails set brand = 'asus',price=40000 where id =2;";

		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			stmt.executeUpdate(updatelaptopBrandAndPrice);
			System.out.println("laptop brand  and price is update");
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
	public void deletLaptopById() {
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="Shogi@461676";

		String deletelaptopDetails="delete from laptops.laptopdetails where id=6;";

		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			stmt.executeUpdate(deletelaptopDetails);
			System.out.println("one of the laptop Details deleted");
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
	public void readSingleRecordById() {
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="Shogi@461676";

		String readBrandByID="select brand from laptopdetails where id=2;";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery( readBrandByID );

			while(rs.next()) {

				System.out.println("Brand :" +rs.getString(1));
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
	public void readAllRecords() {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="Shogi@461676";

		String LaptopDetails="select * from laptops.laptopdetails;";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery( LaptopDetails);

			while(rs.next()) {
				System.out.println("ID :" +rs.getInt(1));
				System.out.println("brand :" +rs.getString(2));
				System.out.println("color :" +rs.getString(3));
				System.out.println("price :" +rs.getInt(4));
			
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
	public void readLaptopPriceById() {
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="Shogi@461676";

		String readPricelByID="select price from laptops.laptopdetails where id=5;";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery( readPricelByID);

			while(rs.next()) {

				System.out.println("price :" +rs.getString(1));
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
	public void readLaptopBrandAndPriceById() {
		
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="Shogi@461676";

		String readBrandByID="select brand ,price from laptopdetails where id=2;";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery( readBrandByID );

			while(rs.next()) {

				System.out.println("brand and price :" +rs.getInt(1));
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
	public void readLaptopcolorByID() {
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="Shogi@461676";

		String readColorByID="select color from laptopdetails where id=3;";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established :"+url);

			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery( readColorByID );

			while(rs.next()) {

				System.out.println("color :" +rs.getString(1));
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
