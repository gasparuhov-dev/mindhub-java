package org.mindhub.inheritance;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Programming p = new Programming();
		Programming p2 = new Programming();

//		System.out.println(p.equals(p2));
		System.out.println(p);// Course: Java, hours: 0
		
		ArrayList<Programming> test = new ArrayList<Programming>();
		test.add(p);
		ProgrammingPredicate pred0 = new ProgrammingPredicate();
		Predicate<Programming> pred = new Predicate<Programming>() {
			
			@Override
			public boolean test(Programming t) {
				
				return t.hours > 10;
			}
		};
		
		test.removeIf(obj -> obj.hours > 10);
	}
	
	public static class ProgrammingPredicate implements Predicate<Programming>{

		@Override
		public boolean test(Programming t) {
			return t.hours > 10;
		}
		
	}

}
