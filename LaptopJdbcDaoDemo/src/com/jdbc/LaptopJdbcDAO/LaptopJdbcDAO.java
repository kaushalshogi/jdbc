package com.jdbc.LaptopJdbcDAO;

public interface LaptopJdbcDAO {

	void saveLaptopRecord();
	
	void  updateBrand();
	
	void updateBrandAndPrice();
	
	void deletLaptopById();
	
	void readSingleRecordById();
	
	void readAllRecords();
	
	void readLaptopPriceById();
	
	void readLaptopBrandAndPriceById();
	
	void readLaptopcolorByID();
}
