package com.set;

import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Person> persons=new TreeSet<>(new PersonID2Comparator());
		Set<Person> persons=new TreeSet<>((o1,o2)->{
			return o2.getpId()-o1.getpId();
		});
		persons.add(new Person(1,"CDK"));
		persons.add(new Person(12,"Pune"));
		persons.add(new Person(23,"Hyd"));
		persons.add(new Person(2,"Delhi"));
		
		System.out.println(persons);
	}

}
