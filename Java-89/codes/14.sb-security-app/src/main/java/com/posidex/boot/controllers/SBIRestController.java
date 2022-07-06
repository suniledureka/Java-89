package com.posidex.boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sbi")
public class SBIRestController {
	
	@GetMapping("/home")
	public String showHomePage() {
		return "<h2>Welcome to State Bank of India</h2>";
	}
	
	@GetMapping("/statement")
	public String showStatementsPage() {
		return "This is bank statement page";
	}	
	
	@GetMapping("/loan")
	public String showLonDetailsPage() {
		return "This page shows the loan details associated with customer";
	}
	
	@GetMapping("/balance")
	public String showBalance() {
		return "This page shows the current balance of the Customer";
	}
	
	@GetMapping("/customercare")
	public String showCustomerCarePage() {
		return "Thanks for Contacting SBI. 24x7 support at 18005524578";
	}
}
