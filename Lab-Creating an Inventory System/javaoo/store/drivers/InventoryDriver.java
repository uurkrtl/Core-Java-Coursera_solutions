//Created by Ugur Kartal
//https://www.coursera.org/learn/object-oriented-hierarchies-java/ungradedLab/MXtZx/creating-an-inventory-system-part-1

package com.javaoo.store.drivers;

import java.util.Date;

import com.javaoo.store.Artist;
import com.javaoo.store.Book;
import com.javaoo.store.CD;
import com.javaoo.store.Item;

public class InventoryDriver {

	public static void main(String[] args) {
		Item[] myInventory = new Item[50];
		myInventory[0] = new Book("Nightcrawling: A Novel", 11.99, 30, "Leila Mottley", "Oprah's Book Club", "Literatur & Belletristik");
		myInventory[1] = new Book("The House in the Pines", 12.99, 20, "Ana Reyes", "A Novel", "Genres Mystery, Thriller & Spannung");
		myInventory[2] = new Book("The Quarry Girls", 10.79, 10, "Jess Lourey", "A Thriller", "Genres Mystery, Thriller & Spannung");
		myInventory[3] = new Book("Every Summer After", 9.00, 8, "Carley Fortune", "Oprah's Book Club", "Literatur & Belletristik");
		myInventory[4] = new Book("The Lost Bookshop", 2.99, 40, "Evie Woods", "A Thriller", "Literarische Belletristik for Frauen");
		
		myInventory[5] = new CD("Going For The One", 12.95, 4, new Artist("YES"), new Date("07/07/1977"));
		myInventory[6] = new CD("Going Down The Country", 12.95, 10, new Artist("Bozos"), new Date("09/07/1987"));
		myInventory[7] = new CD("Polka Favorites", 2.95, 4, new Artist("Jimmy and the Yuppers"), new Date("07/07/1955"));
	}
}
