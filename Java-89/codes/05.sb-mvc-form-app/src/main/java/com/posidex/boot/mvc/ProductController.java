package com.posidex.boot.mvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
	@GetMapping(value = {"/","/entryform"})
	public String showProductEntryForm() {
		return "index";
	}
	
	@PostMapping("/saveproduct")
	public String handleSubmitButtonClick(HttpServletRequest request, Model model) {
		//get the form data
		String id = request.getParameter("pid");
		String name = request.getParameter("pname");
		String price = request.getParameter("pprice");
		
		Map<String, String> attributes = new HashMap<String, String>();
		attributes.put("id", id);
		attributes.put("name", name);
		attributes.put("price", price);
		attributes.put("msg", "Product added to Catalog");
		
		model.addAllAttributes(attributes);
		
		return "success";
	}
}
