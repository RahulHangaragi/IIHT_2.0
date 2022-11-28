package com.digitalbooks.services;

import java.util.List;
import java.util.Optional;

import com.digitalbooks.entity.BookAuthor;

public interface IBookServices {
	
	BookAuthor saveBook (BookAuthor bookInfo);
	
	BookAuthor updateBook(BookAuthor book, Integer id);
	
	//BookAuthor blockUnblock(BookAuthor book, Integer id);
	
	Optional<BookAuthor> getBook(Integer id);
	
	List<BookAuthor> searchBook(String category, String author, int price, String publisher);
	
	public List<BookAuthor> getAllBooks();
	
	public void deleteBook(Integer id);

}
