package com.posidex.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.posidex.rest.services.WelcomeService;

@RestController
public class WelcomeRestController {
	@Autowired
	WelcomeService service;
	
	@GetMapping("/welcome")
	public String sendWelcomeMessage() {
		String message = service.getWelcomeMessage();
		return message;
	}
}
