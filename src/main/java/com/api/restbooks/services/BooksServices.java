package com.api.restbooks.services;

import java.util.*;

import org.springframework.stereotype.Component;

import com.api.restbooks.entities.Books;

@Component
public class BooksServices {
	
	private static List<Books> list = new ArrayList<>();
	
	static {
		list.add(new Books(12,"Python", "MNOP"));
		list.add(new Books(17,"C", "LMN"));
		list.add(new Books(21,"C++", "ABC"));
		list.add(new Books(42,"Javascript", "QWE"));		
	}
	
	// get all books
	
	public List<Books> getAllBooks(){
		return list;
	}
	
	//get single book by id
	
	public Books getBookById(int id) {
		Books book = null;
		list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}

}
