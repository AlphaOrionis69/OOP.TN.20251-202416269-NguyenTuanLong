package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;


public class CartTest {
	private static final String[] DIRECTORS = {"Christopher Nolan", "Steven Spielberg", "Quentin Tarantino", "James Cameron",
			"Ridley Scott", "Martin Scorsese", "Hayao Miyazaki", "Bong Joon-ho", "Denis Villeneuve", "Kathryn Bigelow", 
			"David Fincher", "Wes Anderson", "Zack Snyder", "Greta Gerwig", "Peter Jackson", "Lena Graves", "Victor Hale", "Aria Lee", 
			"Dominic Reed", "Mira Fallon", "Carter Voss", "Naomi Keene", "Roland Pierce", "Evelyn Hart", "Juno Mercer"};
	private static final String[] TITLES = {"Inception", "Interstellar", "Parasite", "The Matrix", "The Dark Knight", "Titanic",
			"Spirited Away", "Gladiator", "Avatar", "Whiplash", "La La Land", "The Godfather", "Starfall Odyssey", "Echoes of the Past", 
			"Silver Horizon", "Crimson Night", "Neon Rogue", "The Last Ember", "Iron Kingdom", "Blue Winter", "After the Storm",
			"Midnight Circuit", "Rivers of the Sun", "The Forgotten Planet"};
	private static final String[] CATEGORIES = {"Action", "Drama", "Comedy", "Thriller", "Horror", "Romance", "Animation",
			"Science Fiction", "Fantasy", "Adventure", "Mystery", "Musical", "Crime", "Historical", "Documentary",
			"Family", "War", "Biography"};
	
	public static void main(String[] args) {
		// generate some discs
		DigitalVideoDisc[] discs = new DigitalVideoDisc[50];
		for (int i = 0; i < discs.length; i++) {
			int directorID = (int)(Math.random()*DIRECTORS.length);
			int titleID = (int)(Math.random()*TITLES.length);
			int categoryID = (int)(Math.random()*CATEGORIES.length);
			double cost = Math.random()*50.0d + 5.0d;
			int length = (int)(Math.random()*60.0d) + 70;
			discs[i] = new DigitalVideoDisc(TITLES[titleID], CATEGORIES[categoryID], DIRECTORS[directorID], length, cost);
		}
		DigitalVideoDisc[] temp = {discs[47], discs[48], discs[49]};
		
		
		Cart cart = new Cart();
		cart.print(); // should show an empty list
		cart.removeDVD(discs[5]); // cannot remove when the cart is empty
		
		
		cart.addDVD(discs[0]); // add successfully
		cart.print();
		
		cart.addDVD(discs[1], discs[2]); // add successfully
		cart.print();
		
		cart.addDVD(discs[3], discs[4], discs[5]); // add successfully
		cart.print();
		
		cart.addDVD(temp); // add successfully
		cart.print();
		
		for (int i = 6; i < 20; i++) {
			cart.addDVD(discs[i]);
		}
		
		cart.print();
		cart.addDVD(discs[20]); // failed
		
		cart.removeDVD(discs[49]);
		cart.print();
		cart.addDVD(discs[20], discs[21]); // failed
		
		cart.removeDVD(discs[48]);
		cart.print();
		cart.addDVD(temp); // failed
		
		cart.removeDVD(discs[0]); // remove successfully
		cart.print();
		
		cart.removeDVD(discs[35]); // failed
		cart.print();
		
	}

}
