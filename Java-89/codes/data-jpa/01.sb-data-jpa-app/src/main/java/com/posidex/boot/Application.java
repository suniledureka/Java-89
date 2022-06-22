package com.posidex.boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.posidex.boot.entity.Contact;
import com.posidex.boot.repository.ContactRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//-- get spring container
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//-- get Repository bean
		ContactRepository contactRepo = context.getBean(ContactRepository.class); 
		/*ContactRepository is an interface then how come object
		 - Proxy Design Pattern - implementation class is being created implicitly
		 */
		
		/*
		Contact contact = new Contact();
		contact.setContactId(101);
		contact.setContactName("Sunil Joseph");
		contact.setContactNumber("9505511045");
		
		Contact savedContact =contactRepo.save(contact);
		System.out.println("$$$--- Contact Saved ---$$$");
		*/
		
		//--- to save multiple contacts
		List<Contact> contacts = Arrays.asList(
				 			new Contact(102, "Pankaj", "1234567890"),
				 			new Contact(103, "Praveen", "9988776655"),
				 			new Contact(104, "Sachin", "7854785478")
						); 
				
		contactRepo.saveAll(contacts);
		
		context.close();
	}

}
