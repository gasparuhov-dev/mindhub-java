package org.mindhub.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Third");
		set.add("Forth");
		set.add("Forth");
		
//		for(String element : set) {
//			System.out.println(element);
//		}
		
		HashSet<BankAccount> bankAccounts = new HashSet<BankAccount>();
		bankAccounts.add(new BankAccount(5));
		bankAccounts.add(new BankAccount(10));
		bankAccounts.add(new BankAccount(15));
		bankAccounts.add(new BankAccount(5));
		
//		for(var element : bankAccounts) {
//			System.out.println(element);
//		}
		
//		bankAccounts.remove(new BankAccount(15));
		for(var element : bankAccounts) {
			System.out.println(element);
		}
		
		System.out.println("\n\n\n");
//		
//		Object[] array = bankAccounts.toArray();
//		BankAccount[] array2 = bankAccounts.toArray(new BankAccount[0]);
//		for(var element : array2) {
//			System.out.println(element);
//		}
//		
		LinkedHashSet<BankAccount> linked = new LinkedHashSet<BankAccount>();
		linked.add(new BankAccount(10));
		linked.add(new BankAccount(5));
		linked.add(new BankAccount(15));
		linked.add(new BankAccount(5));
		
		for(var element : linked) {
			System.out.println(element);
		}
		System.out.println("\n\n\n");
		
		TreeSet<BankAccount> tree = new TreeSet<BankAccount>();
		tree.add(new BankAccount(10));
		tree.add(new BankAccount(5));
		tree.add(new BankAccount(15));
		tree.add(new BankAccount(5));
		
		for(var element : tree) {
			System.out.println(element);
		}
	}
}
