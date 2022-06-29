package com.posidex.boot.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posidex")
public class WelcomeRestController {
	//@RequestMapping("/welcome")
	//@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	@GetMapping("/welcome")
	public String sendWelcomeMessage() {
		String message = "Welcome to POSIDEX";
		return message;
	}
}
