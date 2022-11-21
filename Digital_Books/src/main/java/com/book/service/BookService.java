package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Book;
import com.book.exceptionHandler.BookNotFoundException;
import com.book.repo.IBookRepository;

@Service
public class BookService implements IBookService {
	
	@Autowired
	IBookRepository bookRepo;

	@Override
	public Integer saveBook(Book book) {
		Book savedBook = bookRepo.save(book);
		return savedBook.getBookId();
	}

	@Override
	public Optional<Book> getBook(Integer id) {
		return bookRepo.findById(id);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public void deleteBook(Integer id) {
		bookRepo.deleteById(id);		
	}

	@Override
	public Book updateBook(Book book, Integer id) {
		Book existingBook = bookRepo.findById(id).orElseThrow(()-> new BookNotFoundException("Student", "ID", id));
		existingBook.setBookTitle(book.getBookTitle());
		existingBook.setLogo(book.getLogo());
		existingBook.setCategory(book.getCategory());
		existingBook.setPrice(book.getPrice());
		existingBook.setPublisher(book.getPublisher());
		existingBook.setPublishedDate(book.getPublishedDate());
		existingBook.setChapters(book.getChapters());
		existingBook.setActive(book.isActive());
		
		bookRepo.save(existingBook);
		return existingBook;
	}

}