package com.hust.kstn.test;

import java.util.List;
import java.util.ArrayList;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;
import com.hust.kstn.models.DigitalVideoDisc;

public class TestUtils {
	public static final String[] DVD_DIRECTORS = {"Christopher Nolan", "Steven Spielberg", "Quentin Tarantino", "James Cameron",
			"Ridley Scott", "Martin Scorsese", "Hayao Miyazaki", "Bong Joon-ho", "Denis Villeneuve", "Kathryn Bigelow", 
			"David Fincher", "Wes Anderson", "Zack Snyder", "Greta Gerwig", "Peter Jackson", "Lena Graves", "Victor Hale", "Aria Lee", 
			"Dominic Reed", "Mira Fallon", "Carter Voss", "Naomi Keene", "Roland Pierce", "Evelyn Hart", "Juno Mercer"};
	public static final String[] DVD_TITLES = {"Inception", "Interstellar", "Parasite", "The Matrix", "The Dark Knight", "Titanic",
			"Spirited Away", "Gladiator", "Avatar", "Whiplash", "La La Land", "The Godfather", "Starfall Odyssey", "Echoes of the Past", 
			"Silver Horizon", "Crimson Night", "Neon Rogue", "The Last Ember", "Iron Kingdom", "Blue Winter", "After the Storm",
			"Midnight Circuit", "Rivers of the Sun", "The Forgotten Planet"};
	public static final String[] DVD_CATEGORIES = {"Action", "Drama", "Comedy", "Thriller", "Horror", "Romance", "Animation",
			"Science Fiction", "Fantasy", "Adventure", "Mystery", "Musical", "Crime", "Historical", "Documentary",
			"Family", "War", "Biography"};
	public static final String[] BOOK_AUTHORS = {"Amelia Hart", "Rafael Medina", "Eleanor Wu", "Tomasz Novak", "Nadia Rousseau",
			"Harper Quinn", "D. K. Alvarez", "Mina Patel", "Prof. Lionel Briggs", "Aria Lee"};
	public static final String[] BOOK_TITLES = {"The Silent Orchard", "Clockwork Harbor", "Beneath the Paper Moon", "Glass & Iron",
			"Fragments of Light", "The Last Cartographer", "City of Echoes","Recipes for Leaving", "Algorithm & Soul", 
			"The Forgotten Planet"};
	public static final String[] BOOK_CATEGORIES = {"Literary Fiction", "Science Fiction", "Historical Fiction", "Fantasy","Poetry",
			"Adventure", "Mystery", "Contemporary Romance", "Nonfiction", "Young Adult"};
	public static final String[] BOOK_AUTHOR_SHORT_BIOGRAPHIES = {
			"Poet-turned-novelist exploring memory and place.",
		    "Engineer and speculative fiction writer focused on near-future tech.",
		    "Historian who weaves little-known 20th-century lives into intimate stories.",
		    "Folklore scholar reimagining mythic motifs for modern readers.",
		    "Emerging poet blending everyday detail with philosophical questions.",
		    "Travel writer whose maps are as much about people as places.",
		    "Former detective writing procedurals with moral complexity.",
		    "Food journalist writing tender stories about family and change.",
		    "Computer scientist and ethicist studying AI and society.",
		    "Storyteller focused on young protagonists facing big-choice worlds."
	};
	public static final DigitalVideoDisc[] generateRandomDiscs(int totalNumber) {
		if (totalNumber == 0) {
			System.out.println("Please provide a positive integer\n");
		}
		DigitalVideoDisc[] discs = new DigitalVideoDisc[totalNumber];
		for (int i = 0; i < totalNumber; i++) {
			int directorID = (int)(Math.random()*DVD_DIRECTORS.length);
			int titleID = (int)(Math.random()*DVD_TITLES.length);
			int categoryID = (int)(Math.random()*DVD_CATEGORIES.length);
			double cost = Math.random()*50.0d + 5.0d;
			int length = (int)(Math.random()*60.0d) + 70;
			discs[i] = new DigitalVideoDisc(DVD_TITLES[titleID], DVD_CATEGORIES[categoryID], DVD_DIRECTORS[directorID], length, cost);
		}
		return discs;
	}
	public static final List<BookAuthor> generateRandomBookAuthors() {
		int totalNumber = (int)(Math.random()*10.0d) + 1;
		List<BookAuthor> authors = new ArrayList<>();
		for (int i = 0; i < totalNumber; i++) {
			// generate an author infos
			int bookAuthorID = (int)(Math.random()*BOOK_AUTHORS.length);
			int bookAuthorShortBiographyID = (int)(Math.random()*BOOK_AUTHOR_SHORT_BIOGRAPHIES.length);
			int yearOfBirth = (int)(Math.random()*215) + 1800;		
			authors.add(new BookAuthor(BOOK_AUTHORS[bookAuthorID], yearOfBirth,
					BOOK_AUTHOR_SHORT_BIOGRAPHIES[bookAuthorShortBiographyID]));
		}
		return authors;
	}
	public static final Book[] generateRandomBooks(int totalNumber) {
		if (totalNumber == 0) {
			System.out.println("Please provide a positive integer");
		}
		Book[] books = new Book[totalNumber];
		for (int i = 0; i < totalNumber; i++) {
			int titleID = (int)(Math.random()*BOOK_TITLES.length);
			int categoryID = (int)(Math.random()*BOOK_CATEGORIES.length);
			double cost = Math.random()*50.0d + 5.0d;
			int numOfTokens = (int)(Math.random()*200.0) + 100;
			List<BookAuthor> authors = generateRandomBookAuthors();
			books[i] = new Book(BOOK_TITLES[titleID], BOOK_CATEGORIES[categoryID], cost, authors, numOfTokens);
		}
		return books;
	}
}
