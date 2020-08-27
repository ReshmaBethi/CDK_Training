package com.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.person.Person;

public class PersonIoImpl implements PersonIo{

	Scanner sc=new Scanner(System.in);
	List<Person> list=new ArrayList<Person>();
	
	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		List<Person> l=new ArrayList<Person>();
		System.out.println("Enter id and name");
		l.add(new Person(sc.nextInt(),sc.next()));
		list=l;
		return l;
	}

	@Override
	public Person findById(int id, List<Person> persons) {
		// TODO Auto-generated method stub
		for(Person person:persons){
			if(person.getpId()==id){
				return person;
			}
		}
		return null;
	}

	@Override
	public boolean removePerson(int id, List<Person> persons) {
		// TODO Auto-generated method stub
		for(Person person:persons){
			if(person.getpId()==id){
				persons.remove(new Integer(id));
				list=persons;
				return true;
			}
		}
		return false;
	}

	@Override
	public Person updatePerson(int id, List<Person> persons) {
		// TODO Auto-generated method stub
		for(Person person :persons){
			if(person.getpId()==id){
				System.out.println("Enter name for updation ");
				person.setName(sc.next());
				list=persons;
				return person;
			}
		}
		return null;
	}

	@Override
	public List<Person> displayPersons() {
		// TODO Auto-generated method stub
		for(Person person: list){
			System.out.println(person.toString());
		}
		return list;
	}

	@Override
	public List<Person> addPerson(List<Person> persons, Person person) {
		// TODO Auto-generated method stub
		list.add(person);
		System.out.println("Person added Successfully!!");
		return list;
	}
	
}
