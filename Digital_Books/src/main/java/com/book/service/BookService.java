package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Book;
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

}