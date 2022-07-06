package com.posidex.irctc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.posidex.irctc.bindings.Passenger;
import com.posidex.irctc.bindings.Ticket;

@RestController
@RequestMapping("/irctc")
public class TicketBookingRestController {
	@PostMapping(value = "/bookticket",
			     produces = {"application/json","application/xml"},
			     consumes = {"application/json","application/xml"})
	public ResponseEntity<Ticket> bookNewTicket(@RequestBody Passenger passenger) {
		System.out.println(passenger);
		//logic to generate ticket
		
		Ticket ticket = new Ticket();
		
		ticket.setName(passenger.getName());
		ticket.setFromStation(passenger.getFromStation());
		ticket.setToStation(passenger.getToStation());
		ticket.setDoj(passenger.getDoj());
		ticket.setTrainNo(passenger.getTrainNo());
		
		ticket.setPnr("QVTGMP");
		ticket.setDob(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
		ticket.setFare(2256.5f);
		ticket.setStatus(new Random().nextBoolean()?"CONFIRMED":"WAITING");
		
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}
}
