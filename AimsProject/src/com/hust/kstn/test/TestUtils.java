package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;

public class TestUtils {
	public static final String[] DIRECTORS = {"Christopher Nolan", "Steven Spielberg", "Quentin Tarantino", "James Cameron",
			"Ridley Scott", "Martin Scorsese", "Hayao Miyazaki", "Bong Joon-ho", "Denis Villeneuve", "Kathryn Bigelow", 
			"David Fincher", "Wes Anderson", "Zack Snyder", "Greta Gerwig", "Peter Jackson", "Lena Graves", "Victor Hale", "Aria Lee", 
			"Dominic Reed", "Mira Fallon", "Carter Voss", "Naomi Keene", "Roland Pierce", "Evelyn Hart", "Juno Mercer"};
	public static final String[] TITLES = {"Inception", "Interstellar", "Parasite", "The Matrix", "The Dark Knight", "Titanic",
			"Spirited Away", "Gladiator", "Avatar", "Whiplash", "La La Land", "The Godfather", "Starfall Odyssey", "Echoes of the Past", 
			"Silver Horizon", "Crimson Night", "Neon Rogue", "The Last Ember", "Iron Kingdom", "Blue Winter", "After the Storm",
			"Midnight Circuit", "Rivers of the Sun", "The Forgotten Planet"};
	public static final String[] CATEGORIES = {"Action", "Drama", "Comedy", "Thriller", "Horror", "Romance", "Animation",
			"Science Fiction", "Fantasy", "Adventure", "Mystery", "Musical", "Crime", "Historical", "Documentary",
			"Family", "War", "Biography"};
	public static final DigitalVideoDisc[] generateRandomDiscs(int totalNumber) {
		if (totalNumber == 0) {
			System.out.println("Please provide a positive integer\n");
		}
		DigitalVideoDisc[] discs = new DigitalVideoDisc[totalNumber];
		for (int i = 0; i < totalNumber; i++) {
			int directorID = (int)(Math.random()*DIRECTORS.length);
			int titleID = (int)(Math.random()*TITLES.length);
			int categoryID = (int)(Math.random()*CATEGORIES.length);
			double cost = Math.random()*50.0d + 5.0d;
			int length = (int)(Math.random()*60.0d) + 70;
			discs[i] = new DigitalVideoDisc(TITLES[titleID], CATEGORIES[categoryID], DIRECTORS[directorID], length, cost);
		}
		return discs;
	}
}
