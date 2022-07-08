package com.posidex.rest.services;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	public String getWelcomeMessage() {
		return "Welcome to Unit Testing on REST API Service";
	}
}
