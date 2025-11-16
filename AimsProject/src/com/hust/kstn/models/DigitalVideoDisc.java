package com.hust.kstn.models;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private double cost;
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public double getCost() {
		return cost;
	}
	public DigitalVideoDisc(String title) {
		this.id = ++nbDigitalVideoDiscs; 
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category, double cost) {
		this.id = ++nbDigitalVideoDiscs; 
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, double cost) {
		this.id = ++nbDigitalVideoDiscs; 
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
		this.id = ++nbDigitalVideoDiscs; 
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	
}
