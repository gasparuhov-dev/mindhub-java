package org.midhub.exceptions;

public class BankAccount {
	private double balance;
	
	public void deposite(double amount) {
		if(amount <= 0) {
			throw new 
			IllegalArgumentException("Amount can't be equals or below zero");
		}
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount <= 0) {
			throw new 
			IllegalArgumentException("Amount can't be equals or below zero");
		}
		
		if(balance - amount < 0) {
			throw new 
			InsuficientFundsException("Not enough funds, current balance: " + balance);
		}
		balance -= amount;
	}

}
