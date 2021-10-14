package com.jdbc.LaptopDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.laptop.entity.LaptopEntity;
import com.jdbc.laptopconnection.ConnectionEstablish;

public class LaptopDAOImp implements LaptopDAO {

	@Override
	public void saveLaptopRecord(LaptopEntity laptopEntity ) {

		String saveLaptopDetails="insert laptops.lapdetails value(?,?,?,?,?,?,?,?,?);";

		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement pstmt=cn.prepareStatement(saveLaptopDetails);
            pstmt.setInt(1,laptopEntity.getId());
            pstmt.setString(2,laptopEntity.getColor());
            pstmt.setString(3, laptopEntity.getBrand());
            pstmt.setInt(4,laptopEntity.getPrice());
            pstmt.setString(5, laptopEntity.getProcessor());
            pstmt.setInt(6, laptopEntity.getScreensize());
            pstmt.setInt(7, laptopEntity.getWeight());
            pstmt.setBoolean(8, laptopEntity.isGraphicard());
            pstmt.setBoolean(9, laptopEntity.isScreentouch());
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
	public void updateBrand(LaptopEntity laptopEntity) {

		String updatelaptopBrand="update laptops.lapdetails set brand = ? where id =?";
		try {
			System.out.println("Connection established :");
			Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement pstmt=cn.prepareStatement(updatelaptopBrand);
            pstmt.setString(1, laptopEntity.getBrand());
            pstmt.setInt(2,laptopEntity.getId());
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
	public void updateBrandAndPrice(LaptopEntity laptopEntity) {

		String updatelaptopBrandAndPrice="update laptops.lapdetails set brand = ? ,price=? where id =?;";

		try {

			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement pstmt=cn.prepareStatement(updatelaptopBrandAndPrice);
            pstmt.setString(1,laptopEntity.getBrand());
            pstmt.setInt(2,laptopEntity.getPrice());
            pstmt.setInt(3,laptopEntity.getId());
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
	public void deletLaptopById(LaptopEntity laptopEntity) {

		String deletelaptopDetails="delete from laptops.lapdetails where id=?;";

		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement stmt=cn.prepareStatement(deletelaptopDetails);
            stmt.setInt(1,laptopEntity.getId());
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
	public void readSingleRecordById(LaptopEntity laptopEntity) {

		String readBrandByID="select brand from lapdetails where id=?;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement stmt=cn.prepareStatement(readBrandByID);
            stmt.setInt(1, laptopEntity.getId());
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
	public void readAllRecords(LaptopEntity laptopEntity) {

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
				System.out.println("processor :" +rs.getString(5));
				System.out.println("Screensize :" +rs.getInt(6));
				System.out.println("weight :" +rs.getInt(7));
				System.out.println("graphicard :" +rs.getBoolean(8));
				System.out.println("screentouch :" +rs.getBoolean(9));
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
	public void readLaptopPriceById(LaptopEntity laptopEntity) {

		String readPricelByID="select price from laptops.lapdetails where id=?;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement stmt=cn.prepareStatement(readPricelByID);  
            stmt.setInt(1,laptopEntity.getId());
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
	public void readLaptopBrandAndPriceById(LaptopEntity laptopEntity) {
		String readLaptopBrandAndPriceById="select brand ,price from lapdetails where id=?;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement stmt=cn.prepareStatement(readLaptopBrandAndPriceById);
            stmt.setInt(1, laptopEntity.getId());
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
	public void readLaptopcolorByID(LaptopEntity laptopEntity) {

		String readColorByID="select color from lapdetails where id=?;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getConnection();
            PreparedStatement stmt=cn.prepareStatement(readColorByID);
            stmt.setInt(1, laptopEntity.getId());
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
