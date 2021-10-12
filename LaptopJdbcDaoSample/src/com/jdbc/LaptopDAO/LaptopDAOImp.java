package com.jdbc.LaptopDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.laptopconnection.ConnectionEstablish;

public class LaptopDAOImp implements LaptopDAO {

	@Override
	public void saveLaptopRecord() {

		String saveLaptopDetails="insert laptops.lapdetails value(9,'gold','Aspire',10000);";

		try {
			System.out.println("Connection established :");
			Statement stmt=ConnectionEstablish.getConnection().createStatement();
			stmt.executeUpdate(saveLaptopDetails);
			System.out.println("laptop record Inserted");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateBrand() {

		String updatelaptopBrand="update laptops.lapdetails set brand = 'SonyMast' where id =5;";
		try {

			System.out.println("Connection established :");
			Statement stmt=ConnectionEstablish.getConnection().createStatement();
			stmt.executeUpdate(updatelaptopBrand);
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
	public void updateBrandAndPrice() {

		String updatelaptopBrandAndPrice="update laptops.lapdetails set brand = 'Apple',price=100000 where id =2;";

		try {

			System.out.println("Connection established :");

			Statement stmt=ConnectionEstablish.getConnection().createStatement();
			stmt.executeUpdate(updatelaptopBrandAndPrice);
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
	public void deletLaptopById() {

		String deletelaptopDetails="delete from laptops.lapdetails where id=1;";

		try {
			System.out.println("Connection established :");

			Statement stmt=ConnectionEstablish.getConnection().createStatement();
			stmt.executeUpdate(deletelaptopDetails);
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
	public void readSingleRecordById() {

		String readBrandByID="select brand from lapdetails where id=2;";
		try {
			System.out.println("Connection established :");

			Statement stmt=ConnectionEstablish.getConnection().createStatement();
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
	}

	@Override
	public void readAllRecords() {

		String LaptopDetails="select * from laptops.lapdetails;";
		try {
			System.out.println("Connection established :");

			Statement stmt=ConnectionEstablish.getConnection().createStatement();
			ResultSet rs=stmt.executeQuery(LaptopDetails);

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
	public void readLaptopPriceById() {

		String readPricelByID="select price from laptops.lapdetails where id=5;";
		try {
			System.out.println("Connection established :");

			Statement stmt=ConnectionEstablish.getConnection().createStatement();
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
	}

	@Override
	public void readLaptopBrandAndPriceById() {
		String readBrandByID="select brand ,price from lapdetails where id=7;";
		try {
			System.out.println("Connection established :");

			Statement stmt=ConnectionEstablish.getConnection().createStatement();
			ResultSet rs=stmt.executeQuery( readBrandByID );

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
	public void readLaptopcolorByID() {

		String readColorByID="select color from lapdetails where id=3;";
		try {
			System.out.println("Connection established :");

			Statement stmt=ConnectionEstablish.getConnection().createStatement();
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
		ConnectionEstablish.getCloseConnection();
	}

}
