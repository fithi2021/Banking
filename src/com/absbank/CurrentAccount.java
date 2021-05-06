package com.absbank;

import java.util.Scanner;

public class CurrentAccount extends Account {
	
	private double fee;
	private double overdraftLimit;
	
	//defualt Constrctor
	
	public CurrentAccount() {
		super();
		
	}
	
	
	public CurrentAccount(int accountNumber, double fee,double overdraftLimit) {
		super(accountNumber);
		this.fee = fee;
		this.overdraftLimit = overdraftLimit;
		
	}
	//Abstract method
	/*
	 * to deposit funds as long as the amount parameter > 0
	 * @param amount value to be deposit
	 */
	public void deposit(double amount) {
		//First check amount

		if(amount > 0) {
			this.balance += amount;
			System.out.printf("Amount %.2f deposited%n",amount);
			//Apply transaction fee
			this.balance-=fee;
			System.out.printf("Fee  %.2f applied%n",fee);
			System.out.printf("Current balance %.2f deposited%n",balance);
		}else {
			System.out.println("Negative amount cannot be deposited!");
		}
	}
	
	
	/*
	 * to withdraw fund from the Account as long as 
	 * the amount > 0 && amount < balance
	 */
	public void withdraw(double amount) {
		//check 
		if(amount > 0) {
			if((amount+fee) < balance) {
				System.out.printf("Amount of %.2f withdrawn from Account%n",amount);
				balance-=amount;
				balance-=fee;
				System.out.printf("Fee of %.2f applied%n",fee);
				System.out.printf("Current Balance is: %.2f%n",balance);
			}else {
				
				System.out.println("Negative amount is not allowed");
			
//				
			}
			
		}
		
	}
	



}
