package org.mindhub.lambda;

public class Calculator {

	public static void main(String[] args) {

		Action add = (a, b) -> a + b;
		Action minus = (a, b) -> a - b;
		Action multiply = (a, b) -> {
			test();
			System.out.println("Will be multiplying!");
			return a * b;
		};

		double a = 10;
		double b = 5;

		calculate(a, b, add);
		calculate(a, b, minus);
		calculate(a, b, multiply);
		calculate(a, b, (aa, bb) -> aa / bb);

	}

	public static void test() {
		System.out.println("testing");
	}

	public static void calculate(double a, double b, Action action) {
		System.out.println(action.perform(a, b));
	}

	public interface Action {
		double perform(double a, double b);
	}

}
