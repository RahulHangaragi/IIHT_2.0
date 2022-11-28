package com.digitalbooks.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbooks.entity.BookAuthor;
import com.digitalbooks.exceptionHandler.BookNotFoundException;
import com.digitalbooks.repo.IBookRepository;

@Service
public class BookServices implements IBookServices{
	
	@Autowired
	IBookRepository bookRepo;

	@Override
	public BookAuthor saveBook(BookAuthor bookInfo) {
		BookAuthor savedBook = bookRepo.save(bookInfo);
		return savedBook;
	}

	@Override
	public BookAuthor updateBook(BookAuthor book, Integer id) {

		BookAuthor existingBook = bookRepo.findById(id).orElseThrow(()-> new BookNotFoundException("Book", "ID", id));
		existingBook.setBookId(book.getBookId());
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

	@Override
	public Optional<BookAuthor> getBook(Integer id) {
		return bookRepo.findById(id);
	}
	
	@Override
	public List<BookAuthor> getAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public void deleteBook(Integer id) {
		bookRepo.deleteById(id);		
	}

	@Override
	public List<BookAuthor> searchBook(String category, String author, int price, String publisher) {
		return bookRepo.findAll();
	}

//	@Override
//	public BookAuthor blockUnblock(BookAuthor book, Integer id) {
//		@SuppressWarnings("deprecation")
//		BookAuthor bookStatus = bookRepo.getById(id);
//		bookStatus.setActive(bookStatus.isActive());;
//		return bookStatus;
//	}

}
