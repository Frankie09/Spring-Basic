package com.frankie.service.impl;

import com.frankie.domain.Author;
import com.frankie.domain.Book;
import com.frankie.service.BookService;

public class BookServiceImpl implements BookService{
	private Book book;

	public BookServiceImpl() {
		Author author = new Author();
		book = new Book(author);
	}
	
}
