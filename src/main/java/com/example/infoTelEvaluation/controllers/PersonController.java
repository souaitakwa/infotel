package com.example.infoTelEvaluation.controllers;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.infoTelEvaluation.entities.Person;
import com.example.infoTelEvaluation.services.PersonService;
import com.example.infoTelEvaluation.services.PersonServiceImpl;

@RestController
@RequestMapping("person")
public class PersonController {

	
	private final PersonService personService;
	
	
	public PersonController(PersonService personService) {
	
		this.personService = personService;
	}


	@PostMapping(produces = {"application/json"}, consumes = {"application/json"})
	public Person addPerson(@RequestBody Person s) {

	return	this.personService.postPerson(s);
	}
	
	
	
	
	@GetMapping(path ="/{id}")
	public ResponseEntity getPerson(@PathVariable("id") String id) {
		Optional<Person> person = this.personService.getPerson(id);
		if(person.isPresent())
		{
			return ResponseEntity.ok(person.get());
		}
		
		return ResponseEntity.notFound().build();
	}
	
}
