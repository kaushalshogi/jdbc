package com.jdbc.LaptopDAO;

public interface LaptopDAO {

	void saveLaptopRecord(int id, String color, String brand, int price);

	void  updateBrand(String brand,int id);

	void updateBrandAndPrice(String brand,int price, int id);

	void deletLaptopById(int id);

	void readSingleRecordById(int id);

	void readAllRecords();

	void readLaptopPriceById(int id);

	void readLaptopBrandAndPriceById(int id);

	void readLaptopcolorByID(int id);


	

	

}
