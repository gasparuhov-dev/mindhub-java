package org.mindhub.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.mindhub.streams.Person.SEX;

public class Main {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(20, "Pesho", SEX.MALE));
		persons.add(new Person(38, "Tosho", SEX.MALE));
		persons.add(new Person(15, "Stefka", SEX.FEMALE));
		persons.add(new Person(19, "Tosho", SEX.MALE));
		persons.add(new Person(20, "Ginka", SEX.FEMALE));
//
//		List<Person> filter = filter(persons);
//		print(filter);
		// @formatter:off
		var result = persons
		.stream()
		.map(p -> {
			Person person = new Person(p.age, p.name, p.sex) {
				@Override
				public String toString() {
					return "Person [age=" + age + ", sex=" + sex + "]";
				}
			};
			return person;
			})
		.limit(3)
		.sorted((p1, p2) -> p2.age - p1.age)
		.collect(Collectors.groupingBy(p -> p.sex));
		
		print(result);
	}

	public static List<Person> filter(List<Person> persons) {
//		List<Person> filtered = new ArrayList<Person>();
//		for (Person p : persons) {
//			if (p.age > 25 && SEX.MALE.equals(p.sex)) {
//				filtered.add(p);
//			}
//		}
//
//		return filtered;

		// @formatter:off
		return persons
		.stream()
		.filter(p -> p.age > 25)
		.filter(p -> SEX.MALE.equals(p.sex))
		.collect(Collectors.toList());
		// @formatter:on
	}

	public static void print(List<Person> persons) {
		persons.forEach(p -> System.out.println(p));
	}

}
