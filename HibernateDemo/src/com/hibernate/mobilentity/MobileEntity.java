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
	private double mobilePrice;

	@Column(name = "rom")
	private int rom;

	@Column(name = "color")
	private String color;

	
	public MobileEntity() {
		super();
	}

	public MobileEntity(int mobileId, String mobileBrand, double mobilePrice, int rom, String color) {
		super();
		this.mobileId = mobileId;
		this.mobileBrand = mobileBrand;
		this.mobilePrice = mobilePrice;
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

	public double getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(double mobilePrice) {
		this.mobilePrice = mobilePrice;
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
		return "MobileEntity [mobileId=" + mobileId + ", mobileBrand=" + mobileBrand + ", mobilePrice=" + mobilePrice
				+ ", rom=" + rom + ", color=" + color + "]";
	}

	
}
