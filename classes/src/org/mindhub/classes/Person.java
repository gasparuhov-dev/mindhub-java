package org.mindhub.classes;

public class Person {
	private int age;
	private String name;
	private Adress adress;
	private Car car;

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public void changeAdress() {
		adress.city = "City changed";
	}

	public void changeCar() {
		car.colour = "Blue";
	}

	public static class Adress {
		private String country;
		private String city;
		private String street;
		private Person person;

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public void setPerson() {
			person.age = 20;
		}

		@Override
		public String toString() {
			return "Adress [country=" + country + ", city=" + city + ", street=" + street + "]";
		}
	}

	public class Car {
		private String colour;
		private String maker;
		private Person person;

		public void changePerson() {
			person.name = "Gosho";
		}
	}
}
