package com.posidex.boot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("/welcome")
	public ModelAndView showWelcomeMessage() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("message", "Welcome to Posidex Technologies");
		mav.setViewName("index");
		
		return mav;
	}
	
	//@GetMapping("/greet")
	@GetMapping(value = {"/greet","/greetings"})
	public ModelAndView showGreetings() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("message", "Hello Guest, Good Morning!!!");
		mav.setViewName("index");
		
		return mav;		
	}
}
