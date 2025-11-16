package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private static int nbBooks = 0;
	private int id;
	private String title;
	private String category;
	private double cost;
	private List<BookAuthor> authors = new ArrayList<>();
	private int numOfTokens;
	public Book(String title, String category, double cost, List<BookAuthor> authors, int numOfTokens) {
		this.id = ++nbBooks;
		this.title = title;
		this.category = category;
		this.cost = cost;
		
		this.authors.addAll(authors);
		this.numOfTokens = numOfTokens;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public double getCost() {
		return cost;
	}
	public List<BookAuthor> getAuthors() {
		return authors;
	}
	public int getNumOfTokens() {
		return numOfTokens;
	}
	
	@Override
	public String toString() {
		return String.format("Book[%d][%s][%.2f][%s][%d]\nAuthors: ", id, title, cost, category, numOfTokens) + authors;
	}
	
}
