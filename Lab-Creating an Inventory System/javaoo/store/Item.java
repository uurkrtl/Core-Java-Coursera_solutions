//Created by Ugur Kartal
//https://www.coursera.org/learn/object-oriented-hierarchies-java/ungradedLab/MXtZx/creating-an-inventory-system-part-1

package com.javaoo.store;

public class Item {
	private String title;
	private double price;
	private int quantity;
	
	public Item() {
		
	}
	
	public Item(String title, double price, int quantity) {
		this.setTitle(title);
		this.setPrice(price);
		this.setQuantity(quantity);
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
