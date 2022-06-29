package com.posidex.boot.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cibil")
public class CibilRestController {
	@GetMapping("/score")
	//public ResponseEntity<String> getCibilScore(@RequestParam("pan") String pan){
	public ResponseEntity<String> getCibilScore(@RequestParam(value = "pan", required = false, defaultValue = "") String pan){
		if(pan.length() == 10) {
			//logic to get cibil score for PAN from DB
			String response = "CIBIL SCORE for PAN: "+pan +" IS 786";
			return new ResponseEntity<String>(response, HttpStatus.OK);
		}
		return new ResponseEntity<String>("provide PAN or provided an invliad PAN", HttpStatus.BAD_REQUEST);
	}
}
