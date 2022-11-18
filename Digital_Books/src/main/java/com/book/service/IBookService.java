package com.book.service;

import java.util.List;
import java.util.Optional;

import com.book.entity.Book;

public interface IBookService {
	
	Integer saveBook (Book book);
	
	Optional<Book> getBook(Integer id);
	
	public List<Book> getAllBooks();

}