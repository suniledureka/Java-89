package com.posidex.boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	@GetMapping(value = {"/greet","/greetings"})
	public String showGreeting() {
		return "Hi Guest, POSDIEX greeting You!";
	}
}
