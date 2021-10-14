package com.jdbc.LaptopJdbcSample;

import java.lang.reflect.Constructor;

import com.jdbc.LaptopDAO.LaptopDAOImp;
import com.jdbc.laptop.entity.LaptopEntity;

public class LaptopJdbcTest {

	public static void main(String[] args) {

		LaptopDAOImp imp=new LaptopDAOImp(); 

		//LaptopEntity laptopEntity=new LaptopEntity(11,"Bronze","Samsung",36000,"AMD",15,110,true,false);
		//imp.saveLaptopRecord(laptopEntity);
		//imp.saveLaptopRecord(10,"Yellow","asus",34000);


		//		LaptopEntity le=new LaptopEntity();
		//		le.setBrand("jst");
		//		le.setId(1);
		//		imp.updateBrand(le);

		//		LaptopEntity le=new LaptopEntity();
		//		le.setBrand("HP Sonia");
		//		le.setPrice(470000);
		//		le.setId(9);
		//		imp.updateBrandAndPrice(le);

		//		LaptopEntity le=new LaptopEntity();
		//		le.setId(1);
		//		imp.deletLaptopById(le);

		//		LaptopEntity le=new LaptopEntity();
		//		le.setId(4);
		//		imp.readSingleRecordById(le);

		//		LaptopEntity le=new LaptopEntity();  
		//        imp.readAllRecords(le);

		//		LaptopEntity le=new LaptopEntity();
		//		le.setId(2);
		//		imp.readLaptopPriceById(le);

		//		LaptopEntity le=new LaptopEntity();
		//		le.setId(6);
		//		imp.readLaptopBrandAndPriceById(le);

		//		LaptopEntity le=new LaptopEntity();
		//		le.setId(2);
		//		imp.readLaptopcolorByID(le);
	}

}
