package com.posidex.boot.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requestapp")
public class RequestDataRestController {
	@GetMapping("/data")
	public ResponseEntity<String> readHeaderAndBody(@RequestHeader String host, 
									@RequestHeader(name = "company", required = false, defaultValue = "HR") String company, 
									@RequestBody String requestData)
	{
		String responseText = "Host Name = "+host+"\n";
		responseText += "Company Name = " + company+"\n";
		responseText += "Requested Data = " + requestData;
		
		return new ResponseEntity<String>(responseText, HttpStatus.OK);
	}
}
