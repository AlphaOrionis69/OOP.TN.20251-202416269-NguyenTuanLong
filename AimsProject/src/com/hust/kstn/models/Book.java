package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<BookAuthor> authors = new ArrayList<>();
	private int numOfTokens;
	public Book(String title, double cost, String category, List<BookAuthor> authors, int numOfTokens) {
		super(title, cost, category);
		this.authors.addAll(authors);
		this.numOfTokens = numOfTokens;
	}
	public List<BookAuthor> getAuthors() {
		return new ArrayList<>(authors);
	}
	public int getNumOfTokens() {
		return numOfTokens;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("[%d]\nAuthors: ", numOfTokens) + authors;
	}
	
}
