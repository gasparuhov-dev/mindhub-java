package org.mindhub.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		Couple<Integer, Integer> couple = new Couple<>();
//		couple.setKey(1);
//		couple.setValue(2);
//
//		Couple<Double, Double> douCouple = new Couple<>();
//		douCouple.setKey(20d);
//		douCouple.setValue(30d);

//		Couple<String, Integer> alphabet = new Couple<>();
//		alphabet.setKey("a");
//		alphabet.setValue(1);
//
//		Couple<String, Integer> couple = new Couple<>();
//		alphabet.setKey("a");
//		alphabet.setValue(1);
//
//		System.out.println(couple);
//		System.out.println(douCouple);
//		System.out.println(alphabet);
//
//		HashMap map;

		List<Integer> integers = new ArrayList<>();
		integers.add(153242343);
		integers.add(532423);
		integers.add(54325234);
		List<Double> doubles = new ArrayList<>();
		doubles.add(456574534d);
		doubles.add(3154353d);
		doubles.add(436434634d);
		List<Float> floats = new ArrayList<>();
		floats.add(645232423f);
		floats.add(5423424324f);
		floats.add(235235234f);

		List<Number> numbers = new ArrayList<>();
		numbers.addAll(integers);
		numbers.addAll(doubles);
		numbers.addAll(floats);

//		print(integers);
//		print(numbers);
//		print(doubles);
//		printD(doubles);

//		System.out.println(Main.<Double, String>test(3d));
		StringBuilder result = Main.test(4);
		result.append("Yohoo");
		System.out.println(result);
	}

//	public static void print(List<Number> list) {
//		for (var number : list) {
//			System.out.println(number.byteValue());
//		}
//	}

	public static void print(List<? super Integer> list) {
		for (var number : list) {
			System.out.println(number.toString());
		}
	}

	public static <T extends Number, R extends CharSequence> R test(T type) {
		return (R) type.toString();
	}

//	public static void printF(List<? super Bar> list) {
//		for (var number : list) {
//			System.out.println(number.);
//		}
//	}

	public static void printD(List<Double> list) {
		for (var number : list) {
			System.out.println(number.byteValue());
		}
	}

}
