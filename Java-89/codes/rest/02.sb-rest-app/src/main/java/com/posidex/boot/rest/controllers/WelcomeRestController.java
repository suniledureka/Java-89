package com.posidex.boot.rest.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posidex")
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String sendWelcomeMessageGet() {
		return "Welcome Message from GET";
	}
	
	@PostMapping("/welcome")
	public String sendWelcomeMessagePost() {
		return "Welcome Message from POST";
	}	
	
	@PutMapping("/welcome")
	public String sendWelcomeMessagePut() {
		return "Welcome Message from PUT";
	}
	
	@DeleteMapping("/welcome")
	public String sendWelcomeMessageDelete() {
		return "Welcome Message from DELETE";
	}
	
	@PatchMapping("/welcome")
	public String sendWelcomeMessagePatch() {
		return "Welcome Message from PATCH";
	}
}
