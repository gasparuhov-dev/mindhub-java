package org.mindhub.maven;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		Person p = Person.builder().name("Pesho").age(20).height(150).build();

		System.out.println(p.getName());
	}

}
