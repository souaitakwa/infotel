package com.example.infoTelEvaluation.services;

import java.util.Optional;

import com.example.infoTelEvaluation.entities.Person;

public interface PersonService {
	 Person postPerson( Person person);
	 Optional<Person> getPerson(String idPerson);
}
