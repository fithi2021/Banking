package com.absbank;

public class SavingAccount extends Account {

	private double interestRate;

	public SavingAccount() {
		super();
	}

	public SavingAccount(int accountNum, double interestRate) {
		super(accountNum);
		this.interestRate = interestRate;

	}

	// Abstract method
	/*
	 * to deposit funds as long as the amount parameter > 0
	 * 
	 * @param amount value to be deposit
	 */
	public void deposit(double amount) {
		// First check amount
		if (amount > 0) {
			this.balance += amount;
			System.out.printf("Amount %.2f deposited%n", amount);
			System.out.printf("Current balance %.2f deposited%n", balance);
		} else {
			System.out.println("Negative amount cannot be deposited!");
		}
	}

	/*
	 * to withdraw fund from the Account as long as the amount > 0 && amount <
	 * balance
	 */
	public void withdraw(double amount) {
		// check
		if (amount > 0) {
			if (amount < balance) {
				System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
				balance -= amount;
				System.out.printf("Current Balance is: %.2f%n", balance);
			} else {

				System.out.println("Negative amount is not Allowed");
			}

		}

	}

	public double calculateInterest() {
		return balance * interestRate;

	}

	public void applyInterest() {
		double interest = calculateInterest();
		deposit(interest);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
