package com.library;

import java.util.*;

public class Book {

	String bookName;
	int bookId;
	String author;
	
	public Book(String bookName, int bookId, String author)
	{
		this.bookName = bookName;
		this.bookId = bookId;
		this.author = author;
		
		
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
