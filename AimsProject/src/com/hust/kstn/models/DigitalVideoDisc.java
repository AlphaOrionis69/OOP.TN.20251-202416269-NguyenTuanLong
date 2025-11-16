package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {	
	private String director;
	private int length;
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public DigitalVideoDisc(String title, double cost, String category, int length, String director) {
		super(title, cost, category);
		this.length = length;
		this.director = director;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("[%d][%s]", length, director);
	}
	
}
