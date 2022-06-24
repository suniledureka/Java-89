package com.posidex.boot.mvc.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonalizedController {
	@Value("${posidex.manager.msg}")
	private String message;
	
	@GetMapping("/fromdesk")
	public ModelAndView showMessage() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("message", message);
		mav.setViewName("index");

		return mav;
	}
}
