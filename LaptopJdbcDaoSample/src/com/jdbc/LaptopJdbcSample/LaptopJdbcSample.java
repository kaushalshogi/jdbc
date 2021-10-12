package com.jdbc.LaptopJdbcSample;

import com.jdbc.LaptopDAO.LaptopDAOImp;

public class LaptopJdbcSample {

	public static void main(String[] args) {

		LaptopDAOImp imp=new LaptopDAOImp(); 
		
		//imp.saveLaptopRecord();
		
		//imp.updateBrand();
		
		//imp.updateBrandAndPrice();
		
		//imp.deletLaptopById();
		
		//imp.readSingleRecordById();
		
		imp.readAllRecords();
		
		imp.readLaptopPriceById();
		
		imp.readLaptopBrandAndPriceById();
		
		imp.readLaptopcolorByID();
	}

}
