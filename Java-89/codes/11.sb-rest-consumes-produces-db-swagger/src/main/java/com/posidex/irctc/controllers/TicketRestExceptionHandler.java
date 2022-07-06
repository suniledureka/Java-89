package com.posidex.irctc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.posidex.irctc.bindings.ApiError;
import com.posidex.irctc.exceptions.NoMatchingPnrFoundException;

@RestControllerAdvice
public class TicketRestExceptionHandler {
	/*
	@ExceptionHandler(value = NoMatchingPnrFoundException.class)
	public ResponseEntity<String> handleNoPnrMatchException(Exception ex){		
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST); 
	}
	*/
	@ExceptionHandler(value = NoMatchingPnrFoundException.class)
	public ResponseEntity<ApiError> handleNoPnrMatchException(Exception ex){
		ApiError error = new ApiError();
		error.setCode(502);
		error.setDate(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
		error.setMessage(ex.getMessage());
		error.setType(ex.getClass().getName());
		
		return new ResponseEntity<ApiError>(error, HttpStatus.BAD_REQUEST); 
	}	
}
