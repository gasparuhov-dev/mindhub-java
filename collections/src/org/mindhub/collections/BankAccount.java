package org.mindhub.collections;

import java.util.Objects;

public class BankAccount implements Comparable<BankAccount>{
	private double balance;

	public BankAccount() {

	}

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public void deposite(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount can't be equals or below zero");
		}
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount can't be equals or below zero");
		}

		if (balance - amount < 0) {
			throw new IllegalArgumentException("Not enough funds, current balance: " + balance);
		}
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	@Override
	public int compareTo(BankAccount bankAccount) {
		return Double.compare(balance, bankAccount.balance);
	}

	@Override
	public int hashCode() {
		return Objects.hash(balance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance);
	}
	
	

}
