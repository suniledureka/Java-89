package com.posidex.boot.rest.controllers;

import java.util.Calendar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personal")
public class AgeRestController {
	@GetMapping("/age")
	public ResponseEntity<String> calculateAge(@RequestParam String name, @RequestParam("yob") Integer yob){
		String message = "Invalid Year of Birth";
		
		if(isYearOfBirthValid(yob)) {
			int age = currentYear() - yob;
			message = "Hello \""+name+"\", you are "+age+" years of age!!!";
			return new ResponseEntity<>(message, HttpStatus.OK);
		}
		return new ResponseEntity<>(message, HttpStatus.NOT_ACCEPTABLE);
	}

	private boolean isYearOfBirthValid(Integer yob) {
		return currentYear() > yob ? true : false;
	}

	private Integer currentYear() {
		Calendar cal = Calendar.getInstance();
		Integer year = cal.get(Calendar.YEAR);
		System.out.println(year);
		return year;
	}
}
