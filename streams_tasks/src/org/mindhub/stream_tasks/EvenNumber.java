package org.mindhub.stream_tasks;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 6, 3, 5, 6, 8, 10);
		getEvenNumbers(list);
		String str = "adadsa, asdsad, asrqew, asdsad";
		String[] split = str.split(" ");
		for (var word : split) {
			System.out.println(word);
		}
	}

	public static List<Integer> getEvenNumbers(List<Integer> list) {
		return list.stream().filter(value -> value % 2 == 0).distinct().toList();
	}

	public static int getSum(List<Integer> list) {
		return list.stream().mapToInt(value -> value.intValue()).sum();
	}

	public static List<String> uniqueWords(String text) {
		return Arrays.stream(text.split(" ")).distinct().toList();
	}

	static class Person {
		int age;
		String name;
	}

}
