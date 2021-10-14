package com.jdbc.LaptopDAO;

import com.jdbc.laptop.entity.LaptopEntity;

public interface LaptopDAO {

	void saveLaptopRecord(LaptopEntity laptopEntity);

	void  updateBrand(LaptopEntity laptopEntity);

	void updateBrandAndPrice(LaptopEntity laptopEntity);

	void deletLaptopById(LaptopEntity laptopEntity);

	void readSingleRecordById(LaptopEntity laptopEntity);

	void readAllRecords(LaptopEntity laptopEntity);

	void readLaptopPriceById(LaptopEntity laptopEntity);

	void readLaptopBrandAndPriceById(LaptopEntity laptopEntity);

	void readLaptopcolorByID(LaptopEntity laptopEntity);


	

	

}
