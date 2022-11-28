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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbooks.entity.BookAuthor;
import com.digitalbooks.entity.ReaderInfo;
import com.digitalbooks.services.IBookServices;
import com.digitalbooks.services.IReaderServices;

@RestController
public class ReaderController {
	
	@Autowired
	IBookServices bookService;
	
	@Autowired
	IReaderServices readService;
	
	@GetMapping("/reader/search/books")
	public List<BookAuthor> getBooks(){
		List<BookAuthor> allBooks = bookService.getAllBooks();
		return allBooks;
	}
	
	@PostMapping("/reader/buy")
	ReaderInfo buybook(@RequestBody ReaderInfo info) {
		ReaderInfo buy = readService.buybook(info);
		return buy;
	}
	
	@PostMapping("/reader/info")
	ReaderInfo readDetails(@RequestBody ReaderInfo info) {
		ReaderInfo saveDetails = readService.saveReader(info);
		return saveDetails;
	}
	
	@GetMapping("/reader/info/{id}")
	public Optional<ReaderInfo> getInfo(@PathVariable Integer id) {
		Optional<ReaderInfo> info = readService.getInfo(id);
		return info;
	}
	
	@DeleteMapping("/reader/info//remove/{id}")
	public ResponseEntity<ReaderInfo> deleteBook(@PathVariable Integer id) {
		ResponseEntity<ReaderInfo> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			readService.deleteInfo(id);;
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

}
