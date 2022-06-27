package com.posidex.boot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.posidex.boot.mvc.models.Book;

@Controller
@RequestMapping("/library")
public class LibraryController {
	@RequestMapping("/price")
	//public String getBookPriceByTitle(@RequestParam("btitle") String title, Model model) {
	public String getBookPriceByTitle(@RequestParam(value = "btitle", required = false, defaultValue = "Java") String title, Model model) {
		//logic to get price of book with specified title
		String bookPrice = "Cost of Book: <ins>"+title+"</ins> is Rs. 675.50";
		
		model.addAttribute("price", bookPrice);
		
		return "book";
	}
	
	@RequestMapping("/search")
	public @ResponseBody Book getBookDetails(@RequestParam("id") Integer id) {
		//get the Book details from DB
		Book book = new Book();
		
		book.setBookId(id);
		book.setBookTitle("Python Certification");
		book.setBookPrice(625.50f);
		
		return book;
	}
}
