package com.javaoo.store;

public class Inventory {
	public static void produceReport(Item[] items) {
		int count = 0;
		System.out.println("Title\t\t\t\t|Price\t\t|Quantity");
		for(Item item:items) {
			System.out.println(item.getTitle() + "\t\t|" + item.getPrice() + "\t\t|" + item.getQuantity());
			count += item.getQuantity();
		}
		System.out.println("=========================");
		System.out.println("Total count: " + count);
		System.out.println("Total value of all items: " + items.length);
	}
}