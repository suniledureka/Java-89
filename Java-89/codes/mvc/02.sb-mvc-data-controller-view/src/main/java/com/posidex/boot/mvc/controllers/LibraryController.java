package com.posidex.boot.mvc.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.posidex.boot.mvc.models.Book;

@Controller
@RequestMapping("/library")
public class LibraryController {
	@GetMapping("/book")
	public String getBookDetails(Model model) {
		Book book = new Book();
		
		book.setBookId(1001234);
		book.setBookTitle("Java Complete Reference");
		book.setBookPrice(775.50f);
		
		model.addAttribute("book", book);
		
		return "bookDetails";
	}
	
	@GetMapping("/books")
	public String getBooksDetail(Model model) {
		List<Book> booksList = Arrays.asList(
									new Book(1001, "Java Complete Reference", 755.50f),
									new Book(1002, "Python Complete Reference", 755.50f),
									new Book(1003, "Spring Boot Made Simple", 850f),
									new Book(1004, "Microservices - An Ultimate Guide", 955.50f)
								); 
		
		model.addAttribute("books", booksList);
		
		return "booksDetail";
	}	
}
