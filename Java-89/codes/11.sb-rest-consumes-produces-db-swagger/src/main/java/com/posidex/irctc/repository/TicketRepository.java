package com.posidex.irctc.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.posidex.irctc.bindings.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Serializable> {

}
