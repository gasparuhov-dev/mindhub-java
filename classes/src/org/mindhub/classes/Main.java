package org.mindhub.classes;

import org.mindhub.classes.Person.Adress;
import org.mindhub.classes.Person.Car;

public class Main {

	private static final int TEST_VALUE = 10;

	/*
	 * argument: String re
	 */
	public static void main(String[] args) {
		Person p = new Person(12, "Pesho");
		Adress a = new Adress();
		a.setCity("City");
		p.setAdress(a);
		System.out.println(p.getAdress());

		Car car = p.new Car();

//		Test test = new Test();

		Player fp = new FootballPlayer();
		fp.play();
		Player basketballPlayer = new Player() {

			private int age = 10;

			@Override
			public void play() {
				System.out.println("I am playing basketball! And I am " + age + " years old :)");

			}
		};
		basketballPlayer.play();
		Player englishFootballPlayer = new FootballPlayer() {
			private String footballType = "english";

			@Override
			public void play() {
				System.out.println("I am playing" + footballType + " football!");
			}

			public void stop() {

			}
		};

		englishFootballPlayer.play();
	}

	public void test() {
		Person p = new Person(12, "Pesho");
		if (p.getAge() > 0) {
			class Test {
				private String value;

				public String getValue() {
					return value;
				}

				public void setValue(String value) {
					this.value = "" + TEST_VALUE;
				}
			}

			Test t = new Test();
			t.setValue("value");
			System.out.println(t.getValue());
		}
	}

}
