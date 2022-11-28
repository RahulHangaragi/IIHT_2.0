package com.digitalbooks.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbooks.entity.BookAuthor;
import com.digitalbooks.services.IBookServices;

@RestController
public class AuthorController {
	
	@Autowired
	IBookServices bookService;
	
	@PostMapping("/author/books")
	BookAuthor createBook(@RequestBody BookAuthor book) {
		BookAuthor save = bookService.saveBook(book);
		return save;
	}
	
	@PutMapping("/author/books/{id}")
	public ResponseEntity<BookAuthor> updateBook(@PathVariable Integer id, @RequestBody BookAuthor book){
		return new ResponseEntity<BookAuthor>(bookService.updateBook(book, id), HttpStatus.OK);
	}
	
	@GetMapping("/author/search/book/{id}")
	public Optional<BookAuthor> getBook(@PathVariable Integer id) {
		Optional<BookAuthor> book = bookService.getBook(id);
		return book;
	}
	
	@GetMapping("/author/search/allbooks")
	public List<BookAuthor> getAllBooks(){
		List<BookAuthor> allBooks = bookService.getAllBooks();
		return allBooks;
	}
	
	@DeleteMapping("/author/book/remove/{id}")
	public ResponseEntity<BookAuthor> deleteBook(@PathVariable Integer id) {
		ResponseEntity<BookAuthor> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			bookService.deleteBook(id);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}
	
//	@PutMapping("/author/books/active/{id}")
//	public ResponseEntity<BookAuthor> blockUnblock(@PathVariable Integer id, @RequestBody BookAuthor book){
//		return new ResponseEntity<BookAuthor>(bookService.blockUnblock(book, id), HttpStatus.OK);
//	}

}
