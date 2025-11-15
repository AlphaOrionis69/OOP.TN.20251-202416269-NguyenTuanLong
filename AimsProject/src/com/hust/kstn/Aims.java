package com.hust.kstn;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class Aims {

	public static void main (String args[]) {
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Matrix", "Science Fiction", "Lilly Wachowski", 136, 14.49);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Parasite", "Drama", "Bong Joon-ho", 132, 16.99);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Spirited Away", "Animation", "Hayao Miyazaki", 125, 17.50);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Godfather", "Drama", "Francis Ford Coppola", 175, 14.99);
		DigitalVideoDisc[] discs = {dvd1, dvd2, dvd3};
		cart.addDVD(dvd1);
		cart.addDVD(dvd2);
		cart.addDVD(discs);
		cart.addDVD(dvd4, dvd5, dvd6);
		cart.print();
		//System.out.println(cart.calculateTotalCost());
		
		cart.removeDVD(dvd1);
		cart.print();
		//System.out.println(cart.calculateTotalCost());
		
		cart.removeDVD(dvd1);
		cart.removeDVD(dvd2);
		cart.removeDVD(dvd2);
		
	
		for (int i = 0; i < 21; i++) {
			String str = Integer.toString(i);
			DigitalVideoDisc newDVD = new DigitalVideoDisc(str, str, str, i, (double)i);
			cart.addDVD(newDVD);
		}
		cart.print();
		//System.out.println(cart.calculateTotalCost());
	}

}
