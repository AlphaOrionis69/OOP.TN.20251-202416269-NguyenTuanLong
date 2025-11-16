package com.hust.kstn;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.test.TestUtils;

public class Aims {

	public static void main (String args[]) {
		Cart cart = new Cart();
		DigitalVideoDisc[] discs = TestUtils.generateRandomDigitalVideoDiscs(15);
		cart.print();
		cart.addDVD(discs);
		cart.print();
	}

}
