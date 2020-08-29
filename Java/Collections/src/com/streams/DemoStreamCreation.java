package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStreamCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream=Stream.of("Mango","Papaya","Banana","Orange");
		Stream<Integer> stream2=Stream.of(12,23,34,45,56);
		
		List<String> list=Arrays.asList("Mango","Pap","Ban","Orange");
		Stream<String> streamList=list.stream();
		
		streamList.forEach((fruit_names)->{
			System.out.println("Fruits : "+fruit_names);
		});
		
		System.out.println("Using Method reference");
		//streams are not reusable
		//streamList.forEach(System.out::println);
		list.stream().forEach(System.out::println);
		
		long count=list.stream().count();
		System.out.println("count : "+count);
		
		count=list.stream().filter((name)->{
			return name.startsWith("M");
			}).count();
		System.out.println("Elements starting with M : "+count);
		
		count=list.stream().filter((name)->{
			return name.length()>=4;
		}).count();
		
		System.out.println("Elements length greater than 4 : "+count);
		
		System.out.println("For eachhhhhh");
		list.forEach(System.out::println);
		
		
		/*count=list.stream().filter((name)->{
			return name.length()>=4;
		}).collect(Collectors.toList());*/
		list.stream().filter((name)->{
			return name.length()<=4;
		}).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println(list);
		list.stream().map((name)->{return name.toUpperCase();}).forEach(System.out::println);
		
		System.out.println(list);
	}

}
