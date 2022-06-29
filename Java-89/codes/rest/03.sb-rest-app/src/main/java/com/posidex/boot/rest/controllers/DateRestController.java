package com.posidex.boot.rest.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateRestController {
	@GetMapping(value = {"/today", "/date"})
	public ResponseEntity<String> getTodaysDate() {
		Calendar calendar = Calendar.getInstance();
		Date d = calendar.getTime();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy::HH:mm:ss");
		String today = formatter.format(d);
		
		//ResponseEntity<String> entity = new ResponseEntity<String>(today, HttpStatus.OK);
		//ResponseEntity<String> entity = new ResponseEntity<String>(today, HttpStatus.CREATED);
		//ResponseEntity<String> entity = new ResponseEntity<String>(today, HttpStatus.BAD_REQUEST);
		//return entity;
		
		//---- to include Response Headers with Response Entity ----
		HttpHeaders headers = new HttpHeaders();
		headers.add("company", "POSIDEX");
		headers.add("team", "DEV");
		
		ResponseEntity<String> entity = new ResponseEntity<String>(today, headers, HttpStatus.OK);
		
		return entity;
	}
}
