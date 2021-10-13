package com.jdbc.LaptopDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.laptopconnection.ConnectionEstablish;

public class LaptopDAOImp implements LaptopDAO {

	@Override
	public void saveLaptopRecord(int id,String color,String brand,int price) {

		String saveLaptopDetails="insert laptops.lapdetails value(?,?,?,?);";

		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement pstmt=cn.prepareStatement(saveLaptopDetails);
            pstmt.setInt(1, id);
            pstmt.setString(2, color);
            pstmt.setString(3, brand);
            pstmt.setInt(4,price);
            pstmt.executeUpdate();
			System.out.println("laptop record row Inserted");
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateBrand(String brand,int id) {

		String updatelaptopBrand="update laptops.lapdetails set brand = ? where id =?";
		try {
			System.out.println("Connection established :");
			Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement pstmt=cn.prepareStatement(updatelaptopBrand);
            pstmt.setString(1, brand);
            pstmt.setInt(2,id);
			pstmt.executeUpdate();
			System.out.println("laptop brand is update");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateBrandAndPrice(String brand,int price, int id) {

		String updatelaptopBrandAndPrice="update laptops.lapdetails set brand = ? ,price=? where id =?;";

		try {

			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement pstmt=cn.prepareStatement(updatelaptopBrandAndPrice);
            pstmt.setString(1,brand);
            pstmt.setInt(2,price);
            pstmt.setInt(3,id);
            pstmt.executeUpdate();
			System.out.println("laptop brand  and price is update");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deletLaptopById(int id) {

		String deletelaptopDetails="delete from laptops.lapdetails where id=?;";

		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement stmt=cn.prepareStatement(deletelaptopDetails);
            stmt.setInt(1, id);
            stmt.executeUpdate();
			System.out.println("one of the laptop Details deleted");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void readSingleRecordById(int id) {

		String readBrandByID="select brand from lapdetails where id=?;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement stmt=cn.prepareStatement(readBrandByID);
            stmt.setInt(1, id);
            ResultSet rs=stmt.executeQuery();

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
	}

	@Override
	public void readAllRecords() {

		String LaptopDetails="select * from laptops.lapdetails;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement stmt=cn.prepareStatement(LaptopDetails);
            ResultSet rs=stmt.executeQuery();

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
	}

	@Override
	public void readLaptopPriceById(int id) {

		String readPricelByID="select price from laptops.lapdetails where id=?;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement stmt=cn.prepareStatement(readPricelByID);  
            stmt.setInt(1, id);
			ResultSet rs=stmt.executeQuery();

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
	}

	@Override
	public void readLaptopBrandAndPriceById(int id) {
		String readLaptopBrandAndPriceById="select brand ,price from lapdetails where id=?;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement stmt=cn.prepareStatement(readLaptopBrandAndPriceById);
            stmt.setInt(1, id);
            ResultSet rs=stmt.executeQuery();

			while(rs.next()) {
				System.out.println("brand :" +rs.getString(1));
				System.out.println("price:" +rs.getInt(2));
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readLaptopcolorByID(int id) {

		String readColorByID="select color from lapdetails where id=?;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement stmt=cn.prepareStatement(readColorByID);
            stmt.setInt(1, id);
            ResultSet rs=stmt.executeQuery();

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
		ConnectionEstablish.getCloseConnection();
	}

}
