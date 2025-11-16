package com.hust.kstn.test;

import com.hust.kstn.models.Book;

public class BookTest {

	public static void main(String[] args) {
		Book[] books = TestUtils.generateRandomBooks(10);
		for (Book book : books) {
			System.out.println(book);
		}
	}

}
