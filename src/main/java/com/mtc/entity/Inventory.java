package com.mtc.entity;


public class Inventory {
	int id;
	String name;
	int price;
	
	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public Inventory(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
