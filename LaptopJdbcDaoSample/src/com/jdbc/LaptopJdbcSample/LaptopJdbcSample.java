package com.jdbc.LaptopJdbcSample;

import com.jdbc.LaptopDAO.LaptopDAOImp;

public class LaptopJdbcSample {

	public static void main(String[] args) {

		LaptopDAOImp imp=new LaptopDAOImp(); 

		//imp.saveLaptopRecord(10,"Yellow","asus",34000);

		//imp.updateBrand("HDMI",2);

		//imp.updateBrandAndPrice("Mac",15000,2);

		//imp.deletLaptopById(10);

		//imp.readSingleRecordById(6);

		imp.readAllRecords();

		imp.readLaptopPriceById(2);

		imp.readLaptopBrandAndPriceById(7);

		imp.readLaptopcolorByID(2);
	}

}
