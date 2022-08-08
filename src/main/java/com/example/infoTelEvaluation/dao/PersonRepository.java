package com.example.infoTelEvaluation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.infoTelEvaluation.entities.Person;

public interface PersonRepository extends JpaRepository<Person, String> {

}
