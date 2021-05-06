package com.bank;

public class SavingAccount implements Account{
	
	private double balance;
	private double interest;
	
	public SavingAccount() {
		System.out.println("SavingAccount object costructed!");
	}
	
	
	public SavingAccount(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
	}
	
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if(amount > 0) {
			this.balance+=amount;
			System.out.println("you balance "+balance);
		}else {
			System.out.println("Negative balance is not allowed");
		}
		
		
	}


	public void withdraw(double amount) {
		if(amount > 0) {
			if(balance > amount) {
				this.balance -= amount;
		}else {
			System.out.println("you have insufficient amount");
		}
				
			
		}else {
			System.out.println("Negative withdraw is not allowed");
		}
		
	}
	
	public double calculateInt() {
		return interest * balance;
	}
	
	public void addInterestToAccount() {
		double interest = calculateInt();
		deposit(interest);
		
	}
	
	

}
