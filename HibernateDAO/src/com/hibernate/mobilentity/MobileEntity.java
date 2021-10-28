package com.hibernate.mobilentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "mobilentity.mobile")
@Entity
public class MobileEntity {

	@Id
	@Column(name = "mobileId")
	private int mobileId;

	@Column(name = "mobileBrand")
	private String mobileBrand;

	@Column(name = "mobilePrice")
	private double price;

	@Column(name = "rom")
	private int rom;

	@Column(name = "color")
	private String color;

	public MobileEntity() {
		super();
	}

	public MobileEntity(int mobileId, String mobileBrand, double price, int rom, String color) {
		super();
		this.mobileId = mobileId;
		this.mobileBrand = mobileBrand;
		this.price = price;
		this.rom = rom;
		this.color = color;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "MobileEntity [mobileId=" + mobileId + ", mobileBrand=" + mobileBrand + ", price=" + price + ", rom="
				+ rom + ", color=" + color + "]";
	}

}
