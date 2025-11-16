package com.hust.kstn.test;

import java.util.List;
import java.util.ArrayList;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;
import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Track;

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
	public static final String[] CD_DIRECTORS = {"Dr. Elias Thorne", "Vivian Chen", "Marcus Vane", "Juno Six", "Hans Zimmer", 
			"Gustav Holst", "Alma Vega", "Kenji Soto", "Zara Khan", "David Lee"};
	public static final String[] CD_ARTISTS = {"Nova Rayne", "The Chronauts", "Ella Fitzgerald", "The Meridian Quartet", "KAI-209",
		    "The Rusty Wrenches", "Samira Jones", "Vicious Circle", "The London Philharmonic", "DJ Pulse"};
	public static final String[] CD_TITLES = {"Echoes of the Metropolis", "The Crystal Symphony", "Blue Riff", "Nova",
		    "Chronicles of Aethel", "Road to Redemption", "Electric Soul", "Stolen Moments", "Requiem for a Star", "The Seventh Seal"};
	public static final String[] CD_CATEGORIES = {"Electronic", "Synthwave", "Classical", "Jazz", "Pop", "Indie", "Soundtrack", "Score",
		    "Rock", "Blues", "Folk", "Metal", "Ambient", "Gospel"};
	public static final String[] CD_TRACK_TITLES = {"Neon Heartbeat", "Adagio in D Minor", "Midnight Serenade", "The Ascent", "Starlight Drive", 
			"Lament for the Fallen", "Blue Hour Shuffle", "Digital Silence", "Fading Light", "The Prophecy"};
	private static final Object generateRandomItems(Object[] arr) {
		int objID = (int)(Math.random()*arr.length);
		return arr[objID];
	}
	public static final DigitalVideoDisc[] generateRandomDigitalVideoDiscs(int totalNumber) {
		if (totalNumber == 0) {
			System.out.println("Please provide a positive integer\n");
		}
		DigitalVideoDisc[] discs = new DigitalVideoDisc[totalNumber];
		for (int i = 0; i < totalNumber; i++) {
			String director = (String)generateRandomItems(DVD_DIRECTORS);
			String title = (String)generateRandomItems(DVD_TITLES);
			String category = (String)generateRandomItems(DVD_CATEGORIES);
			double cost = Math.random()*50.0d + 5.0d;
			int length = (int)(Math.random()*60.0d) + 70;
			discs[i] = new DigitalVideoDisc(director, title, category, length, cost);
		}
		return discs;
	}
	public static final List<BookAuthor> generateRandomBookAuthors() {
		int totalNumber = (int)(Math.random()*10.0d) + 1;
		List<BookAuthor> authors = new ArrayList<>();
		for (int i = 0; i < totalNumber; i++) {
			// generate an author infos
			String bookAuthor = (String)generateRandomItems(BOOK_AUTHORS);		
			String bookAuthorShortBiography = (String)generateRandomItems(BOOK_AUTHOR_SHORT_BIOGRAPHIES);
			int yearOfBirth = (int)(Math.random()*215) + 1800;		
			authors.add(new BookAuthor(bookAuthor, yearOfBirth,
					bookAuthorShortBiography));
			
		}
		return authors;
	}
	public static final Book[] generateRandomBooks(int totalNumber) {
		if (totalNumber == 0) {
			System.out.println("Please provide a positive integer");
		}
		Book[] books = new Book[totalNumber];
		for (int i = 0; i < totalNumber; i++) {
			String title = (String)generateRandomItems(BOOK_TITLES);
			String category = (String)generateRandomItems(BOOK_CATEGORIES);
			double cost = Math.random()*50.0d + 5.0d;
			int numOfTokens = (int)(Math.random()*200.0) + 100;
			List<BookAuthor> authors = generateRandomBookAuthors();
			books[i] = new Book(title, category, cost, authors, numOfTokens);
		}
		return books;
	}
	public static final List<Track> generateRandomTracks() {
		int totalNumber = (int)(Math.random()*10.0d) + 1;
		List<Track> tracks = new ArrayList<>();
		for (int i = 0; i < totalNumber; i++) {
			// generate a track infos
			String title = (String)generateRandomItems(CD_TRACK_TITLES);				
			int length = (int)(Math.random()*600) + 300; // by seconds	
			tracks.add(new Track(title, length));		
		}
		return tracks;
	}
	public static final List<String> generateRandomStrings(String[] arr) {
		int totalNumber = (int)(Math.random()*10.0d) + 1;
		List<String> strings = new ArrayList<>();
		for (int i = 0; i < totalNumber; i++) {
			strings.add((String)generateRandomItems(arr));	
		}
		return strings;
	}
	public static final CompactDisc[] generateRandomCompactDiscs(int totalNumber) {
		if (totalNumber == 0) {
			System.out.println("Please provide a positive integer");
		}
		CompactDisc[] discs = new CompactDisc[totalNumber];
		for (int i = 0; i < totalNumber; i++) {
			String title = (String)generateRandomItems(CD_TITLES);
			String category = (String)generateRandomItems(CD_CATEGORIES);
			double cost = Math.random()*50.0d + 5.0d;
			List<String> directors = generateRandomStrings(CD_DIRECTORS);
			List<String> artists = generateRandomStrings(CD_ARTISTS);
			List<Track> tracks = generateRandomTracks();
			discs[i] = new CompactDisc(title, category, cost, artists, directors, tracks);
		}
		return discs;
	}
}
