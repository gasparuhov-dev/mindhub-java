package org.mindhub.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		List<BankAccount> arrayList = new ArrayList<BankAccount>();
		List<BankAccount> linkedList = new LinkedList<BankAccount>();
		BankAccount b = new BankAccount(5);
		arrayList.add(new BankAccount(10));
		arrayList.add(new BankAccount());
		arrayList.add(b);

		Comparator<BankAccount> comparator = new Comparator<BankAccount>() {

			@Override
			public int compare(BankAccount ba1, BankAccount ba2) {
				return -Double.compare(ba1.getBalance(), ba2.getBalance());
			}
		};

//		arrayList.sort(comparator);
		Collections.sort(arrayList, comparator);
		Collections.sort(arrayList);

		printWithIterator(arrayList);
//		
//		for(int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}
//		
//		System.out.println("Added elements");

//		arrayList.remove(0);
//		arrayList.remove(b);
//		
//		printList(arrayList);
//		System.out.println("removed");
//		arrayList.clear();
//		
//		printList(arrayList);
//		
//		System.out.println("cleared");

//		System.out.println("Contains empty: " + arrayList.contains(new BankAccount()));
//		System.out.println("Contains b: " + arrayList.contains(b));
//		
//		System.out.println("Index of b: " + arrayList.indexOf(b));
	}

	public List<BankAccount> getCustomerAccouts(int customerId) {
		return Collections.emptyList();
	}

	public static void printList(List<BankAccount> list) {
		for (BankAccount bankAccount : list) {
			System.out.println(bankAccount);
		}
	}

	public static void printWithIterator(List<BankAccount> list) {
		Iterator<BankAccount> iterator = list.iterator();

		try {
			while (true) {
				System.out.println(iterator.next());
			}
		} catch (NoSuchElementException ex) {
			System.out.println("Too much, that is enough!");
		}
	}

}
