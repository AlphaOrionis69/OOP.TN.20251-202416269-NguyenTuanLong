package com.hust.kstn.models;

public class Store {
	private static final int TEMPORARY_MAXIMUM_CAPACITY = 100;
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[TEMPORARY_MAXIMUM_CAPACITY];
	private int qtyOrdered = 0;
	
	public void addDVD(DigitalVideoDisc disc) {
		if (qtyOrdered >= TEMPORARY_MAXIMUM_CAPACITY) {
			System.out.println("The store is temporarily full, no more discs can be added");
			return;
		}
		itemsInStore[qtyOrdered++] = disc;
		System.out.println("The disc has been add successfully");
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The store is empty and has no items to remove");
			return;
		}
		for (int index = 0; index < qtyOrdered; index++) {
			DigitalVideoDisc item = itemsInStore[index];
			if (item == null) continue;
			if (item == disc) {
				for (int startPos = index; startPos < qtyOrdered-1; startPos++) {
					itemsInStore[startPos] = itemsInStore[startPos+1];
				}
				itemsInStore[--qtyOrdered] = null;
				System.out.println("The disc has been removed successfully");
				return;
			}
		}
		System.out.println("The disc does not exist");
	}

	
}
