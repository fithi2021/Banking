package com.absbank;

public abstract class Account {
	//account number
	private int accountNumber;
	
	
	//Balance, protected accessor to accesse from child class with out problem, it can be change to private
	protected double balance;
	
	//Defualt constructor
	public Account() {
		
	}
	
	public Account (int accountNumber) {
		this.accountNumber = accountNumber;
		balance = 0;
		
	}
	
	//Getter method, 
	public double getBalance() {
		return this.balance;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	//Abstract method
	/*
	 * to deposit funds as long as the amount parameter > 0
	 * @param amount value to be deposit
	 */
	public abstract void deposit(double amount);		
	
	/*
	 * to withdraw fund from the Account as long as 
	 * the amount > 0 && amount < balance
	 */
	public abstract void withdraw(double amount);

}
