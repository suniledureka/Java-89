package com.posidex.boot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/policy")
public class PolicyController {
	//@GetMapping("/register/{name}/{age}")
	@GetMapping("/{name}/register/{age}")
	public String eligibleForPolicy(@PathVariable("name") String name, @PathVariable("age") Integer age, Model model) {
		String responseText = "Hi "+name +" / "+age+", is NOT eligible for this Policy";
		
		if(age >= 60)
			responseText = "Hi "+name +" / "+age+", is eligible for this Policy";
		
		model.addAttribute("policyEligibility", responseText);
		
		return "policy";
	}
}
