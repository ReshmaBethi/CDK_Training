package com.interfaces;
import java.util.List;

import com.person.Person;
public interface PersonIo {
	List<Person> getPersons();
	Person findById(int id,List<Person>persons);
	boolean removePerson(int id,List<Person>persons);
	Person updatePerson(int id,List<Person>persons); 
	List<Person> displayPersons();
	List<Person> addPerson(List<Person> persons, Person person);
}
