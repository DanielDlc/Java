package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account account = new Account(1001, "Jean", 1000.0);
		account.withdraw(200.0);
		System.out.println(account.getBalance());
		
		System.out.println("-----------");
		
		SavingsAccount savingsAccount = new SavingsAccount(1002, "Diego", 1000.0, 0.01);
		savingsAccount.withdraw(200);
		System.out.println(savingsAccount.getBalance());
		
		System.out.println("-----------");
		
		BusinessAccount businessAccount = new BusinessAccount(1003, "Rodrigo", 1000.0, 500.0);
		businessAccount.withdraw(200.0);
		System.out.println(businessAccount.getBalance());
	}

}
