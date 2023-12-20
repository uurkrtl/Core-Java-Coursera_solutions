package com.javaoo.store;

import java.util.Date;

public class ClassicalCD extends Item {
	private String composer;
	private String[] performers = new String[5];
	private String recordingLocation ;
	private Date releaseDate;
	private int performerCount = 0;
	
	
	
	public ClassicalCD(String title, double price, int quantity, String composer, String[] performers, String recordingLocation, Date releaseDate) {
		super(title, price, quantity);
		this.composer = composer;
		this.recordingLocation = recordingLocation;
		this.releaseDate = releaseDate;
		for(String performer : performers)
			addPerformer(performer);
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getRecordingLocation() {
		return recordingLocation;
	}
	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public void addPerformer(String performer) {
		if (performers.length>performerCount) {
			performerCount++;
			performers[performerCount] = performer;
		}else {
			System.out.println("There is no room left for the Performer");
		}
	}
	
	public void showPerformers() {
		for (int i = 0; i<performerCount; i++) {
			if (performers[i]!=null) System.out.println(performers[i]);
		}
	}
}