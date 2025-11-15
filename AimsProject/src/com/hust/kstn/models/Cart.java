package com.hust.kstn.models;

public class Cart {
	private static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	public void addDVD(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBER_ORDERED) {
			System.out.println("The cart is too full to add a disc");
			return;
		}
		itemsInCart[qtyOrdered++] = disc;
		System.out.println("The disc has been added successfully");
	}
	
	public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if (qtyOrdered + 2 > MAX_NUMBER_ORDERED) {
			System.out.println("The cart is too full to add two discs");
			return;
		}
		addDVD(disc1); addDVD(disc2);
		System.out.println("The two discs have been added successfully\n");
	}
	
	// using array as parameter is not better than using varargs in this scenario
	/*
	public void addDVD(DigitalVideoDisc[] discs) {
		if (discs == null) return;
		if (qtyOrdered + discs.length > MAX_NUMBER_ORDERED) {
			System.out.println("The cart is too full to add many discs");
			return;
		}
		for (DigitalVideoDisc disc : discs) {
			addDVD(disc);
		}
		System.out.println("The list of discs has been added successfully");
	}
	*/
	
	public void addDVD(DigitalVideoDisc... discs) {
		if (discs == null) return;
		if (qtyOrdered + discs.length > MAX_NUMBER_ORDERED) {
			System.out.println("The cart is too full to add many discs");
			return;
		}
		for (DigitalVideoDisc disc : discs) {
			addDVD(disc);
		}
		System.out.println("The list of discs has been added successfully\n");
	}
	
	
	public void removeDVD(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty and has no items to remove");
			return;
		}
		for (int index = 0; index < qtyOrdered; index++) {
			DigitalVideoDisc item = itemsInCart[index];
			if (item == null) continue;
			if (item == disc) {
				for (int startPos = index; startPos < qtyOrdered-1; startPos++) {
					itemsInCart[startPos] = itemsInCart[startPos+1];
				}
				itemsInCart[--qtyOrdered] = null;
				System.out.println("The disc has been removed successfully");
				return;
			}
		}
		System.out.println("The disc does not exist");
	}
	public double calculateTotalCost() {
		double totalCost = 0.0;
		for (int index = 0; index < qtyOrdered; index++) {
			DigitalVideoDisc item = itemsInCart[index];
			if (item == null) continue;
			totalCost += item.getCost();
		}
		return totalCost;
	}
	public void print() {
		if (qtyOrdered == 0) {
			System.out.println("The current cart is empty");
			return;
		}
		System.out.println("==================================THE CURRENT CART==================================");
		System.out.println("Total items: " + qtyOrdered);
		for (int index = 0; index < qtyOrdered; index++) {
			if (itemsInCart[index] == null) continue;
			System.out.println(itemsInCart[index].toString());
		}
		System.out.printf("Subtotal: %.2f$\n", calculateTotalCost());
		System.out.println("====================================================================================");
	}
	
	
}
