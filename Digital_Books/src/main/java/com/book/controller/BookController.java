package com.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.service.IBookService;

@RestController
public class BookController {
	
	@Autowired
	IBookService bookService;
	
	@PostMapping("/addbook")
	Integer createBook(@RequestBody Book book) {
		Integer id = bookService.saveBook(book);
		System.out.println("Book Id is : " + id);
		return id;
	}
	
	@GetMapping("/book/{id}")
	public Optional<Book> getStudent(@PathVariable Integer id){
		Optional<Book> book = bookService.getBook(id);
		return book;
	}
	
	@GetMapping("/allbooks")
	public List<Book> getAllStudents(){
		List<Book> allBooks = bookService.getAllBooks();
		return allBooks;
	}

}