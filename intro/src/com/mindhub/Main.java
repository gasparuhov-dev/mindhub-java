package com.mindhub;

public class Main {

//	private static String test; //null
//	private static int a; //0
//	private static int b = 5; //5

	public static void main(String[] args) {
//		
//		int a = 'X';
//		double b = 3.4d;
//		float c = 3.5f;
//		char d = 120;
//		boolean e = true;
//		long f = 120;
//		short g = 12;
//		
//		System.out.println(a);
//		System.out.println(d);
////		System.out.println(b);
//		
//		
//		
////		String array[] = new String[10];
////		System.out.println("args size: " + args.length);
////		System.out.println("parameter: " + args[1]);
////		System.out.println("Hello World!");
//		int r;// deklaraciq
//		int a = 5; // definiciq
//		int b = 6;
//		int c = a;
//		r = 3;
//		a = r;
//		a = b;
//		b = c;
//
//		if (test()) {
//			System.out.println("true");
//		} else if (b == 4) {
//			System.out.println("b is equal to 4");
//		} else {
//			System.out.println("else");
//		}
//
//		int i = 0;
//		for(;;) {
//			System.out.println(i);
//			i++;
////			break;
//			continue;
//		}
//
//		while (b == 3) {
//			b = 4;
//		}
//
//		do {
//
//		} while (b != 5);
//
//		int arr[] = {1, 2, 3, 4, 5 };
//		int arr2[][] = {{1, 2, 3}, {2}, {3}, {4}, {5}};
//
//		for (int z : arr) {
//			System.out.println(z);
//		}
//
//		for (int z = 0; z < arr.length; z++) {
//			System.out.println(arr[z]);
//		}
//
//		System.out.println(a + " " + b);

//		String firstName = "Georgi";
//		String lastName = "Asparuhov";
//		String fullname = firstName + lastName;
//		String fullname2 = firstName.concat(lastName);
//
//		int a = 5;
//		String test = firstName.concat("" + a);
//
//		System.out.println(firstName);
//		System.out.println(fullname2);
//		
//		System.out.println(compress("aabccccddabr")); // 2ab4c2dabr
//		double d = 0.0000000045d;
//		System.out.println(d);

//		int a = 3;
//		int b = a++;
//		int c = ++a;

//		System.out.printf("a:%d b:%s, c:%d", a, b, c);

//		int a = 7;
//		a = a >> 2;
//		a = a << 2;

//		00000001
//		00000010
//		00000011
//		00000100
//		00000111

//		System.out.println(a);
	}

	public static String compress(String value) {
		String result = "";
		char current = value.charAt(0);
		int counter = 0;
		for (int i = 0; i < value.length(); i++) {
			char charAt = value.charAt(i);
			if (current == charAt) {
				counter++;
			} else {
				if (counter == 1) {
					result += current;
					current = charAt;
					counter = 1;
				} else {
					result += "" + counter + current;
					current = charAt;
					counter = 1;
				}
			}
		}

		if (counter == 1) {
			result += "" + current;
		} else {
			result += "" + counter + current;
		}

		return result;
	}

//	public static boolean test() {
//		String name = "Georgi";
//		String name2 = new String("Georgi");
//		String name3 = "Georgi";
//
//		if (name == name3) {
//
//		} else {
//			System.out.println("strings are not equal");
//		}
//
//		String result = name.equals(name3) ? "equals" : "not equals";
//
//		for (char c : result.toCharArray()) {
//
//		}
//
//		char current = result.charAt(0);
//		for (int i = 0; i < result.length(); i++) {
//			char charAt = result.charAt(i);
//		}
//
//		String str = "aabccccddabr";// "kmmneessppppp"
//		String str2 = "2ab4c2dabr";
//
//		return result.isEmpty();
//	}

}
