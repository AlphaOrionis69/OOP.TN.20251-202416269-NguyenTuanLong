package com.hust.kstn;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class Aims {

	public static void main (String args[]) {
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
		
		cart.addDVD(dvd1);
		cart.addDVD(dvd2);
		cart.print();
		System.out.println(cart.calculateTotalCost());
		
		cart.removeDVD(dvd1);
		cart.print();
		System.out.println(cart.calculateTotalCost());
		
		cart.removeDVD(dvd1);
		cart.removeDVD(dvd2);
		cart.removeDVD(dvd2);
		
	
		for (int i = 0; i < 21; i++) {
			String str = Integer.toString(i);
			DigitalVideoDisc newDVD = new DigitalVideoDisc(str, str, (double)i);
			cart.addDVD(newDVD);
		}
		cart.print();
		System.out.println(cart.calculateTotalCost());
	}

}
