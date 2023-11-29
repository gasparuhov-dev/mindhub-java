package org.midhub.exceptions;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		int b = 15;

		try {
			System.out.println(divide(a, b));
		} catch (DivisionByFiveException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		
		System.out.println("Good job!");

	}

	private static double divide(int a, int b) 
			throws DivisionByFiveException, DivisionByTenException {
		if (b == 5) {
			throw new DivisionByFiveException("Can't divide by 5");
		}
		
		if (b == 10) {
			throw new DivisionByTenException("Can't divide by 10");
		}
		
		if (b == 15) {
			throw new RuntimeException("Can't divide by 15");
		}
		return a / b;
	}

}
