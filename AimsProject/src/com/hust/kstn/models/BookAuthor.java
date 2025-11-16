package com.hust.kstn.models;

public class BookAuthor {
	private String fullName;
	private int yearOfBirth;
	private String shortBiography;
	public String getFullName() {
		return fullName;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public String getShortBiography() {
		return shortBiography;
	}
	public BookAuthor(String fullName, int yearOfBirth, String shortBiography) {
		this.fullName = fullName;
		this.yearOfBirth = yearOfBirth;
		this.shortBiography = shortBiography;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%d, %s)\n", fullName, yearOfBirth, shortBiography);
	}
}
