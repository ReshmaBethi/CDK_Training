package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DemoHashSetPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Person>persons =new HashSet<>();
		persons.add(new Person(1,"cdk")); //Hashcode
		persons.add(new Person(12,"Pune"));
		persons.add(new Person(23,"Hyd"));
		persons.add(new Person(4,"Delhi"));
		
		System.out.println("Persons are : "+persons);
		Iterator<Person> iterator=persons.iterator();
		while(iterator.hasNext()){
			Person person =iterator.next();
			System.out.println(person.getpId()+" : "+person.getName());
		}
		System.out.println("Printing using for each loop");
		for(Person person : persons){
			System.out.println(person.getpId()+" : "+person.getName());
		}
		
		boolean isPresent=persons.contains(new Person(23,"Hyd"));
		System.out.println(isPresent);
		
		persons.forEach((p)->{System.out.println(p.getpId()+" : "+p.getName());
		});
		
		persons.forEach(System.out :: println);
		
		
		
	}

}
