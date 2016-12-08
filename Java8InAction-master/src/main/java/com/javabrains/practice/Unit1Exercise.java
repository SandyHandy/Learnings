package com.javabrains.practice;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Unit1Exercise {
	

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		//Step 1: Sort list by Lastname
		System.out.println("Sort list by Lastname");
		people.stream().map(per->per.getLastName()).sorted().collect(toList()).forEach(System.out::println);
		
		
		//Step 2: create a method that print all the elements in the list
		System.out.println("Print all the elements in the list");
		printAllList(people);
		
		//Step 3: Create a method that prints all the people that have last name beginning with C
		System.out.println("Print all the elements in the list with Name C");
		printAllListC(people);
	}
	
	public static <T> void printAllList(List<T> people){
		people.stream().collect(toList()).forEach(System.out::println);
	}
	
	public static <T> void printAllListC(List<? extends Person> people){
		people.stream().filter(p->p.getLastName().startsWith("C", 0)).collect(toList()).forEach(System.out::println);
	}

}

