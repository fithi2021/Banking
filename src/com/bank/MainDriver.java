package com.bank;

public class MainDriver {

	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount(3000,0.3);
		saving.addInterestToAccount();
		System.out.println(saving.getBalance());

	}

}
