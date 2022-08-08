package com.example.infoTelEvaluation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.example.infoTelEvaluation.utils.PersonIdGenerator;

@Entity
@Table
public class Person {
	@Id
	
	@GeneratedValue(generator = PersonIdGenerator.generatorName)
	@GenericGenerator(name = PersonIdGenerator.generatorName, strategy = "uuid")
/*	@SequenceGenerator(
			name = "person_sequence",
			sequenceName = "person_sequence",
			allocationSize = 1)
	
	@GeneratedValue(
			strategy = GenerationType.,
			generator = "person_sequence" )*/
	
	
	String id;
	String firstName;
	String lastName ;
	public Person(String id, String firstName, String lastName) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Person() {
		super();
	}
	public Person(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
