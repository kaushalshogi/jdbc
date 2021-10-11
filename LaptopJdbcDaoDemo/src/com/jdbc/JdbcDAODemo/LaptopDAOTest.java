package com.jdbc.JdbcDAODemo;

import com.jdbc.LaptopJdbcDAO.LaptopJdbcDAOImp;

public class LaptopDAOTest {
	public static void main(String args) {
		
		LaptopJdbcDAOImp laptop= new LaptopJdbcDAOImp();
		
		laptop.readAllRecords();
		
		//laptop.deletLaptopById();
		
		//laptop.readLaptopBrandAndPriceById();
		
		//laptop.readLaptopcolorByID();
		
		//laptop.readLaptopPriceById();
		
		//laptop.readSingleRecordById();
		
		//laptop.saveLaptopRecord();
		
		//laptop.updateBrand();
		
		//laptop.updateBrandAndPrice();
		
		
	}

}
