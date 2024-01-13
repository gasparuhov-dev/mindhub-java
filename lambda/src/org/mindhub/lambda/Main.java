package org.mindhub.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import org.mindhub.lambda.Person.SEX;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(12);
		p.setName("Pesho");
		p.setSex(SEX.MALE);

		Person p1 = new Person();
		p1.setAge(18);
		p1.setName("Gosho");
		p1.setSex(SEX.MALE);

		Person p2 = new Person();
		p2.setAge(50);
		p2.setName("Tosho");
		p2.setSex(SEX.MALE);

		Person p3 = new Person();
		p3.setAge(14);
		p3.setName("Ivanka");
		p3.setSex(SEX.FEMALE);

		Person p4 = new Person();
		p4.setAge(40);
		p4.setName("Penka");
		p4.setSex(SEX.FEMALE);

		List<Person> persons = new ArrayList();
		persons.add(p);
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);

		Filter underage = new Filter() {

			@Override
			public boolean test(Person p) {
				return p.getAge() < 18;
			}
		};

		Filter adult = new Filter() {

			@Override
			public boolean test(Person p) {
				return p.getAge() > 18 && p.getAge() < 60;
			}
		};

		Filter military = new Filter() {

			@Override
			public boolean test(Person p) {
				return p.getAge() >= 18 && p.getAge() <= 40 && p.getSex() == SEX.MALE;
			}
		};

		Converter full = new Converter() {

			@Override
			public String convert(Person p) {
				return p.toString();
			}
		};

		Converter name = new Converter() {

			@Override
			public String convert(Person p) {
				return p.getName();
			}
		};

		Action print = new Action() {

			@Override
			public void process(String p) {
				System.out.println(p);

			}
		};

//		Action upperCase = new Action() {
//
//			@Override
//			public void process(String p) {
//				System.out.println(p.toUpperCase());
//
//			}
//		};

//		Action upperCase = (value) -> System.out.println(value.toUpperCase());
		Action upperCase = (value) -> System.out.println(value.toUpperCase());

//		(parameter) -> body
//		(a, b) -> body

		System.out.println("Underaged:");
//		filter(persons, 0, 18, null);
//		filter(persons, underage, full, print);
		filter(persons, underage, full, (value) -> System.out.println(value));
		System.out.println("Adult:");
//		filter(persons, 18, 60, null);
//		filter(persons, adult, full, upperCase);
		filter(persons, underage, full, (value) -> System.out.println(value.toUpperCase()));
		System.out.println("Military:");
//		filter(persons, 18, 40, SEX.MALE);
//		filter(persons, military, name, upperCase);
		filter(persons, military, (person) -> person.getName(), upperCase);
		System.out.println("tmp:");
		tmp(persons, null);
	}

//	public static void getUnderage(List<Person> persons, int age) {
//		for (Person person : persons) {
//			if (person.getAge() <= age) {
//				System.out.println(person);
//			}
//		}
//	}

	public static void tmp(List<Person> persons, SEX sex) {
		for (Person p : persons) {
			if (sex == p.getSex()) {
				System.out.println(p);
			}
		}
	}

//	public static void filter(List<Person> persons, int minimum, int maximum, SEX sex) {
//		for (Person person : persons) {
//			if (person.getAge() <= maximum && person.getAge() >= minimum
//					&& (sex == null || (sex != null && sex.equals(person.getSex())))) {
//				String value = person.getName();
//				System.out.println(value);
//			}
//		}
//	}

	public static void filter(List<Person> persons, Predicate<Person> filter, Function<Person, String> converter,
			Action action) {
		for (var person : persons) {
			if (filter.test(person)) {
				String value = converter.apply(person);
				action.process(value);
			}
		}
	}

	@FunctionalInterface
	interface Filter {
		boolean test(Person p);
	}

	interface Converter {
		String convert(Person p);
//		String test(Person p);
	}

	interface Action {
		void process(String p);
	}

}
