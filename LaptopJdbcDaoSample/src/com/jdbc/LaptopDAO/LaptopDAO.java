package com.jdbc.LaptopDAO;

public interface LaptopDAO {

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
