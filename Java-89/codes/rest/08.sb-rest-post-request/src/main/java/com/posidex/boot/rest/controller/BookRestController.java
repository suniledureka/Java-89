package com.posidex.boot.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.posidex.boot.rest.bindings.Book;

@RestController
@RequestMapping("/library")
public class BookRestController {
	@PostMapping(value = "/save",
				 consumes = {"application/xml", "application/json"})
	public ResponseEntity<String> saveNewBook(@RequestBody Book book){
		System.out.println(book);
		//logic to save the book in DB
		return new ResponseEntity<String>("Book Saved to Library Catalog", HttpStatus.CREATED);
	}
}
