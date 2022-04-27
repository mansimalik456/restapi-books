package com.api.restbooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.restbooks.entities.Books;
import com.api.restbooks.services.BooksServices;

@RestController
public class BooksapiController {
	
	@Autowired
	private BooksServices  bookService;
	
	@GetMapping("/books")
	public List<Books> getbooks() {
		return this.bookService.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Books getbooks(@PathVariable("id") int id) {
		return bookService.getBookById(id);
	}
	
	
	
	/*	public Books getbooks() {
		
		Books booksobj = new Books();
		booksobj.setId(1234);
		booksobj.setTitle("Java Complete");
		booksobj.setAuthor("XYZ");
		
		return booksobj;
	} */

}
