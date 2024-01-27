package org.mindhub.streams;

public class Person {
	public int age;
	public String name;
	public SEX sex;

	public Person(int age, String name, SEX sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	public static enum SEX {
		MALE, FEMALE
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}

}
