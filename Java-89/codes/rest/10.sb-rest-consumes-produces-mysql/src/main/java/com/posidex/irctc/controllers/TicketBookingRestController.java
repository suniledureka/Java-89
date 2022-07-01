package com.posidex.irctc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.posidex.irctc.bindings.Passenger;
import com.posidex.irctc.bindings.Ticket;
import com.posidex.irctc.exceptions.NoMatchingPnrFoundException;
import com.posidex.irctc.repository.TicketRepository;

@RestController
@RequestMapping("/irctc")
public class TicketBookingRestController {
	@Autowired
	private TicketRepository repo;
	
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
		
		//ticket.setPnr("QVTGMP");
		ticket.setDob(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
		ticket.setFare(2256.5f);
		ticket.setStatus(new Random().nextBoolean()?"CONFIRMED":"WAITING");
		
		UUID uuid = UUID.randomUUID();
		String pnr = uuid.toString().replace("-", "").substring(0,6).toUpperCase(); 
		ticket.setPnr(pnr);
		
		//save the Ticket in DB
		repo.save(ticket);
		
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/searchticket/{pnr}")
	public ResponseEntity<?> searchTicket(@PathVariable("pnr") String pnr){
		Optional<Ticket> opt = repo.findById(pnr);
		if(opt.isPresent()) {
			Ticket ticket = opt.get();
			return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
		}
		//return new ResponseEntity<String>("No booking done against PNR: "+pnr, HttpStatus.BAD_REQUEST);
		throw new NoMatchingPnrFoundException("No booking done against PNR: "+pnr);
	}
	
	@DeleteMapping(value = "/deleteticket/{pnr}")
	public ResponseEntity<?> deleteTicketByPnr(@PathVariable("pnr") String pnr){
		Optional<Ticket> opt = repo.findById(pnr);
		if(opt.isPresent()) {			
			repo.deleteById(pnr);
			return new ResponseEntity<String>("Ticket Cancelled!!!", HttpStatus.OK);
		}
		throw new NoMatchingPnrFoundException("No booking done against PNR: "+pnr);
	}	
}
