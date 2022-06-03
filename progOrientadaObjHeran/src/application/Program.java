package application;

import entities.Account;


public class Program {

	public static void main(String[] args) {
		
		Account account = new Account(1001, "Jean", 1000.0);
		account.withdraw(200.0);
		System.out.println(account.getBalance());
		

	}

}
