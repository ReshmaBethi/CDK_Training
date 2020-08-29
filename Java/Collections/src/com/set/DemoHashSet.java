package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Select a collection and create an object
		//List<Integer> l=new ArrayList<Integer>();
		
		Set<Integer> l=new HashSet<>();
		//Add data or elements to collection
		//In collection only objects can be added
		
		l.add(10); // l.add(new Integer(10)); ==Boxing
		l.add(20);
		l.add(10);
		l.add(5);
		l.add(123);
		///////******Manipulation
		System.out.println("Size : "+l.size());
		System.out.println("elements of list "+l);
		
		l.add(1);
//		l.add(4,100); Don't support indexing
		
		System.out.println("After addition element of list "+l);
		l.remove(new Integer(100));
		System.out.println("After removal element of list "+l);
		//l.add("My Data");
		//l.add(13.33d);
		
		//System.out.println("After adding element of list "+l);
		Iterator<Integer> iterator=l.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		int total=0;
		for(Integer i :l){
			System.out.println("Value : "+i);
			total=total+i;
		}
		System.out.println("Total : "+total);
		
		
		
	}

}
