package com.example.service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	public Person findById(String id) {
		logger.info("Find one person");
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Lenadro");
		person.setLastName("Chaves");
		person.setAddress("Rua A");
		person.setGender("M");
		return person;
	}

}
