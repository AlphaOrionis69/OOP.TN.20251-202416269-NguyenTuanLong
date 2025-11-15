package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;


public class CartTest {
	public static void main(String[] args) {
		// generate some discs
		DigitalVideoDisc[] discs = TestUtils.generateRandomDiscs(50);
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
