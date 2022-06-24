package com.posidex.boot.mvc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateController {
	@GetMapping(value = {"/today","/date"})
	public String getData(Model model) {
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyy :: HH:mm:ss");
		String data = formatter.format(d);
		
		model.addAttribute("dateAndTime", data);
		
		return "dateView";
	}
}
