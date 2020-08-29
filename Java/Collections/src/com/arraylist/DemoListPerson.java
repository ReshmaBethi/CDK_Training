package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoListPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons =new ArrayList<Person>();
		persons.add(new Person(1,"cdk"));
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
		//using lamda and consumer
		persons.forEach((p)->{System.out.println(p.getName());});
		
		persons.forEach(System.out ::println);
	}

}
