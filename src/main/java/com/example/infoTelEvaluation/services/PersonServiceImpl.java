package com.example.infoTelEvaluation.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.infoTelEvaluation.dao.PersonRepository;
import com.example.infoTelEvaluation.entities.Person;




@Service
public class PersonServiceImpl implements PersonService{

	
	private final PersonRepository personRepository;
    
	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	
 
	public Person postPerson( Person person) {
	return	personRepository.save(person);
		
	}
	
	
	
	public Optional<Person> getPerson(String idPerson) {
		return personRepository.findById(idPerson);
	}
	
}



