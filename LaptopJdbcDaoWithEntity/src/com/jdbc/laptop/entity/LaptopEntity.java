package com.jdbc.laptop.entity;

public class LaptopEntity {
	private int id;
	private String color;
	private String brand;
	private int price;
	private String processor;
	private int screensize;
	private int weight;
	private boolean graphicard;
	private boolean screentouch;
	
	public LaptopEntity(int id, String color, String brand, int price, String processor, int screensize, int weight,
			boolean graphicard, boolean screentouch) {
		super();
		this.id = id;
		this.color = color;
		this.brand = brand;
		this.price = price;
		this.processor = processor;
		this.screensize = screensize;
		this.weight = weight;
		this.graphicard = graphicard;
		this.screentouch = screentouch;
	}
	

	public LaptopEntity() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getScreensize() {
		return screensize;
	}
	public void setScreensize(int screensize) {
		this.screensize = screensize;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isGraphicard() {
		return graphicard;
	}
	public void setGraphicard(boolean graphicard) {
		this.graphicard = graphicard;
	}
	public boolean isScreentouch() {
		return screentouch;
	}
	public void setScreentouch(boolean screentouch) {
		this.screentouch = screentouch;
	}
	
	
	

}
