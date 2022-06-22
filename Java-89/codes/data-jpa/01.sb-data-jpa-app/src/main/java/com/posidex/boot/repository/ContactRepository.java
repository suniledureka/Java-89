package com.posidex.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.posidex.boot.entity.Contact;

@Repository //optional
public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
