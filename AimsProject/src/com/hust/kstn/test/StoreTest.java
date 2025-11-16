package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {

	public static void main(String[] args) {
		DigitalVideoDisc[] discs = TestUtils.generateRandomDigitalVideoDiscs(50);
		Store store = new Store();
		store.addDVD(discs[0]); // added successfully
		store.addDVD(discs[1]); // added successfully
		
		store.removeDVD(discs[1]); // remove successfully
		store.removeDVD(discs[1]); // failed
		store.removeDVD(discs[0]); // remove successfully
		store.removeDVD(discs[49]); // failed
		
	}

}
