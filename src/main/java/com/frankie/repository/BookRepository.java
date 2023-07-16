package com.frankie.repository;

import com.frankie.domain.Book;

public interface BookRepository {
	public Book findBookById(Long id);
	
}
