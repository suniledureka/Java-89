package com.posidex.boot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.posidex.boot.mvc.bindings.Product;

@Controller
public class ProductController {
	@GetMapping(value = {"/","/entryform"})
	public String showProductEntryForm(Model model) {
		Product product = new Product();		
		model.addAttribute("product", product);
		
		return "index";
	}
	
	@PostMapping("/saveproduct")
	public String handleSubmitButtonClick(Product product, Model model) {
		System.out.println(product);
		//save the product in DB
		return "redirect:/productsaved";
	}
	
	//@GetMapping
	@RequestMapping(value = "/productsaved", method = RequestMethod.GET)
	public String afterProductSaved(Model model) {		
		model.addAttribute("msg", "Product added to Catalog");
		model.addAttribute("product", new Product());
		
		return "index";
	}
}
