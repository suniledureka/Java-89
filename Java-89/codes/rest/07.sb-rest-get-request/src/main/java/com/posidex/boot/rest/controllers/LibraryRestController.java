package com.posidex.boot.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.posidex.boot.rest.bindings.Book;

@RestController
@RequestMapping("/library")
public class LibraryRestController {
	@GetMapping(value = "/book",
				produces = {"application/json","application/xml"})
	public ResponseEntity<Book> getBookDetails(){
		Book book = new Book();
		
		book.setBookId(100123);
		book.setBookTitle("Java Complete Reference");
		book.setBookPrice(575.5f);
		
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}
	

	@GetMapping(value = "/book/{isbn}",
			produces = {"application/json","application/xml"})
	public ResponseEntity<?> getBookDetailsById(@PathVariable Integer isbn){
		if(isbn >  10000) {
			//logic to get the details of book based on the specified ISBN from DB
			Book book = new Book();
	
			book.setBookId(isbn);
			book.setBookTitle("Python Complete Reference");
			book.setBookPrice(750f);
	
			return new ResponseEntity<Book>(book, HttpStatus.OK);
		}
		return new ResponseEntity<String>("Invalid ISBN Number", HttpStatus.BAD_REQUEST);
}	
}
