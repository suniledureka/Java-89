package com.posidex.boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PosidexRestController {
	
	@GetMapping("/home")
	public String showHomePage() {
		return "<h2>Welcome to POSIDEX</h2>";
	}
	
	@GetMapping("/common")
	public String showCommonPage() {
		return "This page can be accessed by all type of user roles ";
	}	
	
	@GetMapping("/employee")
	public String showEmployeePage() {
		return "This page can be accessed by Admins, Managers and Employees";
	}
	

	@GetMapping("/customercare")
	public String showCustomerCarePage() {
		return "Thanks for Contacting POSIDEX";
	}
	
	@GetMapping("/admin")
	public String showAdminDashboard() {
		return "This Page can be accessed only by Administrators";
	}	
	
	@GetMapping("/mgr")
	public String showManagersPage() {
		return "This Page can be accessed by Administrators & Managers";
	}		
}
