//Created by Ugur Kartal
//https://www.coursera.org/learn/object-oriented-hierarchies-java/ungradedLab/MXtZx/creating-an-inventory-system-part-1

package com.javaoo.store;

import java.util.Date;

public class CD extends Item {
	private Artist artist;
	private Date releaseDate;
	
	public CD(String title, double price, int quantity, Artist artist, Date releaseDate) {
		super(title, price, quantity);
		this.setArtist(artist);
		this.setReleaseDate(releaseDate);
	}
	
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	

}
