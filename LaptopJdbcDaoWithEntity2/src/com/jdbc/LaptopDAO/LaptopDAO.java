package com.jdbc.LaptopDAO;

import java.util.List;

import com.jdbc.laptop.entity.LaptopEntity;

public interface LaptopDAO {

	void saveLaptopRecord(LaptopEntity laptopEntity);

	void updateBrand(LaptopEntity laptopEntity);

	void updateBrandAndPrice(LaptopEntity laptopEntity);

	void deletLaptopById(LaptopEntity laptopEntity);

	LaptopEntity readSingleRecordById(LaptopEntity laptopEntity);

	List<LaptopEntity> readAllRecords();

	void readLaptopPriceById(LaptopEntity laptopEntity);

	void readLaptopBrandAndPriceById(LaptopEntity laptopEntity);

	void readLaptopcolorByID(LaptopEntity laptopEntity);

}
